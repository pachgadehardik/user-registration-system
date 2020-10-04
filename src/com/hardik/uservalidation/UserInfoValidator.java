package com.hardik.uservalidation;

import java.util.regex.Pattern;

import exception.UserException;

public class UserInfoValidator {

	final static String uc1 = "^[A-Z]{1}[A-Za-z]{2,}"; // USECASE 1 FirstNAme
	final static String uc2 = "^[A-Z]{1}[A-Za-z]{2,}"; // USECASE 2 LASTNAME
														
	final static String uc3 = "^[a-zA-Z0-9]+([\\. | \\- | \\_]{1}[A-Za-z0-9]+)*(@){1}[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[A-Za-z]{2,})?$"; // EMAILID
	final static String uc4 = "^[0-9]{0,2}[\\s][1-9]{1}[0-9]{9}"; // USECASE4 PHONE NUMBER

	final static String uc5 = "^.{8,}"; // Min length is 8
	final static String uc6 = "^.*[A-Z]{1,}.*"; // Min One Upper Case Character
	final static String uc7 = "^.*[0-9]{1,}.*"; // Min one Dgit
	final static String uc8 = "^[A-Za-z0-9]*[^0-9a-zA-Z]{1}[A-Za-z0-9]*{8,}"; // Only One Special Character

	static ValidatorLambda validatorLambda = new ValidatorLambda();
	
	//Single Parameter Lambda Expression passed inside the functions by creating object of ValidatorLambda Class
	
	public static boolean checkFirstName(String fName) throws UserException {
		boolean isValid = validatorLambda.isDataValid(fName ,
				(String dataName) -> {
					return dataName.matches(uc1);
				});
		if (isValid) return true;
		throw new UserException(exception.ExceptionType.INVALID_FNAME.toString());
	}

	public static boolean checkLastName(String lName) throws UserException {
		boolean isValid = validatorLambda.isDataValid(lName ,
				(String dataName) -> {
					return dataName.matches(uc2);
				});
		if (isValid) return true;
		throw new UserException(exception.ExceptionType.INVALID_LNAME.toString());
	}

	public static boolean checkEmailId(String emailId) throws UserException {
		boolean isValid = validatorLambda.isDataValid(emailId ,
				(String dataName) -> {
					return dataName.matches(uc3);
				});
		if (isValid) return true;
		throw new UserException(exception.ExceptionType.INVALID_EMAIL.toString());
	}

	public static boolean checkPhoneNum(String phone) throws UserException {
		boolean isValid = validatorLambda.isDataValid(phone ,
				(String dataName) -> {
					return dataName.matches(uc4);
				});
		if (isValid) return true;
		throw new UserException(exception.ExceptionType.INVALID_PHONE.toString());
	}

	public static boolean checkPassword(String pw) throws UserException {

		boolean isValid = validatorLambda.isDataValid(pw,
				(String dataName) -> {
					return dataName.matches(uc8);
				});
		if (isValid) return true;
		throw new UserException(exception.ExceptionType.INVALID_PASSWORD.toString());

	}

	public static boolean checkPasswordLength(String pw) {
		return Pattern.compile(uc5).matcher(pw).matches();
	}

	public static boolean checkUpperCasePassword(String pw) {
		return Pattern.compile(uc6).matcher(pw).matches();
	}

	public static boolean checkDigitPassword(String pw) {
		return Pattern.compile(uc7).matcher(pw).matches();
	}

	public static boolean checkSpecialCharPassword(String pw) {
		return Pattern.compile(uc8).matcher(pw).matches();
	}

}
