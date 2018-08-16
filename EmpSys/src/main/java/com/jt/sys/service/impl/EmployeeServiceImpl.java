package com.jt.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jt.sys.bean.Employee;
import com.jt.sys.dao.EmployeeDao;
import com.jt.sys.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public List<Employee> queryAll(Employee employee) {
		return employeeDao.queryAll(employee);
	}

}
