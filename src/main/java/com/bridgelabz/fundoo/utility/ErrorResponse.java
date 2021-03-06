package com.bridgelabz.fundoo.utility;

import java.time.LocalDateTime;
import java.util.List;

public class ErrorResponse {

	 private LocalDateTime dateTime;
	 private String message;
	 private List<String> details;
	 


	public ErrorResponse(LocalDateTime dateTime, String message, List<String> details) {
		super();
		this.dateTime = dateTime;
		this.message = message;
		this.details = details;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getDetails() {
		return details;
	}

	public void setDetails(List<String> details) {
		this.details = details;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
		 
}
