/**
 * 
 */
package com.springboot.bookstore.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.bookstore.service.impl.UserServiceImpl;
import com.springboot.bookstore.vo.UserVo;

/**
 * @author suman
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(controllers = UserValidationController.class)
public class UserValidationControllerTest {
	
	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;
	
	@MockBean
	private UserServiceImpl userService;
	
	@Test
	public void shouldAbleToValidateUserDetails() throws Exception {
		UserVo user= new UserVo("suman@test.com","sumanv");
		mockMvc.perform(MockMvcRequestBuilders.post("/api/login").contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(user)))		
				.andExpect(status().isOk());
	}
	

	@Test
	public void shouldAbleToThrowExceptionOnValidateUser() throws Exception {
		UserVo user= new UserVo("suman@test.com",null);
		mockMvc.perform(MockMvcRequestBuilders.post("/api/login").contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(user)))		
				.andExpect(status().isBadRequest());
	}

}
