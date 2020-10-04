package com.hardik.uservalidation;

import java.util.Scanner;

import exception.UserException;

public class DriverMain {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("USER REGISTRATION SYSTEM, Enter the Required Details--");

		UserDetails userDetail = new UserDetails();
//		UserInfoValidator userInfoValidator = new UserInfoValidator();

		// Check for First Name with Custom Exception Enable
		try {
			System.out.println("Enter the First Name: ");
			String fName = sc.next();
			if (UserInfoValidator.checkFirstName(fName) == true) {
				System.out.println("Valid Last name");
				userDetail.setfName(fName);
			}
		} catch (UserException e) {
			System.out.println(e.getClass() + " " + e.getMessage());
		}

		// Check for Last Name with Custom Exception
		try {
			System.out.println("Enter the Last Name: ");
			String lName = sc.next();
			if (UserInfoValidator.checkLastName(lName) == true) {
				System.out.println("Valid Last name");
				userDetail.setlName(lName);
			}
		} catch (UserException e) {
			System.out.println(e.getClass() + " " + e.getMessage());
		}

		// Check for Email with Custom Exception
		try {
			System.out.println("Enter the Email ID: ");
			String emailId = sc.next();
			if (UserInfoValidator.checkEmailId(emailId) == true) {
				System.out.println("Valid Email");
				userDetail.setEmailID(emailId);
			}
		} catch (UserException e) {
			System.out.println(e.getClass() + " " + e.getMessage());
		}
		// Check for Phone Number with custom Exception
		try {
			System.out.println("Enter the Phone Num: ");
			String phone = sc.next();
			if (UserInfoValidator.checkPhoneNum(phone) == true) {
				System.out.println("Valid Phone ");
				userDetail.setPhoneNum(phone);
			}
		} catch (Exception e) {
			System.out.println(e.getClass() + " " + e.getMessage());
		}
		
		// Check Password with Custom Exception Enable
		try {
			System.out.println("Enter the Password: ");
			String pw = sc.next();
			if (UserInfoValidator.checkPassword(pw) == true) {
				System.out.println("Valid Password");
				userDetail.setPassWord(pw);
			}
		} catch (UserException e) {
			System.out.println(e.getClass() + " " + e.getMessage());
		}
		
	}

}
