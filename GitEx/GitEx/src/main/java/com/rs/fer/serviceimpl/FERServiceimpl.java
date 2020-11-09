package com.rs.fer.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rs.fer.dao.AddressRepository;
import com.rs.fer.dao.ExpenseRepository;
import com.rs.fer.dao.UserRepository;
import com.rs.fer.service.FERservice;
import com.rs.fer.util.FERUtil;

@Service
public class FERServiceimpl implements FERservice {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ExpenseRepository expenseRepository;

	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	private FERUtil ferUtil;

	
}
