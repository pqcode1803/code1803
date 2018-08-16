package com.jt.rabbit.test;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.ConsumerCancelledException;
import com.rabbitmq.client.QueueingConsumer;
import com.rabbitmq.client.ShutdownSignalException;

public class Test_2_work {
	
	private Connection connection;
	private String queueName = "work";	
	
	@Before  //表示在执行@Test注解之前执行该操作
	public void init() throws IOException{
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("192.168.126.172");
		factory.setPort(5672);
		factory.setUsername("jtadmin");
		factory.setPassword("jtadmin");
		factory.setVirtualHost("/jt");
		connection = factory.newConnection();
	}
	
	@Test
	public void provider() throws IOException{
		Channel channel = connection.createChannel();
		channel.queueDeclare(queueName, false, false, false, null);
		String msg = "我是工作模式";
		channel.basicPublish("", queueName, null, msg.getBytes());
		System.out.println("消息队列执行成功!!!!");
	}
	
	//定义消费者
	@Test
	public void consumer1() throws IOException, ShutdownSignalException, ConsumerCancelledException, InterruptedException{
		//定义通道
		Channel channel = connection.createChannel();
		//定义队列
		channel.queueDeclare(queueName, false, false, false, null);
		
		//定义消费数  每次只能消费一条记录.当消息执行后需要返回ack确认消息 才能执行下一条
		channel.basicQos(1);
		
		//定义消费者
		QueueingConsumer consumer = new QueueingConsumer(channel);
		
		//将队列和消费者绑定  false表示手动返回ack
		channel.basicConsume(queueName, false, consumer);
		while(true){
			QueueingConsumer.Delivery delivery = consumer.nextDelivery();
			String msg = new String(delivery.getBody());
			System.out.println("队列A获取消息:"+msg);
			//deliveryTag 队列下标位置
			//multiple是否批量返回
			channel.basicAck(delivery.getEnvelope().getDeliveryTag(),true);
		}
	}
	
	@Test
	public void consumer2() throws IOException, ShutdownSignalException, ConsumerCancelledException, InterruptedException{
		//定义通道
		Channel channel = connection.createChannel();
		//定义队列
		channel.queueDeclare(queueName, false, false, false, null);
		
		//定义消费数  每次只能消费一条记录.当消息执行后需要返回ack确认消息 才能执行下一条
		channel.basicQos(1);
		
		//定义消费者
		QueueingConsumer consumer = new QueueingConsumer(channel);
		
		//将队列和消费者绑定  false表示手动返回ack
		channel.basicConsume(queueName, false, consumer);
		while(true){
			QueueingConsumer.Delivery delivery = consumer.nextDelivery();
			String msg = new String(delivery.getBody());
			System.out.println("队列B获取消息:"+msg);
			//deliveryTag 队列下标位置
			//multiple是否批量返回
			channel.basicAck(delivery.getEnvelope().getDeliveryTag(),true);
		}
	}
	
	
}
