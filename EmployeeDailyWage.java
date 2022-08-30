package com.employeewage3;

public class EmployeeDailyWage {
	
	int IS_PRESENT = 1;
	 int WAGE_PER_HOUR = 20;
	 int FULL_TIME = 8;
	 int empWage = 0;
	 int empCheck;

	 
	public void empWage() 
	{
	 
	empCheck = (int) (Math.floor(Math.random() * 10) % 2);
	System.out.println("empCheck=> "+empCheck);
	if (empCheck == IS_PRESENT)
	{
	   System.out.println("Employee is present");
	   empWage = WAGE_PER_HOUR * FULL_TIME ;
	}
	else
	{
	   System.out.println("Employee is absent");
	   empWage = 0;
	}
	System.out.println("Employee wage + " +empWage);
	}

	
	public static void main(String[] args) 
	{
		EmployeeDailyWage a = new EmployeeDailyWage ();
	a.empWage();
    }

}
