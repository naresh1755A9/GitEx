package com.rs.fer.service;

import com.rs.fer.request.AddExpenseRequestVO;
import com.rs.fer.request.ExpenseReportRequestVO;
import com.rs.fer.request.LoginRequestVO;
import com.rs.fer.request.RegistrationRequestVO;
<<<<<<< HEAD
import com.rs.fer.request.ResetPasswordRequestVO;
=======
import com.rs.fer.request.UpdateUserRequestVO;
>>>>>>> branch 'master' of https://github.com/naresh1755A9/GitEx.git
import com.rs.fer.response.AddExpenseResponseVO;
<<<<<<< HEAD
import com.rs.fer.response.GetExpenseResponseVO;
import com.rs.fer.response.GetExpensesResponseVO;
=======
import com.rs.fer.response.ExpenseReportResponseVO;
import com.rs.fer.response.GetUserResponseVO;
>>>>>>> branch 'master' of https://github.com/naresh1755A9/GitEx.git
import com.rs.fer.response.LoginResponseVO;
import com.rs.fer.response.RegistrationResponseVO;
<<<<<<< HEAD
import com.rs.fer.response.ResetPasswordResponseVO;
=======
import com.rs.fer.response.UpdateUserResponseVO;
>>>>>>> branch 'master' of https://github.com/naresh1755A9/GitEx.git

public interface FERservice {

	RegistrationResponseVO registration(RegistrationRequestVO regReqVO);
<<<<<<< HEAD

	LoginResponseVO login(LoginRequestVO loginReqVo);

	AddExpenseResponseVO addExpense(AddExpenseRequestVO addExpReqVo);

	ResetPasswordResponseVO resetPassword(ResetPasswordRequestVO resetReqVO);

	GetExpenseResponseVO getexpense(int expenseid);

	GetExpensesResponseVO getexpenses(int userid);
=======
 
	LoginResponseVO login(LoginRequestVO loginReqVo);
	
	AddExpenseResponseVO addExpense(AddExpenseRequestVO addExpReqVo);
	
	GetUserResponseVO getUser(int Id);

	ExpenseReportResponseVO expenseReport(ExpenseReportRequestVO reportReqVO);
	
	UpdateUserResponseVO updateUser(UpdateUserRequestVO updateUserReqVO);


	
>>>>>>> branch 'master' of https://github.com/naresh1755A9/GitEx.git
}
