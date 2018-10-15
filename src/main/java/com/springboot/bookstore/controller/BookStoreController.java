/**
 * 
 */
package com.springboot.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bookstore.entity.Books;
import com.springboot.bookstore.service.BookService;

/**
 * @author suman
 *
 */
@RestController
public class BookStoreController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping(path="/api/books")
	public ResponseEntity<List<Books>> fetchListOfBooks(){
		return ResponseEntity.ok(bookService.getListOfBooks());
	}  
	
	

}
