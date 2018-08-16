package com.jt.sys.service;

import java.util.List;

import com.jt.sys.bean.Employee;

public interface EmployeeService {

	List<Employee> queryAll(Employee employee);
}
