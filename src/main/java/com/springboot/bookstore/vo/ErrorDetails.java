/**
 * 
 */
package com.springboot.bookstore.vo;

import java.util.Date;

/**
 * @author suman
 *
 */
public class ErrorDetails {
	private Date timestamp;
	private String message;
	private String details;

	public ErrorDetails(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

}