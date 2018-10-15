/**
 * 
 */
package com.springboot.bookstore.service;

import com.springboot.bookstore.entity.User;
import com.springboot.bookstore.exception.UserNotFoundException;

/**
 * @author suman
 *
 */
public interface UserService {

	User validateUserLogin(String email) throws UserNotFoundException;


}
