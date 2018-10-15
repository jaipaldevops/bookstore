/**
 * 
 */
package com.springboot.bookstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.bookstore.dao.BooksDao;
import com.springboot.bookstore.entity.Books;
import com.springboot.bookstore.service.BookService;

/**
 * @author suman
 *
 */
@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BooksDao booksDao;

	@Override
	public List<Books> getListOfBooks() {		
		return booksDao.findAll();
	}

}
