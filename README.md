
Computer Science 111<br>
Data Structures and Abstraction<br>
Fall 2013<br>
Program 4: Simulating an Automatic Teller Machine
due Friday September 6 at midnight
Simulating an ATM<br>
Write a program in Java which simulates an ATM. The user is given a starting balance of $200 and
allowed to enter one of four commands, given below.  The command is converted to uppercase
when it is entered, so the user may use uppercase or lowercase to enter the commands.<br>

H: Help. A listing of the legal commands is displayed.<br>

D: Deposit money into the account.  After entering a ’D’, the user is prompted to enter the amount of the deposit, and that amount is added to the current balance.<br>

W: Withdraw money from the account.  After entering a ’W’ , the user is prompted to enter a withdrawal amount.  If that amount is less than the current balance, it is subtracted from the balance.  Otherwise, the message “Insufficient funds” is displayed, and the balance is unchanged.<br>

Q: Quit the program. If the user enters a line that starts with any other character, the message “Invalid command” is displayed. Use a switch statement in your program to select the command to execute.  Failure to use a switch is considered an implementation flaw in your program.<br>

Sample output is included on the back of this page.<br>
Sample output<br>
Here is an example of what the output of your program might look like.<br>

Welcome to my ATM.<br>
Commands:  D=Deposit, W=Withdraw, Q=Quit, H=Help<br>
Your current balance is $200.00<br>
Enter command (H for help):<br>
d<br>
How much do you want to deposit?<br>
28.49<br>
Your current balance is $228.49<br>
Enter command (H for help):<br>
w<br>
How much do you want to withdraw?<br>
75.16<br>
Your current balance is $153.33<br>
Enter command (H for help):<br>
z<br>
Invalid command<br>
Your current balance is $153.33<br>
Enter command (H for help):<br>
h<br>
H: Help (print this list)<br>
D: Deposit money<br>
W: Withdraw money<br>
Q: Quit<br>
Your current balance is $153.33<br>
Enter command (H for help):<br>
W<br>
How much do you want to withdraw?<br>
10000<br>
Insufficient funds<br>
Your current balance is $153.33<br>
Enter command (H for help):<br>
q<br>
Goodbye.<br>
Your final balance is $153.33<br>
