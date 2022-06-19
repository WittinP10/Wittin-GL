package com.greatlearning.OOPsLab;

import java.util.Scanner;

public class CredentialServiceImp {

	public static Scanner sc=new Scanner(System.in);
	
	
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);	
		
	CredentialService emp1=new CredentialService("Wittin", "Prince");
	
	deptAssign(emp1);
	emp1.showCredentials();
	
	sc.close();
	
	}
	
	public static void deptAssign(CredentialService emp1) {
		
		int option;
		
		System.out.println("Please Enter the department from the following");
		System.out.println("1. Technical\n2. Admin\n3. Human Resource\n4. Legal");
		
		option=sc.nextInt();
		
		switch(option) {
		
		case(1):
			emp1.setDepartment("Tech");
			break;
		case(2):
			emp1.setDepartment("Admin");
			break;
		case(3):
			emp1.setDepartment("HR");
			break;
		case(4):
			emp1.setDepartment("Legal");
			break;
		default:
			emp1.setDepartment(null);
			
		}
		
	}

}
