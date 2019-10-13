package com.virtusa.DAO;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.entities.Employee;
import com.virtusa.entities.Jobs;


public interface EmployeeDao {

	public List<Employee> getAllEmployees()throws ClassNotFoundException, SQLException;
	public List<Jobs> getDesignation()throws ClassNotFoundException, SQLException;
	public boolean storeEmployeeDetails(Employee employee)throws ClassNotFoundException, SQLException;
	public boolean updateEmployeeSalary(Employee employee)throws ClassNotFoundException, SQLException;
	public boolean deleteEmployeeDetails(Employee employee)throws ClassNotFoundException, SQLException;
	public boolean updateEmployeePhoneNumber(Employee employee)throws ClassNotFoundException, SQLException;
	public boolean updateEmployeeDesignation(Employee employee)throws ClassNotFoundException, SQLException;

}
