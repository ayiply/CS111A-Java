import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int size;

    int count = 0;
    char character;
    
    System.out.println("This program will output a parallelogram.");
    
    System.out.println("How long do you want each side to be? : ");
    Scanner sc = new Scanner(System.in);
    size = sc.nextInt();
    
    System.out.println("Please enter the character you want it to be made of: ");
    Scanner sc2 = new Scanner(System.in);
    character = sc2.next().charAt(0);
    
    System.out.print("\n");
    
    
//How many lines to print top triangle
for(int i = 1; i <= size; i++)
    {
      //When to print 
      for(int j = 1; j< (i + 1); j++)
      {
        //Specifically when to print character or space
        if (j == 1 || i == j)
          System.out.print(character);  
          
        else
          System.out.print(" ");
      }  
      System.out.print("\n");
    }



    
    int bot_space = 2;   
    for (int k = 1; k < size; k++)
	    {
		    for (int m = 1; m <= size; m++)
		  {
		    if (m == bot_space || m == size){
			    System.out.print (character);
		    }
	   	  else
	   	    System.out.print (" ");
		  }
		System.out.print ("\n");
		bot_space++;
	    }
  	    System.out.println();
	
  }
}