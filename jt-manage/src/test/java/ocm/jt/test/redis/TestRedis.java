package ocm.jt.test.redis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisSentinelPool;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

public class TestRedis {

	/**
	 * 1.实例化jedis对象(IP:端口)
	 * 2.实现redis取值赋值操作
	 */
	//@Test
	public void test01() {
		Jedis redis = new Jedis("192.168.83.134", 6379);
		redis.set("name", "tomcat猫");
		System.out.println("获取redis数据: "+redis.get("name"));
		
	}
	
	//测试redis分片,实现redis内存动态扩容
	//@Test
	public void test02() {
		//定义redis池的配置文件
		JedisPoolConfig poolConfig = new JedisPoolConfig();
		poolConfig.setMaxTotal(1000);
		poolConfig.setMaxIdle(200);
		poolConfig.setMinIdle(10);
		poolConfig.setTestOnBorrow(true);
		
		//定义jedis分片 的节点信息
		List<JedisShardInfo> shards = new ArrayList<>();
		shards.add(new JedisShardInfo("192.168.83.134", 6379));
		shards.add(new JedisShardInfo("192.168.83.134", 6380));
		shards.add(new JedisShardInfo("192.168.83.134", 6381));
		
		ShardedJedisPool jedisPool = new ShardedJedisPool(poolConfig, shards);
		ShardedJedis shardedJedis = jedisPool.getResource();
		shardedJedis.set("name", "我是redis的分片");
		System.out.println("获取redis信息: "+shardedJedis.get("name"));
		
	}
	
	
	
	//实现哨兵的测试
	//@Test
	public void test03() {
		//定义哨兵的连接池
		Set<String> sentinels = new HashSet<String>();
		System.out.println(new HostAndPort("192.168.83.134", 26379).toString());
		sentinels.add("192.168.83.134:26379");
		sentinels.add("192.168.83.134:26380");
		sentinels.add("192.168.83.134:26381");
		JedisSentinelPool sentinelPool = new JedisSentinelPool("mymaster", sentinels);
		Jedis jedis = sentinelPool.getResource();
		jedis.set("name", "我是哨兵的redis");
		System.out.println("获取redis数据: "+jedis.get("name"));
		
	}
	
	/**
	 * 步骤:
	 * 1.redis的节点3主6从9个节点
	 * 2.每个节点需要通过Ip:端口的形式进行连接
	 * 3.创建集群的间接对象API调用
	 */
	@Test
	public void testCluster() {
		//定义集群的集合
		String host = "192.168.83.134";
		Set<HostAndPort> nodes = new HashSet<>();
		nodes.add(new HostAndPort(host, 7000));
		nodes.add(new HostAndPort(host, 7001));
		nodes.add(new HostAndPort(host, 7002));
		nodes.add(new HostAndPort(host, 7003));
		nodes.add(new HostAndPort(host, 7004));
		nodes.add(new HostAndPort(host, 7005));
		nodes.add(new HostAndPort(host, 7006));
		nodes.add(new HostAndPort(host, 7007));
		nodes.add(new HostAndPort(host, 7008));
		JedisCluster jc = new JedisCluster(nodes);
		
		jc.set("1803", "集群搭建完成");
		System.out.println("获取数据: "+jc.get("1803"));

	}
	
	
	
	
}
