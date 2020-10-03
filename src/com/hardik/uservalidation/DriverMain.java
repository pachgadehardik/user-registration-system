package com.hardik.uservalidation;

import java.util.Scanner;

public class DriverMain {


	
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("USER REGISTRATION SYSTEM, Enter the Required Details--");
		
		UserDetails userDetail = new UserDetails();
		UserInfoValidator userInfoValidator = new UserInfoValidator();
		
		//Check for First Name
		System.out.println("Enter the First Name: ");
		String fName = sc.next();
		if(userInfoValidator.checkFirstName(fName) == true) {
			System.out.println("Valid Last name");
			userDetail.setfName(fName);
		}
		else System.out.println("Invalid FirstName");
		
		//Check for Last Name
		System.out.println("Enter the Last Name: ");
		String lName = sc.next();
		if(userInfoValidator.checkFirstName(lName) == true) {
			System.out.println("Valid Last name");
			userDetail.setfName(fName);
		}
		else System.out.println("Invalid LastName");
		
	}
	
}
