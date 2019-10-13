package com.virtusa.model;

public class UpdateEmployeeDesignationModel {
	
	private int employeeId;
	private String updateDesignation;
	public UpdateEmployeeDesignationModel()
	{
		
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getUpdateDesignation() {
		return updateDesignation;
	}
	public void setUpdateDesignation(String updateDesignation) {
		this.updateDesignation = updateDesignation;
	}
	@Override
	public String toString() {
		return "UpdateEmployeeDesignationModel [employeeId=" + employeeId + ", updateDesignation=" + updateDesignation
				+ ", getEmployeeId()=" + getEmployeeId() + ", getUpdateDesignation()=" + getUpdateDesignation()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		result = prime * result + ((updateDesignation == null) ? 0 : updateDesignation.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UpdateEmployeeDesignationModel other = (UpdateEmployeeDesignationModel) obj;
		if (employeeId != other.employeeId)
			return false;
		if (updateDesignation == null) {
			if (other.updateDesignation != null)
				return false;
		} else if (!updateDesignation.equals(other.updateDesignation))
			return false;
		return true;
	}
	

}
