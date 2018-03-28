package pack1;

// MIS-515: Assignment 1 - John Shepherd
// Account.java
// Account class with a double instance variable balance and a constructor
// and deposit method that perform validation.

public class Account
{   
   private String accountNumber; // instance variable
   private String lastName; // instance variable
   private String firstName; // instance variable
   private double balance; // instance variable 
   private double beginningBalance; // instance variable 
   private double totalDeposits; // instance variable 
   private double totalWithdrawals; // instance variable 

   // Account constructor that receives three parameters  
   public Account(String accountNumber, String lastName, String firstName) 
   {
      this.accountNumber = accountNumber; // assign account number to instance variable accountNumber   
      this.lastName = lastName; // assign name to instance variable name
      this.firstName = firstName; // assign name to instance variable name
   }

   // method that sets starting balance (adds) only a valid amount to the balance
   public void startBalance(double beginningBalance) 
   {      
      this.beginningBalance = beginningBalance; // set starting balance  
      this.balance = balance + beginningBalance; // add starting balance to the balance 
      }

   // method that deposits (adds) only a valid amount to the balance
   public void deposit(double depositAmount) 
   {      
      this.balance = balance + depositAmount; // add it to the balance 
      this.totalDeposits += depositAmount; 
   }

   // method that withdraws (subtracts) only a valid amount from the balance
   public void withdraw(double withdrawAmount) 
   {      
      this.balance = balance - withdrawAmount; // subtract it from the balance 
      this.totalWithdrawals += withdrawAmount;
   }

   // method that checks input type
   public void trans(int transOption, double amount) 
   {      
      if(transOption == 0) {

      } else if(transOption ==-1) 
      {
    	  withdraw(amount);
      } else{
    	  deposit(amount);
      }
    }

   // method that returns the account balance
   public double getBalance()
   {
      return this.balance; 
   } 

   // method that sets the account number
   public void setAccountNumber(String accountNumber)
   {
      this.accountNumber = accountNumber; 
   } 

   // method that returns the account number
   public String getAccountNumber()
   {
      return this.accountNumber; 
   } 

   // method that sets the customer name
   public void setName(String lastName, String firstName)
   {
      this.lastName = lastName; 
      this.firstName = firstName; 
    } 
   // method that returns the customer name
   public String getName()
   {
      return (this.lastName + ", "+ this.firstName); 
   } 
   
   // method to print account statement
   public void printStatement()
   {
	   System.out.printf("%n%nAccount Number: %s%n", this.getAccountNumber());
	   System.out.printf("Customer Name: %s%n", this.getName());;
	   System.out.printf("Beginning Balance: $%.2f%n", this.beginningBalance);
	   System.out.printf("Total Deposits: $%.2f%n", this.totalDeposits);
	   System.out.printf("Total Withdrawals: $%.2f%n", this.totalWithdrawals);
	   if(this.balance < 0){
		   System.out.println("Account is overdrawn.");
	   } else{ 
	  	   System.out.printf("Ending Balance: $%.2f%n", this.balance);
	   }
   }
} // end class Account
