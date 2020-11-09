package com.rs.fer.util.impl;

import org.springframework.stereotype.Component;

<<<<<<< HEAD
=======
import com.rs.fer.bean.Address;
>>>>>>> branch 'master' of https://github.com/naresh1755A9/GitEx.git
import com.rs.fer.bean.Expense;
import com.rs.fer.bean.User;
import com.rs.fer.request.AddExpenseRequestVO;
import com.rs.fer.request.RegistrationRequestVO;
import com.rs.fer.request.UpdateUserRequestVO;
import com.rs.fer.util.FERUtil;

@Component
public class FERUtilImpl implements FERUtil {

	@Override
	public User loadUser(RegistrationRequestVO regReqVO) {

		User user = new User();
		user.setFirstname(regReqVO.getFirstname());
		user.setMiddlename(regReqVO.getMiddlename());
		user.setLastname(regReqVO.getLastname());
		user.setEmail(regReqVO.getEmail());
		user.setUsername(regReqVO.getUsername());
		user.setPassword(regReqVO.getPassword());
		user.setMobile(regReqVO.getMobile());

		user.setCreated(DateUtil.getCurrentDate());

		return user;
	}

	@Override
	public Expense loadExpense(AddExpenseRequestVO addExpReqVO) {

		Expense expense = new Expense();
<<<<<<< HEAD

		expense.setExpensetype(addExpReqVO.getExpensetype());
=======
		
		expense.setExpenseType(addExpReqVO.getExpenseType());
>>>>>>> branch 'master' of https://github.com/naresh1755A9/GitEx.git
		expense.setDate(addExpReqVO.getDate());
		expense.setPrice(addExpReqVO.getPrice());
		expense.setNumberOfItems(addExpReqVO.getNumberOfItems());
		expense.setTotal(addExpReqVO.getTotal());
<<<<<<< HEAD
		expense.setBywhom(addExpReqVO.getBywhom());
		expense.setUserid(addExpReqVO.getUserid());

=======
		expense.setByWhom(addExpReqVO.getByWhom());
		expense.setUserId(addExpReqVO.getUserId());
		
>>>>>>> branch 'master' of https://github.com/naresh1755A9/GitEx.git
		expense.setCreated(DateUtil.getCurrentDate());

		return expense;
	}
	
	@Override
	public User loadUpdateUser(UpdateUserRequestVO updateUserReqVO) {
	
		User user=new User();
		user.setId(updateUserReqVO.getUserId());
		user.setFirstname(updateUserReqVO.getFirstname());
		user.setLastname(updateUserReqVO.getLastname());
		user.setEmail(updateUserReqVO.getEmail());
		user.setMobile(updateUserReqVO.getMobile());
		user.setUsername(updateUserReqVO.getUsername());
		user.setPassword(updateUserReqVO.getPassword());
		user.setUpdated(DateUtil.getCurrentDate());
		
		Address address=user.getAddress();
		
		int addId=updateUserReqVO.getAddressId();
		if(addId<=0) {
			address.setCreated(DateUtil.getCurrentDate());
		}else {
			address.setUpdated(DateUtil.getCurrentDate());
		}
		address.setLineOne(updateUserReqVO.getLine1());
		address.setLineTwo(updateUserReqVO.getLine2());
		address.setCity(updateUserReqVO.getCity());
		address.setState(updateUserReqVO.getState());
		address.setPincode(updateUserReqVO.getPostal());
		address.setCountry(updateUserReqVO.getCountry());
		
		return user;
	}

}