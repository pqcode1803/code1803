package com.jt.sys.dao;

import java.util.List;

import com.jt.sys.bean.Employee;

public interface EmployeeDao {

	List<Employee> queryAll(Employee employee);
}
