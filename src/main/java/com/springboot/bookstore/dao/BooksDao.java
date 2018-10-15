/**
 * 
 */
package com.springboot.bookstore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.bookstore.entity.Books;

/**
 * @author suman
 *
 */
@Repository
public interface BooksDao extends JpaRepository<Books, Long>{
	
	List<Books> findAll();

}
