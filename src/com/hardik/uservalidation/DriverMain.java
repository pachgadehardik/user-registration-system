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
		if(userInfoValidator.checkLastName(lName) == true) {
			System.out.println("Valid Last name");
			userDetail.setlName(lName);
		}
		else System.out.println("Invalid LastName");
		
		//Check for Email
		System.out.println("Enter the Email ID: ");
		String emailId = sc.next();
		if(userInfoValidator.checkEmailId(emailId) == true) {
			System.out.println("Valid Email");
			userDetail.setEmailID(emailId);
		}
		else System.out.println("Invalid Email");
		
		//Check for Phone Number
		System.out.println("Enter the Phone Num: ");
		String phone = sc.next();
		if(userInfoValidator.checkPhoneNum(phone) == true) {
			System.out.println("Valid Phone ");
			userDetail.setPhoneNum(phone);
		}
		else System.out.println("Invalid Phone ");
		
	}
	
}
