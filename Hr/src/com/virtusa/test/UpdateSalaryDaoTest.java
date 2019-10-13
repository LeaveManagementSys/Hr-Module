package com.virtusa.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.virtusa.DAO.EmployeeDao;
import com.virtusa.DAO.EmployeeDaoImpl;
import com.virtusa.entities.Employee;

class UpdateSalaryDaoTest {
	@Test
	void SalaryUpdateTest_postive() {
		
		Employee employee=new Employee();
		EmployeeDao employeedao=new EmployeeDaoImpl();	
		employee.setEmployeeId(109);
		employee.setSalary(32000);
		try {
			boolean actualResult=employeedao.updateEmployeeSalary(employee);
			boolean expected=true;
			assertEquals(actualResult,expected);			
		} catch (ClassNotFoundException e) {
			assertTrue(true);
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			assertTrue(true);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	@Test
	void SalaryUpdateTest_negative() {
		
		Employee employee=new Employee();
		EmployeeDao employeedao=new EmployeeDaoImpl();	
		employee.setEmployeeId(100);
		employee.setSalary(32000);
		try {
			boolean actualResult=employeedao.updateEmployeeSalary(employee);
			boolean expected=false;
			assertEquals(actualResult,expected);			
		} catch (ClassNotFoundException e) {
			assertTrue(true);
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			assertTrue(true);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
}
