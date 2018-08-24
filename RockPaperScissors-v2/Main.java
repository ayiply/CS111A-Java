import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
  String User_Input;
  String Game_Move = "Something";
  int User_Move, Random_Move;

  // Let 0 = Rock, 1 = Paper, 2 = Scissors
  
  Random_Move = (int)(2 * Math.random()); //Random integer between 0-2 generated
  if(Random_Move == 0){
  Game_Move = "ROCK";
  
  }
  if(Random_Move == 1){
  Game_Move = "PAPER";
    
  }
  
  if(Random_Move == 2){
  Game_Move = "SCISSORS";
    
  }
  
  System.out.printf("%n Welcome to Andy's Rock Paper Scissors Game! %n Enter Move: ");
  
  Scanner scan = new Scanner(System.in);
  User_Input = scan.nextLine();
  User_Input = User_Input.toUpperCase(); //Handles case of lower-case entry
  Game_Move = Game_Move.toUpperCase();  //Compare String literal 

System.out.printf("%n You Chose: %s %n Game Chose: %s %n",User_Input,Game_Move);


  if(User_Input.equals(Game_Move)){
    System.out.println("Tie!");
  }
  switch(Game_Move){
    
    case "ROCK":
    case "PAPER":
    case "SCISSORS": 

    
    
  }
  
/*  else if(User_Input.equals("ROCK")){
    if(Game_Move.equals("PAPER")){
      System.out.println("PAPER EATS ROCK. YOU LOSE!");
    }
      
    }
  else if(User_Input.equals("ROCK")){
    if(Game_Move.equals("SCISSORS")){
      System.out.println("ROCK CRUSHES SCISSORS. YOU WIN!");
    }}
  else if(User_Input.equals("SCISSORS")){
    if(Game_Move.equals("ROCK")){
      System.out.println("ROCK CRUSHES SCISSORS. YOU LOSE!");
    }
  }
  else if(User_Input.equals("SCISSORS")){
    if(Game_Move.equals("PAPER")){
      System.out.println("SCISSORS CUTS PAPER. YOU WIN!");
    }
  }
   else if(User_Input.equals("PAPER")){
    if(Game_Move.equals("ROCK")){
      System.out.println("PAPER EATS ROCK. YOU WIN!");
    }
   }
  else if(User_Input.equals("PAPER")){
    if(Game_Move.equals("SCISSORS")){
      System.out.println("SCISSORS CUTS PAPER. YOU LOSE!");
    }
  }
  else
    System.out.println("Invalid Input");

*/  
    
  
  }
}