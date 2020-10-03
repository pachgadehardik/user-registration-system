package com.hardik.uservalidation.userInfoTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.hardik.uservalidation.UserInfoValidator;

//import uservalidationtest.RegexValidator;

class UserInfoValidatorTest {

	@Test
	public void givenFirstLastName_WhenProper_ShouldReturnTrue() {
		assertEquals(true, UserInfoValidator.checkFirstName("Hardik"));
		assertEquals(true, UserInfoValidator.checkLastName("Pachgade"));
	}

	@Test
	public void givenFirstLastName_WhenShort_ShouldReturnFalse() {
		assertEquals(false, UserInfoValidator.checkFirstName("Hk"));
		assertEquals(false, UserInfoValidator.checkLastName("Pa"));
	}

	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
		assertEquals(true, UserInfoValidator.checkPhoneNum("91 9878998701"));
	}

	@Test
	public void givenMobileNumber_WhenLess_ShouldReturnFalse() {
		assertEquals(false, UserInfoValidator.checkPhoneNum("91 987891"));
	}

	@Test
	public void givenPassWord_WhenAllRulesProper_ShouldReturnTrue() {
		assertEquals(true, UserInfoValidator.checkPassword("Hardik@123"));
	}

	@Test
	public void givenPassWord_WhenAllRulesNotProper_ShouldReturnFalse() {
		assertEquals(false, UserInfoValidator.checkPassword("Ha@rdik@123"));
	}

}
