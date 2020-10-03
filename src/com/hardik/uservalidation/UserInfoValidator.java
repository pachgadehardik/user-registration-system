package com.hardik.uservalidation;

import java.util.regex.Pattern;

public class UserInfoValidator {

	final static String uc1 = "^[A-Z]{1}[A-Za-z]{2,}"; // USECASE 1 FirstNAme
	final static String uc2 = "^[A-Z]{1}[A-Za-z]{2,}"; // USECASE 2 LASTNAME
	final static String uc3 = "^[\\w]+([\\. | \\- | \\+]{1}[\\w]+)*(@){1}[a-zA-Z]+\\.[a-zA-Z]{2,3}?(\\.[A-Za-z]{2,3})$"; // USECASE 3 EMAILID
	
	
	
	
	public boolean checkFirstName(String fName) {
		return Pattern.compile(uc1).matcher(fName).matches();
	}
	
	public boolean checkLastName(String lName) {
		return Pattern.compile(uc2).matcher(lName).matches();
	}
	
	public boolean checkEmailId(String emailId) {
		return Pattern.compile(uc3).matcher(emailId).matches();
	}
	
}
