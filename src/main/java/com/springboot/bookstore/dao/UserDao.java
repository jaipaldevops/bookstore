/**
 * 
 */
package com.springboot.bookstore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.bookstore.entity.User;

/**
 * @author suman
 *
 */
@Repository
public interface UserDao extends JpaRepository<User, Long> {

	List<User> findAll();

	User findByEmail(String email);

}
