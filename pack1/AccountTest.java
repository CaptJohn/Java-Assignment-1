package pack1;

// AccountTest.java
// Inputting and outputting floating-point numbers with Account objects.
import java.util.Scanner;

public class AccountTest
{
    // Main method begins execution of Java app
	public static void main(String[] args)
   {
	  
	  // create a Scanner to obtain input from the command window
	  Scanner input = new Scanner(System.in);

	  // Obtain customer information	  
	  System.out.print("Please enter account number: "); // prompt for acct number
      String accountNumber = input.nextLine(); // obtain user input
      
      System.out.print("Please enter first name: "); // prompt for last name
      String firstName = input.nextLine(); // obtain user input
      
      System.out.print("Please enter last name: "); // prompt for first name
      String lastName = input.nextLine(); // obtain user input

      Account acct = new Account(accountNumber, lastName, firstName); // add info to acct 

      System.out.print("Please enter starting balance: "); // prompt for starting balance
      double balance = input.nextDouble(); // obtain user input
     
      acct.startBalance(balance); //acct.trans(1, balance); // add to balance
            
      // select transaction type
      System.out.print("Please enter transaction type(1=Deposit, -1=Withdrawal, 0=Quit): ");
      int transType = input.nextInt(); // get transaction type
      
      while(transType != 0){
    	  System.out.print("Please enter amount:");
    	  double transAmount = input.nextDouble();
    	  acct.trans(transType, transAmount);
    	  
    	  System.out.print("Please enter transaction type(1=Deposit, -1=Withdrawal, 0=Quit): ");
          transType = input.nextInt(); // get transaction type
            
      } {
       
      acct.printStatement();
      }

      input.close();
      
   } // end main
} // end class AccountTest
