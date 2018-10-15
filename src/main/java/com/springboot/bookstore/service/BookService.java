/**
 * 
 */
package com.springboot.bookstore.service;

import java.util.List;

import com.springboot.bookstore.entity.Books;

/**
 * @author suman
 *
 */
public interface BookService {
	List<Books> getListOfBooks();
}
