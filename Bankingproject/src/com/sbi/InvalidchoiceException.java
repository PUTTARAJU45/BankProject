package com.sbi;

public class InvalidchoiceException extends RuntimeException {
	
private String message;
	
InvalidchoiceException(String message){
		this.message=message;
	}
	public String getmassage() {
		return message;
	}

}
