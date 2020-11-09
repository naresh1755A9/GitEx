package com.rs.fer.service;

import com.rs.fer.request.AddExpenseRequestVO;
import com.rs.fer.request.ExpenseReportRequestVO;
import com.rs.fer.request.LoginRequestVO;
import com.rs.fer.request.RegistrationRequestVO;
import com.rs.fer.request.UpdateUserRequestVO;
import com.rs.fer.response.AddExpenseResponseVO;
import com.rs.fer.response.ExpenseReportResponseVO;
import com.rs.fer.response.GetUserResponseVO;
import com.rs.fer.response.LoginResponseVO;
import com.rs.fer.response.RegistrationResponseVO;
import com.rs.fer.response.UpdateUserResponseVO;

public interface FERservice {
	
	RegistrationResponseVO registration(RegistrationRequestVO regReqVO);
 
	LoginResponseVO login(LoginRequestVO loginReqVo);
	
	AddExpenseResponseVO addExpense(AddExpenseRequestVO addExpReqVo);
	
	GetUserResponseVO getUser(int Id);

	ExpenseReportResponseVO expenseReport(ExpenseReportRequestVO reportReqVO);
	
	UpdateUserResponseVO updateUser(UpdateUserRequestVO updateUserReqVO);


	
}
