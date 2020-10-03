package com.hardik.uservalidation;

import java.util.regex.Pattern;

public class UserInfoValidator {

	final static String uc1 = "^[A-Z]{1}[A-Za-z]{2,}"; // USECASE 1 FirstNAme
	final static String uc2 = "^[A-Z]{1}[A-Za-z]{2,}"; // USECASE 2 LASTNAME
	final static String uc3 = "^[\\w]+([\\. | \\- | \\+]{1}[\\w]+)*(@){1}[a-zA-Z]+\\.[a-zA-Z]{2,3}?(\\.[A-Za-z]{2,3})$"; // USECASE
																															// 3
																															// EMAILID
	final static String uc4 = "^[0-9]{0,2}[\\s][1-9]{1}[0-9]{9}"; // USECASE4 PHONE NUMBER

	final static String uc5 = "^.{8,}"; // Min length is 8
	final static String uc6 = "^.*[A-Z]{1,}.*"; // Min One Upper Case Character
	final static String uc7 = "^.*[0-9]{1,}.*"; // Min one Dgit
	final static String uc8 = "^[A-Za-z0-9]*[^0-9a-zA-Z]{1}[A-Za-z0-9]*"; // Only One Special Character

	public boolean checkFirstName(String fName) {
		return Pattern.compile(uc1).matcher(fName).matches();
	}

	public boolean checkLastName(String lName) {
		return Pattern.compile(uc2).matcher(lName).matches();
	}

	public boolean checkEmailId(String emailId) {
		return Pattern.compile(uc3).matcher(emailId).matches();
	}

	public boolean checkPhoneNum(String phone) {
		return Pattern.compile(uc4).matcher(phone).matches();
	}

	public boolean checkPassword(String pw) {

		return (checkPasswordLength(pw) && checkUpperCasePassword(pw) && checkDigitPassword(pw)
				&& checkSpecialCharPassword(pw));

	}

	public boolean checkPasswordLength(String pw) {
		return Pattern.compile(uc5).matcher(pw).matches();
	}

	public boolean checkUpperCasePassword(String pw) {
		return Pattern.compile(uc6).matcher(pw).matches();
	}

	public boolean checkDigitPassword(String pw) {
		return Pattern.compile(uc7).matcher(pw).matches();
	}

	public boolean checkSpecialCharPassword(String pw) {
		return Pattern.compile(uc8).matcher(pw).matches();
	}

}
