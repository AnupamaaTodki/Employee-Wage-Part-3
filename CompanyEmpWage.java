package com.employeewage3;

public class CompanyEmpWage {
	
	public final String company;
	public final int EMP_RATE_PER_HOUR;
	public final int NUM_OF_WORKING_DAY;
	public final int MAX_HRS_IN_MONTH;
	public int totalEmpWage;
	
	public CompanyEmpWage(String company, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAY, int MAX_HRS_IN_MONTH) {
		this.company = company;
		this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
		this.NUM_OF_WORKING_DAY = NUM_OF_WORKING_DAY;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
	}
	
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	@Override
	public String toString() {
		return "Total employee wage for company : " + company + " is " + totalEmpWage;
	}
	

}
