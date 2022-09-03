package com.employeewage3;

public class EmpWageBuilderMultiCompany {
	
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	public static void computeEmpWage(String company, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAY, int MAX_HRS_IN_MONTH) {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAY) {
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
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Emp Wage for company: " +company +"  is  " + totalEmpWage);
	}

	public static void main(String[] args) {
		computeEmpWage("DMart", 20,5,10);
		computeEmpWage("Reliance",10,10,20);
	}

}
