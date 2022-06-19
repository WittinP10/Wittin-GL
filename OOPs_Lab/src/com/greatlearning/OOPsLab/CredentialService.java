package com.greatlearning.OOPsLab;
import java.util.Random;


public class CredentialService extends Employee implements ICredentialService{
	

	public CredentialService(String firstName, String lastName) {
		super(firstName, lastName);
		
	}

	public void generatePassword() {
		
		char[] password=new char[5];
		Random ran=new Random();
		
		String lowerCase="abcdefghijklmnopqrstuvwx";
		String upperCase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String spclChar="!@#$";
		String number="0123456789";
		password[0]=lowerCase.charAt(ran.nextInt(24));
		password[1]=upperCase.charAt(ran.nextInt(24));
		password[2]=spclChar.charAt(ran.nextInt(4));
		password[3]=number.charAt(ran.nextInt(10));
		password[4]=lowerCase.charAt(ran.nextInt(24));

		
		System.out.print("Password ---->");
		for(int i=0;i<5;i++) {
		 System.out.print(password[i]);
		}
	}
	
	public String generateEmailAddress() {
		
		
		return (getFirstName()+getLastName()+"@"+getDepartment()+".abc.com").toLowerCase();
		
	}
	
	public void showCredentials() {
		
		if(getDepartment()==null) {
			System.out.println("Invalid option");
		}
		else {
		System.out.println("Dear "+getFirstName()+" "+getLastName()+" your generated credentials are:");
		System.out.println("Email ----->"+generateEmailAddress());
		generatePassword();
		
		}
		
	}
	
	
}
