package com.employeewage3;

public class EmployeeAttendance {
	
	public int IS_FULL_TIME = 1;
	
	public void getAttendance() {

		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
		   System.out.println("Employee is present");
		else
		   System.out.println("Employee is absent");
		}


public static void main(String[] args) {
EmployeeAttendance emp = new EmployeeAttendance();
emp.getAttendance();
}

}
