/**
 * 
 */
package com.springboot.bookstore.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.springboot.bookstore.entity.User;

/**
 * @author suman
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class validationControllerTest {

	MockMvc mockMvc;

	@Autowired
	private TestRestTemplate template;

	@Mock
	private validationController validationController;

	@Before
	public void setup() throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(validationController).build();
	}

	private HttpEntity<Object> getHttpEntity(Object body) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		return new HttpEntity<Object>(body, headers);
	}

	@Test
	public void testUserValidation() throws Exception {
		HttpEntity<Object> userVo = getHttpEntity("{\"email\": \"suman@test.com\",  \"password\": \"sumanv\" }");
		ResponseEntity<User> response = template.postForEntity("/api/login", userVo, User.class);
		Assert.assertEquals(200, response.getStatusCode().value());
		Assert.assertEquals("suman@test.com", response.getBody().getEmail());
	}

	@Test
	public void testInvalidUser() throws Exception {
		HttpEntity<Object> userVo = getHttpEntity("{\"email\": \"sumanv@test.com\",  \"password\": \"suman\" }");
		ResponseEntity<User> response = template.postForEntity("/api/login", userVo, User.class);
		Assert.assertEquals(200, response.getStatusCode().value());
		Assert.assertEquals(null, response.getBody());
	}

}
