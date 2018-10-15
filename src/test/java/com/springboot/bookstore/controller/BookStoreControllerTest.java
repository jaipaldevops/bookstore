/**
 * 
 */
package com.springboot.bookstore.controller;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.springboot.bookstore.entity.Books;

/**
 * @author suman
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class BookStoreControllerTest {
	
	MockMvc mockMvc;
	
	@Autowired
	private TestRestTemplate template;

	@Mock
	private BookStoreController bookStoreController;
	
	@Before
	  public void setup() throws Exception {
	    mockMvc = MockMvcBuilders.standaloneSetup(bookStoreController).build();
	  }
	
	@Test
	public void shouldAbleToGetAllBooksData() throws Exception {
		ParameterizedTypeReference<List<Books>> listOfBooks = new ParameterizedTypeReference<List<Books>>() {};
		ResponseEntity<List<Books>> response = template.exchange("/api/books",HttpMethod.GET,null, listOfBooks);
	    Assert.assertEquals(200,response.getStatusCode().value());	
	}

}
