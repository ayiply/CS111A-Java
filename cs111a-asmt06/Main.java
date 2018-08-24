import java.util.Scanner;
import java.lang.Math;

class Populations {
  public static void main(String[] args) {

  int starting_pop, population;
  final double birth_rate = 0.03;
  final double death_rate = 0.01;
  
//Initialize runAgain character to compare to user input.
  char runAgain;
  
//Outer Loop
do{
  
//Initialize count variable, start counting from 0
  int count = 0; 
//Get user input for starting population.
  System.out.println("How many jackalopes do you have? ");
  Scanner sc = new Scanner(System.in);
  population = sc.nextInt();
//starting_pop variable for final print statements
  starting_pop = population;

//Get user input for wait time (#generations).
 System.out.println("How many generations do you want to wait? ");
  Scanner sc2 = new Scanner(System.in);
  int wait_time = sc2.nextInt();


//Inner Loop 
while(count < wait_time)
{
  //Calculations
  population = (int)(population + (population * birth_rate));
  population = population - ((int)(population * death_rate));
  count++;
}
  System.out.printf("If you start with %d jackalopes and wait %d generations, you'll end up with a total of %d of them. \n", starting_pop, wait_time, population);
  

  System.out.println("Do you want to calculate another population?");
  Scanner sc3 = new Scanner(System.in);
  runAgain = sc3.next().toLowerCase().charAt(0);
}while(runAgain =='y');

  }
}

/* Sample Output
How many jackalopes do you have? 
 200
How many generations do you want to wait? 
 1
If you start with 200 jackalopes and wait 1 generations, you'll end up with a total of 204 of them. 
Do you want to calculate another population?
 y
How many jackalopes do you have? 
 132
How many generations do you want to wait? 
 2
If you start with 132 jackalopes and wait 2 generations, you'll end up with a total of 137 of them. 
Do you want to calculate another population?
 y
How many jackalopes do you have? 
 40
How many generations do you want to wait? 
 100
If you start with 40 jackalopes and wait 100 generations, you'll end up with a total of 291 of them. 
Do you want to calculate another population?
 y
How many jackalopes do you have? 
 451
How many generations do you want to wait? 
 71
If you start with 451 jackalopes and wait 71 generations, you'll end up with a total of 1805 of them. 
Do you want to calculate another population?
 n
*/