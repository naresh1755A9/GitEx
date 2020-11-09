package com.rs.fer.util.validation.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.rs.fer.request.AddExpenseRequestVO;
import com.rs.fer.request.LoginRequestVO;
import com.rs.fer.request.RegistrationRequestVO;
import com.rs.fer.util.validation.FERValidation;

@Component
public class FERValidationUtilImpl implements FERValidation {

	@Override
	public Set<String> validateRegistrationRequest(RegistrationRequestVO registrationRequestVO) {
		
		Set<String> errorMessages = new LinkedHashSet<String>();
		
		errorMessages = validateProperty(errorMessages, registrationRequestVO.getFirstname(), "Please  enter FirstName");
		errorMessages = validateProperty(errorMessages, registrationRequestVO.getLastname(), "Please  enter LastName");
		errorMessages = validateProperty(errorMessages, registrationRequestVO.getEmail(), "Please  enter Email");
		errorMessages = validateProperty(errorMessages, registrationRequestVO.getMobile(), "Please  enter Mobile");
		errorMessages = validateProperty(errorMessages, registrationRequestVO.getUsername(), "Please  enter Username");
		errorMessages = validateProperty(errorMessages, registrationRequestVO.getPassword(), "Please  enter Password");
		
		return errorMessages;
	}
	
	public Set<String> validateProperty(Set<String> errorMessages, Object value, String errorMessage){
		
		if (StringUtils.isEmpty(value)) {
			errorMessages.add(errorMessage);
		} else if ((value.getClass().equals(Integer.class) || value.getClass().equals(Float.class)) 
				&& Float.parseFloat(value.toString()) <= 0) {
			errorMessages.add(errorMessage);
		}
		return errorMessages;
	}
	
	@Override
	public Set<String> validateLoginRequest(LoginRequestVO loginReqVO) {
		
		Set<String> errorMessages = new LinkedHashSet<String>();
		
		errorMessages = validateProperty(errorMessages,loginReqVO.getUsername(), "Please enter username");
		errorMessages = validateProperty(errorMessages,loginReqVO.getPassword(), "Please enter password");
		
		return errorMessages;
	}

	@Override
	public Set<String> validateAddExpenseRequest(AddExpenseRequestVO addExpVO) {
		Set<String> errorMessages = new LinkedHashSet<String>();
		
		errorMessages = validateProperty(errorMessages,addExpVO.getExpensetype(), "Please enter first name");
		errorMessages = validateProperty(errorMessages,addExpVO.getDate(), "Please enter last name");
		errorMessages = validateProperty(errorMessages,addExpVO.getPrice(), "Please enter email");
		errorMessages = validateProperty(errorMessages,addExpVO.getTotal(), "Please enter username");
		errorMessages = validateProperty(errorMessages,addExpVO.getNumberofitems(), "Please enter number of items");
		errorMessages = validateProperty(errorMessages,addExpVO.getBywhom(), "Please enter by whom");
		errorMessages = validateProperty(errorMessages,addExpVO.getUserid(), "Please enter user id");
		
		return errorMessages;
	}

}
