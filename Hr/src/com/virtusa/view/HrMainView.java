package com.virtusa.view;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


import com.virtusa.controller.HrController;
import com.virtusa.entities.Jobs;
import com.virtusa.exception.ValidationException;
import com.virtusa.model.UpdateEmployeeSalaryModel;
import com.virtusa.model.InsertEmployeeModel;
import com.virtusa.model.RetriveEmployeeDesignationModel;
import com.virtusa.model.RetriveEmployeeModel;
import com.virtusa.model.UpdateEmpPhoneNumberModel;
import com.virtusa.model.UpdateEmployeeDesignationModel;
import com.virtusa.validation.EmployeeModelValidation;



public class HrMainView {
	
	public void hrMainView()
	{
		
		System.out.println("\n");
		System.out.println("\t \t ========Main Menu========");
		System.out.println("=>1. Register Employee");
		System.out.println("=>2. update Employee Details");
		System.out.println("=>3. Delete Employee");
		System.out.println("=>4. Exit");
		
		
try(Scanner scanner=new Scanner(System.in);){
			
			System.out.print("\nOption:");
			int option=scanner.nextInt();
			
			switch(option) {
			
			case 1:insertEmployee();
			       break;
			       
			case 2: System.out.println("Choose option to update");
				   System.out.println("1.update employee salary");
			       System.out.println("2.update employee phonenumber");
			       System.out.println("3.update employee designation");
				
			       System.out.print("\nChoose Option:");
					int opt=scanner.nextInt();
			       switch(opt)
			       {
			       
			       case 1: updateEmployeeSalary();
				           break;
			       case 2: updateEmployeePhoneNumber();
			               break;
			       case 3: updateEmployeeDesignation();
			               break;
			       default:System.out.println("!ERROR[SELECT APPROPRIATE OPTION]");
					hrMainView();
			       
			       }
			      break;
				   
			case 3:deleteEmployee();
				   break;
				   
			case 4:System.exit(0);
				   break;
			   
			default:System.out.println("!ERROR[SELECT APPROPRIATE OPTION]");
			hrMainView();
				  
			}
			
		}catch(Exception e) {
			
			System.out.println("!ERROR[SELECT APPROPRIATE OPTION]");
		}
		
	} //end of main method
		
