/**
 * 
 */
package com.springboot.bookstore.vo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Required;


/**
 * @author suman
 *
 */
public class UserVo {

	
	@NotNull
	@NotEmpty
	private String email;
	@NotNull
	private String password;
	
	public UserVo() {}
	
	public UserVo(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	@Required
	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	@Required
	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

}
