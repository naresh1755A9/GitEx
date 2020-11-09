package com.rs.fer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.rs.fer.service.FERservice;
import com.rs.fer.util.validation.FERValidation;

@RestController
public class FERController {

	@Autowired
	private FERservice ferService;

	@Autowired
	private FERValidation ferValidation;

	
}
