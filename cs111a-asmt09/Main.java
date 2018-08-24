import java.util.Scanner;
import java.util.Arrays;

public class Main
{
  public static void main(String[] args)
  {
    String phrase;
    int numWords;

   phrase = inputPhrase();

   numWords = analyzePhrase(phrase);

    System.out.println("Your phrase has " + numWords + " word(s) in it.");
    System.out.println();
  }


  /**
    inputPhrase method
    Ask the user to input a phrase, and make sure it is at least 5 characters long
    @return the phrase
  */
  static String inputPhrase()
{
    String phrase;
    System.out.printf("\nPlease enter a phrase all on one line, \nwith just one space separating each word, \nand no spaces at the beginning or end of the phrase.\n");
    Scanner sc = new Scanner(System.in);
    phrase = sc.nextLine();
    
    //Will exit program if phrase is not at least 5 characters long
    if (phrase.length() < 5)
    {
      System.out.println("Phrase must be longer than 5 character long");
      System.exit(0);
    }
      return phrase;
}

  /**
     analyzePhrase method
     Count the number of words in a given string, and determine its longest word.
     Assume the string is well formed and doesn't have leading 
     or trailing spaces, or multiple spaces in a row, and number of words is returned.
     Longest word is output on the console.
     @param str string to analyze
     @return number of words in str
  */ 
  
  static int analyzePhrase(String phrase)
  {
    int longestwordchar = 0;
    String longestword = "empty";
    //create an array of strings from phrase. .split() will read space as a delimiter between elements. 
    String[] stringArray = phrase.split(" ");
    int arraysize = stringArray.length;
     
      if (arraysize == 1)
  {
        longestword = stringArray[0];
        longestwordchar = stringArray[0].length();
  }
  

//Compare array element j to rest of the array
    for(int j = 0; j < arraysize ; j++)
    {
      for(int k = 0; k < arraysize ; k++)
      {
      if(stringArray[j].length() < stringArray[k].length())
       {
        longestword = stringArray[k];
        longestwordchar = stringArray[k].length();
        }
      else if(stringArray[0].length() > stringArray[j].length())
        {
        longestword = stringArray[0];
        longestwordchar = stringArray[0].length();
        }
        
     }       
  }
  System.out.println("The longest word in your phrase is \"" + longestword + "\" with " + longestwordchar + " characters");


  //Will count spaces in between words.
    int wordcount = 1; //Start counting at 1 because string will end without space.

    for(int i = 0; i < phrase.length(); i++)
    {
      if (phrase.charAt(i) == ' ')
      {
        wordcount++;
      }
     
    }

   return wordcount;
  
  }
  
}
