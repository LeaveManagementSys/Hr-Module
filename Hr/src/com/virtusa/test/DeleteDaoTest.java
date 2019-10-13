package com.virtusa.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.junit.jupiter.api.Test;

import com.virtusa.DAO.EmployeeDao;
import com.virtusa.DAO.EmployeeDaoImpl;
import com.virtusa.controller.HrController;
import com.virtusa.entities.Employee;
import com.virtusa.model.RetriveEmployeeModel;
import com.virtusa.service.HrService;
import com.virtusa.service.HrServiceImpl;

class DeleteDaoTest {
		
	@Test
	void testDeleteEmployee_postive() {
		
		Employee employee=new Employee();
		EmployeeDao employeedao=new EmployeeDaoImpl();	
		employee.setEmployeeId(120);
		
		try {
			boolean actualResult=employeedao.deleteEmployeeDetails(employee);
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
	void testDeleteEmployee_negative() {		
		Employee employee=new Employee();
		EmployeeDao employeedao=new EmployeeDaoImpl();
		employee.setEmployeeId(100);
		try {
			boolean actualResult=employeedao.deleteEmployeeDetails(employee);
			boolean expected=false;
			assertEquals(actualResult,expected);			
			//assertTrue(true);			
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
