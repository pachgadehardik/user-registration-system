package com.hardik.uservalidation.userInfoTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.hardik.uservalidation.UserInfoValidator;

import exception.UserException;


class UserInfoValidatorTest {

	@Test
	public void givenFirstLastName_WhenProper_ShouldReturnTrue() throws UserException {
		assertEquals(true, UserInfoValidator.checkFirstName("Hardik"));
		assertEquals(true, UserInfoValidator.checkLastName("Pachgade"));
	}

	@Test
	public void givenFirstLastName_WhenShort_ShouldReturnException() throws UserException {
		UserInfoValidator obj = new UserInfoValidator();
		assertThrows(UserException.class, () -> UserInfoValidator.checkFirstName("ha"));
		assertThrows(UserException.class, () -> obj.checkLastName("pa"));

	}

	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() throws UserException {
		assertEquals(true, UserInfoValidator.checkPhoneNum("91 9878998701"));
	}

	@Test
	public void givenMobileNumber_WhenLess_ShouldReturnException() throws UserException {
		UserInfoValidator obj = new UserInfoValidator();
		assertThrows(UserException.class, () -> UserInfoValidator.checkPhoneNum("91 1231231"));
	}

	@Test
	public void givenPassWord_WhenAllRulesProper_ShouldReturnTrue() throws UserException {
		assertEquals(true, UserInfoValidator.checkPassword("Hardik@123"));
	}

	@Test
	public void givenPassWord_WhenAllRulesNotProper_ShouldReturnException() throws UserException {
		UserInfoValidator obj = new UserInfoValidator();
		assertThrows(UserException.class, () -> UserInfoValidator.checkPassword("hardik@@1"));
	}

}
