import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    
    getAllUserInput();

}

Thursday April 26, 2pm San Rafael. 
2018
/*
    getAllUserInput() returns positive double values for specific variables.  
*/

  static void getAllUserInput()
  {
    //Passes a String to user defined getPosNumber() method.
    double principle = getPosNumber("Enter Amount to Borrow: ");
    double rate = getPosNumber("What is the annual interest rate expressed as a percent?");
    
    //Sets rate as the monthly interest rate from the user input annual interest rate
    rate = rate/1200.0; 
    
    
    
    double payment = getPosNumber("What is the monthly payment amount? ");

    double first_month_interest = principle * (rate) ;
    double min_payment = first_month_interest + 1;
    
    //If payment is less than the interest due at the first month
    if(payment < first_month_interest)
    {
      System.out.println("Monthly payment is insufficient. You must make payments of at least $" + min_payment );
      System.out.println("Because your monthly interest is $" + first_month_interest);
      getAllUserInput();
    }
    else
     payOffLoan(principle, rate, payment);

  }
  

  /*
    getPosNumber(), checks user input is value greater than 0. If not, will reprompt 
    user to input valid input. If user input is valid, then returns user_input as double.   
  */
  
  static double getPosNumber(String prompt)
  {
      double user_input;
      System.out.println(prompt);
      Scanner sc = new Scanner(System.in);
      user_input = sc.nextDouble();
      //while(user_input < 0)
      while(user_input < 0)
      {
        System.out.println("You must enter a positive number.");
        System.out.println(prompt);
        user_input = sc.nextDouble();
        //getPosNumber(prompt); - does not reassign user input to valid input.
        
      }
      
      //returns user_input if greater than 0
      return user_input;
    
  }
  
  /*
  payOffLoan(), performs calculations based on double arguments passed to it by 
  getAllUserInput() method, and outputs last payment, total_interest, and months. 
  */
  static void payOffLoan(double principle, double rate, double payment)
  {
  
  int months = 0; //Counts number of months
  double monthly_interest,last_payment, total_interest = 0;
  
  
  //While principle is a positive value the following operations are performed. 
  while(principle > 0)
  {
    //The monthly interest 
    monthly_interest = principle * rate;
    total_interest = total_interest + monthly_interest;
    principle = principle + monthly_interest - payment;
    months++;
  }
  //To exit the while loop, principle will be a NEGATIVE value. By adding our monthly payment variable to the value stored with principle, we can find out how much the last payment.  
  last_payment = principle + payment;

//Print statements
  System.out.printf("Your debt will be paid off after %d months, with a final payment of just $%,.2f\n", months, last_payment);
  System.out.printf("The total amount of interest you will pay during that time is $%,.2f\n", total_interest);

  
  }
  
    


}

/* SAMPLE OUTPUT

Enter Amount to Borrow: 
 1000
What is the annual interest rate expressed as a percent?
 18
What is the monthly payment amount? 
 50
Your debt will be paid off after 24 months, with a final payment of just $47.83
The total amount of interest you will pay during that time is $197.83

Enter Amount to Borrow: 
 -50
You must enter a positive number.
Enter Amount to Borrow: 
 -2300
You must enter a positive number.
Enter Amount to Borrow: 
 15000
What is the annual interest rate expressed as a percent?
 10
What is the monthly payment amount? 
 100
Monthly payment is insufficient. You must make payments of at least $126.0
Because your monthly interest is $125.0
*/

  
