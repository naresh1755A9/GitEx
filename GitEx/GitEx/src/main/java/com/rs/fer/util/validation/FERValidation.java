package com.rs.fer.util.validation;

import java.util.Set;

import com.rs.fer.request.AddExpenseRequestVO;
import com.rs.fer.request.ExpenseReportRequestVO;
import com.rs.fer.request.LoginRequestVO;
import com.rs.fer.request.RegistrationRequestVO;
import com.rs.fer.request.UpdateUserRequestVO;

public interface FERValidation {

	Set<String> validateRegistrationRequest(RegistrationRequestVO registrationRequestVO);

	Set<String> validateLoginRequest(LoginRequestVO loginReqVO);

	Set<String> validateAddExpenseRequest(AddExpenseRequestVO addExpReqVO);

	Set<String> validateGetUser(int Id);

	Set<String> validateExpenseReport(ExpenseReportRequestVO reportReqVO);

	Set<String> validateUpdateUser(UpdateUserRequestVO updateUserReqVO);

}
