package com.sbi;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
	
	System.out.println("Welcome to Sbi bank ");
	System.out.println(".....................");
	
	Scanner scan=new Scanner(System.in);
	
	while(true) {
		Banksbi b=new Bank(0);
	System.out.println("enter 1:deposit amount \nenter 2:withdraw amount \nenter 3:get balance \nenter 4:exits the account");
int choice=scan.nextInt();

switch(choice) {

case 1:
	System.out.println("Enter deposited amount: ");
	Double depositamount=scan.nextDouble();
	b.deposit(depositamount);
	break;
	
case 2:
	try {
	System.out.println("Enter withdraw amount:");
Double withdrawamount=scan.nextDouble();
	b.withdraw(withdrawamount);
break;
	}
	catch(InsufficientBalanceException e) {
		System.out.println(e.getmassage());
	}

	
	
case 3:System.out.println("Balance Rs."+b.getbalance());
break;
		
case 4:
	System.out.println("Thank you....");
	System.exit(0);
	break;

default:{
	try {
	throw new InvalidchoiceException("Invalid choice,kindly Enter valid choice");
	
	}
	catch (InvalidchoiceException e) {
	
	System.out.println(e.getMessage());

	}
	
	
}



}
	

	}
}
}
