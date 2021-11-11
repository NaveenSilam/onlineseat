package com.exceptionfiles;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankAccount c=new BankAccount(101);
System.out.println("depositing rs 1000");
c.deposit(1000);
try {
	System.out.println("\n withdrawing 600..");
	c.withdraw(600.00);
	System.out.println("\n withdrawing 800..");
	c.withdraw(800.00);
}
catch(InsufficientFundsException e) {
	System.out.println("Insufficient funds: you need rs:"+e.getMessage());
	
}
	
}

	
}