package com.rs.fer.service;

import com.rs.fer.request.AddExpenseRequestVO;
<<<<<<< HEAD
import com.rs.fer.request.EditExpenseRequestVO;
=======
import com.rs.fer.request.ExpenseReportRequestVO;
>>>>>>> branch 'master' of https://github.com/naresh1755A9/GitEx.git
import com.rs.fer.request.LoginRequestVO;
<<<<<<< HEAD
import com.rs.fer.request.RegistrationRequestVO;
<<<<<<< HEAD
import com.rs.fer.request.ResetPasswordRequestVO;
=======
import com.rs.fer.request.UpdateUserRequestVO;
>>>>>>> branch 'master' of https://github.com/naresh1755A9/GitEx.git
import com.rs.fer.response.AddExpenseResponseVO;
<<<<<<< HEAD
import com.rs.fer.response.DeleteExpenseResponseVO;
import com.rs.fer.response.EditExpenseResponseVO;
=======
<<<<<<< HEAD
=======
import com.rs.fer.request.RegistrationRequestVO;
import com.rs.fer.request.ResetPasswordRequestVO;
import com.rs.fer.request.UpdateUserRequestVO;
import com.rs.fer.response.AddExpenseResponseVO;
>>>>>>> branch 'master' of https://github.com/naresh1755A9/GitEx.git
import com.rs.fer.response.GetExpenseResponseVO;
import com.rs.fer.response.GetExpensesResponseVO;
import com.rs.fer.response.ExpenseReportResponseVO;
<<<<<<< HEAD
import com.rs.fer.response.GetUserResponseVO;
>>>>>>> branch 'master' of https://github.com/naresh1755A9/GitEx.git
>>>>>>> branch 'master' of https://github.com/naresh1755A9/GitEx.git
=======
import com.rs.fer.response.GetUserResponseVO;
>>>>>>> branch 'master' of https://github.com/naresh1755A9/GitEx.git
import com.rs.fer.response.LoginResponseVO;
import com.rs.fer.response.RegistrationResponseVO;
import com.rs.fer.response.ResetPasswordResponseVO;
import com.rs.fer.response.UpdateUserResponseVO;

public interface FERservice {

	RegistrationResponseVO registration(RegistrationRequestVO regReqVO);

	LoginResponseVO login(LoginRequestVO loginReqVo);

	AddExpenseResponseVO addExpense(AddExpenseRequestVO addExpReqVo);

	ResetPasswordResponseVO resetPassword(ResetPasswordRequestVO resetReqVO);

	GetExpenseResponseVO getexpense(int expenseid);

	GetExpensesResponseVO getexpenses(int userid);
 
<<<<<<< HEAD
	LoginResponseVO login(LoginRequestVO loginReqVo);
	
	AddExpenseResponseVO addExpense(AddExpenseRequestVO addExpReqVo);
	
<<<<<<< HEAD
	EditExpenseResponseVO editExpense(EditExpenseRequestVO editReqVo);

	DeleteExpenseResponseVO deleteExpense(int expenseid);
	
=======
=======
>>>>>>> branch 'master' of https://github.com/naresh1755A9/GitEx.git
	GetUserResponseVO getUser(int Id);

	ExpenseReportResponseVO expenseReport(ExpenseReportRequestVO reportReqVO);
	
	UpdateUserResponseVO updateUser(UpdateUserRequestVO updateUserReqVO);


<<<<<<< HEAD
	
>>>>>>> branch 'master' of https://github.com/naresh1755A9/GitEx.git
>>>>>>> branch 'master' of https://github.com/naresh1755A9/GitEx.git
=======
	
>>>>>>> branch 'master' of https://github.com/naresh1755A9/GitEx.git
}
