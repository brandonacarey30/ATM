// Brandon Carey
// CSC 111
// September 6 2013
// This program allows a user to deposit and withdrawl money out of an imaginary ATM. The starting balance is $200.00.
// A user will input a desired character (either H: help, D: deposit, W: withdrawl, Q: quit)

import java.util.Scanner;

public class ATM
{
  public static void main(String[] args)
  {
    double balance;
    balance = 200.00;
    char ch;
    String line;
    double deposit;
    double withdrawl;
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to my ATM, "
                      + "Commands: D=Deposit, W=Withdrawl, Q=Quit, H=Help");
    line = input.nextLine();

    while (!line.equalsIgnoreCase("Q"))
    {
      ch = line.charAt(0);
      
      switch (Character.toUpperCase(ch))
      {
        case 'D': 
         System.out.println("How much would you like to deposit?");
          deposit = input.nextDouble();
          input.nextLine();
          balance = deposit + balance;
        break;
         
        case 'W':
         System.out.println("How much money would you like to withdrawl?");
         withdrawl = input.nextDouble();
         input.nextLine();
       
         if (balance < withdrawl){
         System.out.println("Sorry insufficient funds.");
         }
         else balance = balance - withdrawl;

        break;

        case 'Q':    
        case 'H':
          System.out.println("H: Help (print this list)");
          System.out.println("D: Deposit Money");
          System.out.println("W: Withdraw Money");
          System.out.println("Q: Quit");
        break;
        
        default:
          System.out.println("Invalid Execution");
        break;
          
       }
       System.out.println("Your current balance is: $" + balance + ", please "
                         + "enter another command.");
       line = input.nextLine();
     }
     
     System.out.println("Thank you! Your ending balance "
                         + "is: $" + balance + ". Have a nice day.");
   }
 }




