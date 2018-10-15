/**
 * 
 */
package com.springboot.bookstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.bookstore.dao.UserDao;
import com.springboot.bookstore.entity.User;
import com.springboot.bookstore.exception.UserNotFoundException;
import com.springboot.bookstore.service.UserService;
import com.springboot.bookstore.util.EmailValidator;

/**
 * @author suman
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public User validateUserLogin(String email) throws UserNotFoundException{
		EmailValidator emailValidator =  new EmailValidator();
		boolean isEmailValid =  emailValidator.validate(email);
		if(isEmailValid) {
			return userDao.findByEmail(email);	
		}
		throw new UserNotFoundException("Invaid User");
	}

}
