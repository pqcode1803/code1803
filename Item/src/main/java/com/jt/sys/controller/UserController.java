package com.jt.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jt.sys.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping()
	public String findUser(String username) {
		Integer count = userService.findCheckUser(username);
		if (count != 0) {
			return "用户名重复";
		}
		return "redirect:/index.jsp";
	}
}
