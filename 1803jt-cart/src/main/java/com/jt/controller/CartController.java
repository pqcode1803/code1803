package com.jt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.common.vo.SysResult;
import com.jt.pojo.Cart;
import com.jt.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartService cartService;

	@RequestMapping("/query/{userId}")
	public SysResult myCart(@PathVariable Integer userId) {
		try {
			List<Cart> myCart = cartService.myCart(userId);
			return SysResult.ok(myCart);
		} catch (Exception e) {
			e.printStackTrace();
			return SysResult.build(201, "查询失败");
		}
	}

	@RequestMapping("/save")
	public SysResult save(Cart cart) {
		return cartService.save(cart);
	}

	@RequestMapping("/update/num/{userId}/{itemId}/{num}")
	public SysResult updateNum(Cart cart) {
		try {
			cartService.updateNum(cart);
			return SysResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return SysResult.build(201, "商品更新失败");
		}
	}

	@RequestMapping("/delete/{userId}/{itemId}")
	public SysResult deleteCart(@PathVariable Integer userId, @PathVariable Integer itemId) {
		try {
			cartService.deleteCart(userId, itemId);
			return SysResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return SysResult.build(201, "商品删除失败");
		}
	}
}