		public void insertEmployee()
		{

			try(Scanner scanner=new Scanner(System.in);){
				
				
				int employeeId=0;	
				System.out.print("Employee Id:");
				if(scanner.hasNextInt()) {

;
					}
					else {
						try {
							throw new ValidationException("[!ERROR:Invalid Employee Id]");
							}catch(ValidationException e) {
								System.out.println(e.getMessage());
								hrMainView();
							}
					}
			
				
				EmployeeModelValidation validator=new EmployeeModelValidation();
				
				System.out.print("First Name:");
				String firstName=scanner.next();
				
				
				boolean validfirstName=validator.validString(firstName);
				if(!validfirstName)
					try {
					throw new ValidationException("[!ERROR:Invalid First Name]");
					}catch(ValidationException e) {
						System.out.println(e.getMessage());
						hrMainView();
					}	
				
				
				System.out.print("Last Name:");
				String lastName=scanner.next();
				
				boolean validLastName=validator.validString(lastName);
				if(!validLastName)
					try {
					throw new ValidationException("[!ERROR:Invalid Last Name]");
					}catch(ValidationException e) {
						System.out.println(e.getMessage());
						hrMainView();
					}
				
				System.out.print("Email:");
				String email=scanner.next();

				boolean validemail=validator.validEmail(email);
				if(!validemail)
					try {
					throw new ValidationException("!ERROR:Invalid Email");
					}catch(ValidationException e) {
						System.out.println(e.getMessage());
						hrMainView();
					}
				
						
				System.out.print("PhoneNumber :");
				String phoneNumber=scanner.next();
				
				boolean validPhoneNumber=validator.validPhoneNum(phoneNumber);
				if(!validPhoneNumber)
					try {
						throw new ValidationException("[!ERROR:Invalid phone number]");
					}catch(ValidationException e)
				{
						System.out.println(e.getMessage());
						hrMainView();	
				}
				
				System.out.print("Hire Date(DD/MM/YYYY):");
				String hireDateString=scanner.next();
				
				StringTokenizer tokens=new StringTokenizer(hireDateString,"/");
				
				List<String> tokensList=new ArrayList<>();
				while(tokens.hasMoreTokens()) {
					tokensList.add(tokens.nextToken());
				}
				
				int dayOfMonth=Integer.parseInt(tokensList.get(0));
				int month=Integer.parseInt(tokensList.get(1));
				int year=Integer.parseInt(tokensList.get(2));
				
				LocalDate hireDate=LocalDate.of(year, month, dayOfMonth);
				
				boolean validDate=validator.validDate(hireDate);
				if(!validDate)
					try {
					throw new ValidationException("[!ERROR:Invalid Date,please enter valid date after 16/08/2016]");
					}catch(ValidationException e) {
						System.out.println(e.getMessage());
						hrMainView();
					}				
				 System.out.print("DateofBirth(DD/MM/YYYY):");
                 String dateOfBirthString=scanner.next();
				
				StringTokenizer token=new StringTokenizer(dateOfBirthString,"/");
				
				List<String> tokenListDob=new ArrayList<>();
				while(token.hasMoreTokens()) {
					tokenListDob.add(token.nextToken());
				}
				int dateOfMonth=Integer.parseInt(tokenListDob.get(0));
				int monthOfDob=Integer.parseInt(tokenListDob.get(1));
				int yearOfDob=Integer.parseInt(tokenListDob.get(2));				
				LocalDate dateOfBirth=LocalDate.of(yearOfDob, monthOfDob, dateOfMonth);
				boolean validDob=validator.validDob(dateOfBirth);
				if(!validDob)
					try {
					throw new ValidationException("[!ERROR:Age must be above 18 years]");
					}catch(ValidationException e) {
						System.out.println(e.getMessage());
						hrMainView();
					}			
				System.out.print("joblocation");
				String jobLocation=scanner.next();				
				System.out.print("Salary:");
				double salary=scanner.nextDouble();	
				boolean validsalary=validator.validSalary(salary);
				if(!validsalary)
					try {
					throw new ValidationException("[!ERROR:Invalid Salary]");
					}catch(ValidationException e) {
						System.out.println(e.getMessage());
						hrMainView();
					}
				
				System.out.print("designation: ");			
				HrController hrcontrollerdesig=new HrController();	
				hrcontrollerdesig.handleDesignationList();
				String designation=scanner.next();			
				HrController hrcontroller=new HrController();					
				InsertEmployeeModel insertemployeemodel=new InsertEmployeeModel();
				insertemployeemodel.setEmployeeId(employeeId);
				insertemployeemodel.setFirstName(firstName);
				insertemployeemodel.setLastName(lastName);
				insertemployeemodel.setEmail(email);
				insertemployeemodel.setPhoneNumber(phoneNumber);
				insertemployeemodel.setHireDate(hireDate);
				insertemployeemodel.setSalary(salary);
				insertemployeemodel.setDateOfBirth(dateOfBirth);
				insertemployeemodel.setJobLocation(jobLocation);
				insertemployeemodel.setDesignation(designation);
			     hrcontroller.performInsertEmployee(insertemployeemodel);
			}catch(Exception e)
			{
				System.out.println("!Error processing request. Please try again later");
			}
		
		}
		
		
		//update method
		
