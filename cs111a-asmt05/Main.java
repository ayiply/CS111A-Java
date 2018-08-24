/* Craig Persiko - CS 111A - Sample program

   Invest.java



   A program to calculate the interest earned on an investment over time.

*/



import java.util.Scanner;



public class Main

{

  public static void main(String args[])

  {

    Scanner scan = new Scanner (System.in);

    double balance;

    int yearsPassed = 0;



    System.out.print("How much money do you want to invest? $");

    balance = scan.nextDouble();



    while(yearsPassed < 7)  // repeat each year for 7 years

    {

      balance += balance * 0.05;  // add 5% interest to the balance.

      yearsPassed++;     // count the year

      System.out.printf("after %d years: %,.2f \n", yearsPassed, balance);

    }

    System.out.println();



    System.out.printf("After 7 years at 5%% interest, " + "you will have $%,.2f \n\n", balance);

  }

}



/* Sample output:



[cpersiko@fog cs111a]$ javac Invest.java
[cpersiko@fog cs111a]$ java Invest
How much money do you want to invest? $1000
after 1 years: 1,050.00 
after 2 years: 1,102.50 
after 3 years: 1,157.63 
after 4 years: 1,215.51 
after 5 years: 1,276.28 
after 6 years: 1,340.10 
after 7 years: 1,407.10 

After 7 years at 5% interest, you will have $1,407.10 

[cpersiko@fog cs111a]$ java Invest
How much money do you want to invest? $275.25
after 1 years: 289.01 
after 2 years: 303.46 
after 3 years: 318.64 
after 4 years: 334.57 
after 5 years: 351.30 
after 6 years: 368.86 
after 7 years: 387.30 

After 7 years at 5% interest, you will have $387.30 

[cpersiko@fog cs111a]$



*/