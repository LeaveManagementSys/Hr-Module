package com.virtusa.controller;

import java.util.List;

import com.virtusa.entities.Jobs;
import com.virtusa.helper.FactoryHr;
import com.virtusa.model.InsertEmployeeModel;
import com.virtusa.model.RetriveEmployeeDesignationModel;
import com.virtusa.model.RetriveEmployeeModel;
import com.virtusa.model.UpdateEmpPhoneNumberModel;
import com.virtusa.model.UpdateEmployeeDesignationModel;
import com.virtusa.model.UpdateEmployeeSalaryModel;
import com.virtusa.service.HrService;
import com.virtusa.view.HrMainView;
import com.virtusa.view.HrView;

public class HrController {
	
	private HrService hrservice;
	private HrView hrview;
	
	
	public HrController()
	{
		this.hrservice=FactoryHr.createHrService();
	}
	
	public void performInsertEmployee(InsertEmployeeModel insertemployeemodel)
	{
		String output=hrservice.employeeInsert(insertemployeemodel);
		HrView hrview=new HrView();
		if(output.contentEquals("success"))
		{
			hrview.showRegistrationSuccess(insertemployeemodel);	
		}
		else
		{
			hrview.showRegistrationfailure(insertemployeemodel);	
		}
	}
	
	//update employee salary
	
	public void handleUpdateEmployeesSalary(UpdateEmployeeSalaryModel updateempsalarymodel)
	{
		
		String outcome=hrservice.salaryupdate(updateempsalarymodel);
		HrView hrview=new HrView();
		if(outcome.contentEquals("success")) {
			//System.out.println("outcome"+outcome);
		hrview.showSalaryUpdateSuccess(updateempsalarymodel);	
		}
		else 
		{
			hrview.showSalaryUpdateFailure(updateempsalarymodel);
		}	
		
	}
	
	//update employee phoneNumber
	
	public void handleUpdateEmpPhoneNumber(UpdateEmpPhoneNumberModel updateempphonenumbermodel)
	{
		HrView hrview=new HrView();
		String outcome=hrservice.phoneNumberUpdate(updateempphonenumbermodel);
		if(outcome.contentEquals("success")) {
			//System.out.println("outcome"+outcome);
			hrview.showPhoneNumberUpdateSuccess(updateempphonenumbermodel);	
		}else {
			hrview.showPhoneNumberUpdateFailure(updateempphonenumbermodel);
		}	
	}
	
	//update employee designation
	
	public void handleUpdateEmpDesignation(UpdateEmployeeDesignationModel updateemployeedesgmodel)
	{
		HrView hrview=new HrView();
		String outcome=hrservice.designationUpdate(updateemployeedesgmodel);
		if(outcome.contentEquals("success")) {
			hrview.showDesignationUpdateSuccess(updateemployeedesgmodel);	
		}else {
			hrview.showDesignationUpdateFailure(updateemployeedesgmodel);
		}
		
		
	}
	
	
	//delete employee
	
		public void handleDeleteEmployees(RetriveEmployeeModel retriveEmployeemodel)
		{
			HrView hrview=new HrView();
			String outcome=hrservice.deleteEmployee(retriveEmployeemodel);
			if(outcome.contentEquals("success")) {
				hrview.showDeleteSuccess( retriveEmployeemodel);	
			}else {
				hrview.showDeleteFailure( retriveEmployeemodel);
			}
			
		}
		//handling designation list
		public void handleDesignationList()
		{
			List<RetriveEmployeeDesignationModel> jobsTitleList=hrservice.retrieveDesignation();
			HrMainView hrMainView=new HrMainView();
			hrMainView.showDesignationName(jobsTitleList);
		
       }
}
