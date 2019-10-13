package com.virtusa.view;

import com.virtusa.model.InsertEmployeeModel;
import com.virtusa.model.RetriveEmployeeModel;
import com.virtusa.model.UpdateEmpPhoneNumberModel;
import com.virtusa.model.UpdateEmployeeDesignationModel;
import com.virtusa.model.UpdateEmployeeSalaryModel;


public class HrView {
	  
	    public void showRegistrationSuccess(InsertEmployeeModel insertemployeemodel) {
	    	HrMainView  HrMainView=new HrMainView();
			System.out.println("\n Registration successful for employee id=>"+insertemployeemodel.getEmployeeId());
			HrMainView.hrMainView();
		}
	    
    public void showRegistrationfailure(InsertEmployeeModel insertemployeemodel)
    {
        	 HrMainView  HrMainView=new HrMainView();
			System.out.println("\n Registration not successful for employee id=>"+insertemployeemodel.getEmployeeId());
			 HrMainView.hrMainView();
		}	 
	 public void showSalaryUpdateSuccess(UpdateEmployeeSalaryModel updateempsalarymodel)
	 {
		 HrMainView  HrMainView=new HrMainView();	 
		   /* int a=10;
			System.out.println(a);
			*/
		 System.out.println("\n Salary successful updated for employee id=>"+updateempsalarymodel.getEmployeeId());
		 HrMainView.hrMainView();
	 }
	 
	 public void showSalaryUpdateFailure(UpdateEmployeeSalaryModel updateempsalarymodel)
	 {
		 HrMainView  HrMainView=new HrMainView();
		 System.out.println("\n Salary updated failed for employee id=>"+updateempsalarymodel.getEmployeeId());
		 HrMainView.hrMainView();
		 
	 }
	 public void showDeleteSuccess(RetriveEmployeeModel retriveEmployeemodel)
	 {
		 HrMainView  HrMainView=new HrMainView();
		 System.out.println("\n Employee record deleted for employee id=>"+ retriveEmployeemodel.getEmployeeId());
		 HrMainView.hrMainView();
	 }
	 
	 public void showDeleteFailure(RetriveEmployeeModel retriveEmployeemodel)
	 {
		 HrMainView  HrMainView=new HrMainView();
		 System.out.println("\n Employee record deletion failed for employee id=>"+retriveEmployeemodel.getEmployeeId());
	 }
	 
	 public void showPhoneNumberUpdateSuccess(UpdateEmpPhoneNumberModel updateempphonenumbermodel)
	 {
		 HrMainView  HrMainView=new HrMainView();
		 System.out.println("\n Employee phone number update  success for employee id=>"+ updateempphonenumbermodel.getEmployeeId()+"to"+" "+updateempphonenumbermodel.getNewphoneNumber());
		 HrMainView.hrMainView();
	 }
	 
	 public void showPhoneNumberUpdateFailure(UpdateEmpPhoneNumberModel updateempphonenumbermodel)
	 {
		 HrMainView  HrMainView=new HrMainView();
		 System.out.println("\n Employee phone number update failed for employee id=>"+updateempphonenumbermodel.getEmployeeId()+"to"+" "+updateempphonenumbermodel.getNewphoneNumber());
		 HrMainView.hrMainView();
	 }	 
	 public void showDesignationUpdateSuccess(UpdateEmployeeDesignationModel updateemployeedesgmodel)
	 {
		 HrMainView  HrMainView=new HrMainView();
		 System.out.println("\n Employee designation update  success for employee id=>"+ updateemployeedesgmodel.getEmployeeId()+"to"+" "+updateemployeedesgmodel.getUpdateDesignation());
		 HrMainView.hrMainView();
	 }
	  public void showDesignationUpdateFailure(UpdateEmployeeDesignationModel updateemployeedesgmodel)
	  {
		  HrMainView  HrMainView=new HrMainView();
		  System.out.println("\n Employee designation update NOT success for employee id=>"+ updateemployeedesgmodel.getEmployeeId()+"to"+" "+updateemployeedesgmodel.getUpdateDesignation());
		  HrMainView.hrMainView();
	  }
	    
}
