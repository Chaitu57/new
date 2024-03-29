package com.mindgate.pojo;

public class Account {
	/// variables
	
       private int accountNumber;
       private String name;
       private double balance;
       
       /// constructors
       
       public Account() { 
       System.out.println("default constructor of Account");	
       }

	public Account(int accountNumber, String name, double balance) { // para constructor
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		System.out.println("Overloaded constructor of Account");
	}

	//// get and set methods
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
  
	
	///// withdraw method to withdraw
	
	 public boolean withdraw(double amount) {
		 if (amount >0 && balance >= amount) {
			 balance=balance-amount;
			 return true;
		 }
		 return false;
	 }
	 
	 //// deposit method to deposit
	 
      public boolean deposit(double amount) {
    	  if(amount>0) {
    		  balance=balance+amount;
    		  return true;
    	  }
    	  return false;
    	  
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
      
		
	}
	
       
       

