import java.io.*;

class Main {
  
  public static void main(String[] args) throws IOException {

    //BufferedReader will allow system to do things with input before storing the value to array. 
  BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); 
  
  int uniqueValues = 1; //number of unique values
  
  int checkthisnumber; //number that will be parsed and checked before being entered in array
  
  int[] myArray = new int[10];
  boolean check;

  
  System.out.println("Please enter 10 integers, hitting return after each one:");
  myArray[0] = Integer.parseInt(input.readLine());
  for (int i=1; i < 10; i++)
   {  
    checkthisnumber = Integer.parseInt(input.readLine());
    check = duplCheck(myArray, checkthisnumber, uniqueValues);
    if(check)
    {
      myArray[uniqueValues] = checkthisnumber;
      uniqueValues += 1;
    }

    }
  System.out.println("Number of unique values entered: " + uniqueValues);
  System.out.println("These are the unique numbers: ");
  for(int i = 0; i < uniqueValues; i++)
  {
    System.out.print(myArray[i] + " ");
  }
  }

  

  static boolean duplCheck(int[] checkArray, int thatnumber, int numIterations)
  {
    boolean notDupe = true;
    for(int j =0; j <= numIterations; j++)
    {
      if(thatnumber == checkArray[j])
      {
      notDupe = false;
      return notDupe;
        
      }
  
    }
    return notDupe;
    
  }
}

/*SAMPLE OUTPUT

Please enter 10 integers, hitting return after each one:
 1
 2
 3
 4
 5
 6
 6
 6
 6
 6
Number of unique values entered: 6
These are the unique numbers: 
1 2 3 4 5 6    

Please enter 10 integers, hitting return after each one:
 1
 1
 1
 1
 1
 1
 1
 1
 1
 1
Number of unique values entered: 1
These are the unique numbers: 
1    
*/