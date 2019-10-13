package com.virtusa.service;

import java.util.List;

import com.virtusa.model.InsertEmployeeModel;
import com.virtusa.model.RetriveEmployeeDesignationModel;
import com.virtusa.model.RetriveEmployeeModel;
import com.virtusa.model.UpdateEmpPhoneNumberModel;
import com.virtusa.model.UpdateEmployeeDesignationModel;
import com.virtusa.model.UpdateEmployeeSalaryModel;

public interface HrService {
	
	public List<RetriveEmployeeModel> retrieveEmployees();
	public String employeeInsert(InsertEmployeeModel insertemployeemodel);
	public String salaryupdate(UpdateEmployeeSalaryModel updateempsalarymodel);
	public String deleteEmployee(RetriveEmployeeModel retriveemployeemodel);
	public String phoneNumberUpdate(UpdateEmpPhoneNumberModel updateempphonenumbermodel);
	public String designationUpdate(UpdateEmployeeDesignationModel updateemployeedesgmodel);
    public List<RetriveEmployeeDesignationModel> retrieveDesignation();
}
