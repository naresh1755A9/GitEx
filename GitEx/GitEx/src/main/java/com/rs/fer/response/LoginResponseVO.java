package com.rs.fer.response;

import java.util.Set;

import org.springframework.http.HttpStatus;

public class LoginResponseVO extends AbstractResponse {

	public LoginResponseVO(HttpStatus status, String errorCode, String message, Set<String> errorMessages) {
		super(status, errorCode, message, errorMessages);
	}
}
