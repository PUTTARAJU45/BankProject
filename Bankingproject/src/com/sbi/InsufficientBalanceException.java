package com.sbi;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends RuntimeException {
	
	private String message;
	
	InsufficientBalanceException(String message){
		this.message=message;
	}
	public String getmassage() {
		return message;
	}

}
