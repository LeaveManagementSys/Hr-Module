package com.virtusa.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.virtusa.DAO.EmployeeDao;
import com.virtusa.DAO.EmployeeDaoImpl;
import com.virtusa.entities.Employee;

class UpdateDesignationDaoTest {

	@Test
	void updateEmployeeDesignationtest_postive() {
		
		Employee employee=new Employee();
		EmployeeDao employeedao=new EmployeeDaoImpl();	
		employee.setEmployeeId(103);
		employee.setDesignation("engineer");
		try {
			boolean actualResult=employeedao.updateEmployeeDesignation(employee);
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
	void updateEmployeeDesignationtest_negative() {
		
		Employee employee=new Employee();
		EmployeeDao employeedao=new EmployeeDaoImpl();	
		employee.setEmployeeId(100);
		employee.setDesignation("engineer");
		try {
			boolean actualResult=employeedao.updateEmployeeDesignation(employee);
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
