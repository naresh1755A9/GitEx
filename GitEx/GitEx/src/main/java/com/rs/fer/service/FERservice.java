package com.rs.fer.service;

import com.rs.fer.request.RegistrationRequestVO;
import com.rs.fer.response.RegistrationResponseVO;

public interface FERservice {
	
	RegistrationResponseVO registration(RegistrationRequestVO regReqVO);

}
