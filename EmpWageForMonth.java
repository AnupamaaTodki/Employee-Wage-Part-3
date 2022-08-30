package com.employeewage3;

public class EmpWageForMonth {
	
	 public int IS_PRESENT = 1;
	 public int IS_PART_TIME = 2;
	 public int WAGE_PER_HOUR = 20;
	 public int FULL_TIME = 8;
	 public int PART_TIME = 4;
     public int empWage = 0;
	 public int count = 0;
	 public int wagePerMonth = 0;
	 
	
	public void empWageMonth()
	{
		 
		 count = (int) (Math.floor(Math.random() * 10) % 3);
			System.out.println("initial Total Wage Per Month"+wagePerMonth );
			for (count = 1; count <= 20; count++) {
				System.out.println("incrimental Total Wage Per Month"+wagePerMonth );
				int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
				System.out.println("empCheck=> " + empCheck);
				if (empCheck == IS_PRESENT) {
					System.out.println("Employee is present");
					empWage = WAGE_PER_HOUR * FULL_TIME;
				} else if (empCheck == IS_PART_TIME) {
					System.out.println("Employee working as part time");
					empWage = WAGE_PER_HOUR * PART_TIME;
				} else {
					System.out.println("Employee is absent");
					empWage = 0;
				}
				System.out.println("Employee wage = " + empWage);
				wagePerMonth=wagePerMonth+empWage;
				
			}
			System.out.println("Total Wage Per Month "+wagePerMonth );
	}
	
	
public static void main(String[] args) {
	EmpWageForMonth a = new EmpWageForMonth();
	a.empWageMonth();
}

}
