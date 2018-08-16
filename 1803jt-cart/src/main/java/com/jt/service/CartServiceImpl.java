package com.jt.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.jt.common.vo.SysResult;
import com.jt.mapper.CartMapper;
import com.jt.pojo.Cart;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartMapper cartMapper;

	public List<Cart> myCart(Integer userId) {

		EntityWrapper<Cart> ew = new EntityWrapper<Cart>();

		// {0} 占位符,序号从0开始编
		ew.where("user_id={0}", userId);

		// 设置where条件,新的方式QBC,新的查询方式,把查询条件封装到QBC对象中
		List<Cart> selectList = cartMapper.selectList(ew);

		return selectList;
	}

	// 保存商品到购物车
	public SysResult save(Cart cart) {
		try {
			EntityWrapper<Cart> ew = new EntityWrapper<Cart>();
			Cart param = new Cart();
			param.setUserId(cart.getId());
			param.setItemId(cart.getItemId());
			cart.setCreated(new Date());
			cart.setUpdated(cart.getCreated());
			Cart oldCart = cartMapper.selectOne(param);
			if (oldCart == null) {
				cartMapper.insert(cart);
				return SysResult.ok();
			} else {
				cart.setNum(oldCart.getNum() + cart.getNum());
				ew.where("user_id={0}", cart.getUserId());
				ew.where("item_id={0}", cart.getItemId());
				cartMapper.update(cart, ew);
				return SysResult.build(202, "此商品已存在");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return SysResult.build(201, "错误操作");
		}
	}

	public void updateNum(Cart cart) {
		EntityWrapper<Cart> ew = new EntityWrapper<Cart>();
		ew.where("user_id={0}", cart.getUserId());
		ew.and("item_id={0}", cart.getItemId());
		cartMapper.update(cart, ew);
	}

	public void deleteCart(Integer userId, Integer itemId) {
		EntityWrapper<Cart> ew = new EntityWrapper<Cart>();
		ew.where("user_id", userId);
		ew.and("item_id={0}", itemId);
		cartMapper.delete(ew);
	}

}
