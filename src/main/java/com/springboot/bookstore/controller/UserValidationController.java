/**
 * 
 */
package com.springboot.bookstore.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bookstore.entity.User;
import com.springboot.bookstore.exception.UserNotFoundException;
import com.springboot.bookstore.service.impl.UserServiceImpl;
import com.springboot.bookstore.vo.UserVo;

/**
 * @author suman
 *
 */
@RestController
public class UserValidationController {

	@Autowired
	private UserServiceImpl userService;

	@PostMapping(path = "/api/login")
	public ResponseEntity<User> validateUserDetails(@Valid @RequestBody UserVo user) throws UserNotFoundException {
		return ResponseEntity.ok(userService.validateUserLogin(user.getEmail()));
	}

	
	
}
