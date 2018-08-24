import java.util.Scanner;
import java.util.Arrays;

class Main {
  
  public static void main(String[] args) {
    getInput();
  }
  
/*
  getInput() reads user input and passes the String argument to Palindrome() method
*/
  static void getInput()
  {
    System.out.println("Enter a phrase to be analyzed: ");
    Scanner sc = new Scanner(System.in);
    String user_input = sc.nextLine();
    Palindrome(user_input);
  }

/*
  Palindrome() accepts String arguement 'user_input' and places it into a character array. Comparisons between elements/characters will generate a number of matched characters. 
  If matched characters exceeds or is equal to half or more, the word is a palindrome.
*/

  static void Palindrome(String user_input)
  {
    char[] char_array = user_input.toCharArray();
    int arraylength = (char_array.length);
    int halflength = (arraylength / 2);
    int match = 0; //Keeps track of number of matched characters
    
    
    for( int i = 0; i <= halflength; i++)
    {
      for(int j = arraylength; j >= halflength ; j--)
      {
          if(char_array[i] == char_array[j- 1] )
          {
            //when comparing characters that match
            match++;
          }
          else
          {
            //when comparing characters that dont match
            match--;
          }
          i++;
      }
    }
    //Need to round up halflength.
    
    if(match >= halflength + 1)
    {
     System.out.println("The word you entered, '" + user_input + "' is a palindrome." );
    }
    else
    {
      System.out.println("The word you entered,'" + user_input + "' is not a palindrome.");
    }
  }
 }

