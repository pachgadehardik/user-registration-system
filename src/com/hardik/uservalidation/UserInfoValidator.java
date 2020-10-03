package com.hardik.uservalidation;

import java.util.regex.Pattern;

public class UserInfoValidator {

	final static String uc1 = "^[A-Z]{1}[A-Za-z]{2,}"; // USECASE 1 FirstNAme
	
	
	public boolean checkFirstName(String name) {
		return Pattern.compile(uc1).matcher(name).matches();
	}
	
}
