package com.rs.fer.service;

import com.rs.fer.request.AddExpenseRequestVO;
import com.rs.fer.request.LoginRequestVO;
import com.rs.fer.request.RegistrationRequestVO;
import com.rs.fer.request.ResetPasswordRequestVO;
import com.rs.fer.response.AddExpenseResponseVO;
import com.rs.fer.response.GetExpenseResponseVO;
import com.rs.fer.response.GetExpensesResponseVO;
import com.rs.fer.response.LoginResponseVO;
import com.rs.fer.response.RegistrationResponseVO;
import com.rs.fer.response.ResetPasswordResponseVO;

public interface FERservice {

	RegistrationResponseVO registration(RegistrationRequestVO regReqVO);

	LoginResponseVO login(LoginRequestVO loginReqVo);

	AddExpenseResponseVO addExpense(AddExpenseRequestVO addExpReqVo);

	ResetPasswordResponseVO resetPassword(ResetPasswordRequestVO resetReqVO);

	GetExpenseResponseVO getexpense(int expenseid);

	GetExpensesResponseVO getexpenses(int userid);
}
