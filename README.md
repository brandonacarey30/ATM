
Computer Science 111
Data Structures and Abstraction
Fall 2013
Program 4: Simulating an Automatic Teller Machine
due Friday September 6 at midnight
Simulating an ATM
Write a program in Java which simulates an ATM. The user is given a starting balance of $200 and
allowed to enter one of four commands, given below.  The command is converted to uppercase
when it is entered, so the user may use uppercase or lowercase to enter the commands.

H: Help. A listing of the legal commands is displayed.

D: Deposit money into the account.  After entering a ’D’, the user is prompted to enter the amount of the deposit, and that amount is added to the current balance.

W: Withdraw money from the account.  After entering a ’W’ , the user is prompted to enter a withdrawal amount.  If that amount is less than the current balance, it is subtracted from the balance.  Otherwise, the message “Insufficient funds” is displayed, and the balance is unchanged.

Q: Quit the program. If the user enters a line that starts with any other character, the message “Invalid command” is displayed. Use a switch statement in your program to select the command to execute.  Failure to use a switch is considered an implementation flaw in your program.

Sample output is included on the back of this page.
Sample output
Here is an example of what the output of your program might look like, with the user’s input in boldface.

Welcome to my ATM.
Commands:  D=Deposit, W=Withdraw, Q=Quit, H=Help
Your current balance is $200.00
Enter command (H for help):
d
How much do you want to deposit?
28.49
Your current balance is $228.49
Enter command (H for help):
w
How much do you want to withdraw?
75.16
Your current balance is $153.33
Enter command (H for help):
z
Invalid command
Your current balance is $153.33
Enter command (H for help):
h
H: Help (print this list)
D: Deposit money
W: Withdraw money
Q: Quit
Your current balance is $153.33
Enter command (H for help):
W
How much do you want to withdraw?
10000
Insufficient funds
Your current balance is $153.33
Enter command (H for help):
q
Goodbye.
Your final balance is $153.33
