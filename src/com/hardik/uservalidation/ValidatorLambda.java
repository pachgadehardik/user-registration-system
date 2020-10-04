package com.hardik.uservalidation;

import java.util.function.Predicate;


/*
 * Validator Class method containing Predicate which will help to test with the input data 
 */
public class ValidatorLambda {

	public boolean isDataValid(String inputData, Predicate<String> regex_Predicate) {
		return  regex_Predicate.test(inputData);
	}
	
}
