package com.sbi;

public class Bank implements Banksbi{
	double balance;

	Bank(double balance){
		this.balance=balance;
	}

	public void deposit(double amount) {
		System.out.println("Depositing Rs."+amount);
		balance+=amount;
		System.out.println("Total balance"+balance);
	System.out.println("Amount deposited successfully.......");	
	System.out.println();
	System.out.println();
	System.out.println();

	}
	public void withdraw(double amount) throws InsufficientBalanceException {
		if(amount <=balance) {
		
		System.out.println("withdraw Rs."+amount);
		balance-=amount;
		System.out.println("Amount withdraw Succesfully");
		System.out.println();
		System.out.println();
		System.out.println();
		}
		else {
			throw new InsufficientBalanceException("Insufficient Balance.....");
		}

	}
	public double getbalance() {

		return balance;
	}

}