		public void updateEmployeeSalary()
		{
			try(Scanner scanner=new Scanner(System.in);){
				
				int employeeId=0;
				System.out.print("Employee Id:");
				if(scanner.hasNextInt()) {
				employeeId=scanner.nextInt();
				}
				else {
					try {
						throw new ValidationException("[!ERROR:Invalid Employee ID please enter correct employee id]");
						}catch(ValidationException e) {
							System.out.println(e.getMessage());
							hrMainView();
						}
				}
				EmployeeModelValidation validator=new EmployeeModelValidation();
				System.out.print("New Salary:");
				double salary=scanner.nextDouble();
				
				boolean validsalary=validator.validSalary(salary);
				if(!validsalary)
					try {
					throw new ValidationException("[!ERROR:Invalid Salary]");
					}catch(ValidationException e) {
						System.out.println(e.getMessage());
						hrMainView();
					}
				
				UpdateEmployeeSalaryModel updateempsalarymodel=new UpdateEmployeeSalaryModel();
				updateempsalarymodel.setEmployeeId(employeeId);
				updateempsalarymodel.setNewSalary(salary);
			//	System.out.println(updateempsalarymodel.getNewSalary());
				HrController hrcontroller=new HrController();
				hrcontroller.handleUpdateEmployeesSalary(updateempsalarymodel);
				
			}catch(Exception e) {
				System.out.println("!Error processing request. Please try again later");
			}
		}
		
		
		//updateemployeephonenumber
		public void updateEmployeePhoneNumber()
		{
			
               try(Scanner scanner=new Scanner(System.in);){
				
				int employeeId=0;
				System.out.print("Employee Id:");
				if(scanner.hasNextInt()) {
				employeeId=scanner.nextInt();
				}
				else {
					try {
						throw new ValidationException("[ERROR:Invalid Employee Id]");
						}catch(ValidationException e) {
							System.out.println(e.getMessage());
							hrMainView();
						}
				}
				System.out.print("New PhoneNumber:");
				String newphoneNumber=scanner.next();
				EmployeeModelValidation validator=new EmployeeModelValidation();
		     	boolean validphonenumber=validator.validPhoneNum(newphoneNumber);
				if(!validphonenumber)
					try {
					throw new ValidationException("[ERROR:Invalid MobileNumber,make sure you entered with your country code 91]");
					}catch(ValidationException e) {
						System.out.println(e.getMessage());
						hrMainView();
					}
				
				UpdateEmpPhoneNumberModel updateempphonenumbermodel=new UpdateEmpPhoneNumberModel();
				updateempphonenumbermodel.setEmployeeId(employeeId);
				updateempphonenumbermodel.setNewphoneNumber(newphoneNumber);
				HrController hrcontroller=new HrController();
				hrcontroller.handleUpdateEmpPhoneNumber(updateempphonenumbermodel);
				
			}catch(Exception e) {
				System.out.println("!Error processing request. Please try again later");
			}
		}
		
		//updateemployeedesignation
		
		public void updateEmployeeDesignation()
		{
        try(Scanner scanner=new Scanner(System.in);){
				
				int employeeId=0;
				System.out.print("Employee Id:");
				if(scanner.hasNextInt()) {
				employeeId=scanner.nextInt();
				}
				else {
					try {
						throw new ValidationException("[!ERROR:Invalid Employee Id]");
						}catch(ValidationException e) {
							System.out.println(e.getMessage());
							hrMainView();
						}
				}
				System.out.print("Enter UpdateDesignation:");
				HrController hrcontrollerdesig=new HrController();	
				hrcontrollerdesig.handleDesignationList();
				
			    String updateDesignation=scanner.nextLine();
			    
			    System.out.println("new designation entered is:"+ updateDesignation);
			    
				UpdateEmployeeDesignationModel updateemployeedesgmodel=new UpdateEmployeeDesignationModel();
				updateemployeedesgmodel.setEmployeeId(employeeId);
				updateemployeedesgmodel.setUpdateDesignation(updateDesignation);
				HrController hrcontroller=new HrController();
				hrcontroller.handleUpdateEmpDesignation(updateemployeedesgmodel);
				
			}catch(Exception e) {
				System.out.println("!Error processing request. Please try again later");
			}	
		}
				
	//delete employee
		public void deleteEmployee()
		{

			try(Scanner scanner=new Scanner(System.in);){
				
				int employeeId=0;
				System.out.print("Employee Id:");
				if(scanner.hasNextInt()) {
				employeeId=scanner.nextInt();
				}
				else {
					try {
						throw new ValidationException("[!ERROR:Invalid Employee Id]");
						}catch(ValidationException e) {
							System.out.println(e.getMessage());
							hrMainView();
						}
				}
				
				RetriveEmployeeModel retriveEmployeemodel=new RetriveEmployeeModel();
				retriveEmployeemodel.setEmployeeId(employeeId);
				HrController hrcontroller=new HrController();
				hrcontroller.handleDeleteEmployees(retriveEmployeemodel);
				hrMainView();
		
			}catch(Exception e) {
				System.out.println("[!Error processing request. Please try again later]");
			}
					
		}

		public void showDesignationName(List<RetriveEmployeeDesignationModel> jobsTitleList) {
			System.out.println("Please enter any one of the below designations ");
			for(RetriveEmployeeDesignationModel retriveemployeesmodel:jobsTitleList)
			{
				System.out.println(retriveemployeesmodel.getDesignation());
			}
			
			// TODO Auto-generated method stub
			
		}
	}
	
