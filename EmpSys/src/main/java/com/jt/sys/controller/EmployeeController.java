package com.jt.sys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jt.sys.bean.Employee;
import com.jt.sys.service.EmployeeService;

@Controller
@RequestMapping("/Emp")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/queryAll")
	@ResponseBody
	public ModelAndView queryAll(Employee employee) {
		List<Employee> list = employeeService.queryAll(employee);
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("records", list);
		return mv;
	}

}
