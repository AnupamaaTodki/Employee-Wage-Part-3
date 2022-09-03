package com.employeewage3;

public class EmpWageBuilderArray {
	
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;
	
	public EmpWageBuilderArray() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}
	
	private void addCompanyEmpWage(String company, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAY, int MAX_HRS_IN_MONTH) {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company,EMP_RATE_PER_HOUR,NUM_OF_WORKING_DAY, MAX_HRS_IN_MONTH);
		numOfCompany++;
		
	}
	
	private void computeEmpWage() {
		for(int i = 0; i < numOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
		System.out.println(companyEmpWageArray [i]);
		}
	}
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		
		while (totalEmpHrs <= companyEmpWage.MAX_HRS_IN_MONTH && totalWorkingDays < companyEmpWage.NUM_OF_WORKING_DAY) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#:" + totalWorkingDays + " Emp Hr: " + empHrs);

		}
		return totalEmpHrs * companyEmpWage.EMP_RATE_PER_HOUR;
		
	}

	public static void main(String[] args) {
		EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("DMart" , 20 , 2 , 10);
		empWageBuilder.addCompanyEmpWage("Reliance" , 10 , 4 , 20);
		empWageBuilder.computeEmpWage();
	}

}
