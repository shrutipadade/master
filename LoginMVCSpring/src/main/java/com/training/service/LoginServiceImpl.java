package com.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.dao.LoginDao;
@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private LoginDao loginDao;
	public boolean validateUser(String uname, String upass) {
		
		return loginDao.validateUser(uname, upass);
	}
	

}
