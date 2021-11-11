package com.exceptionfiles;


public class BankAccount {
private double balance;
private int number;
public BankAccount(int number) {
	this.number=number;
}
public void deposit(double amount) {
	balance+=amount;
}
public void withdraw(double amount)
throws InsufficientFundsException{
	if(amount<=balance) {
		balance-=amount; 
	}else {
		double needs=amount-balance;
		throw new InsufficientFundsException();
	}
}
public double getBalance() {
	return balance;
}
public int getNumber() {
	return number;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
