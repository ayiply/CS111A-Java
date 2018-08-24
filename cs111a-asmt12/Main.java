import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) throws FileNotFoundException
  {
    String fileName = "DistanceReport.txt";

      double speed, time, distance, skip;
      Scanner sc = new Scanner(System.in);
      PrintStream o = new PrintStream(new File(fileName));
      PrintStream console = System.out;


//Speed must be zero or greater
System.out.println("Enter the vehicle's speed in miles per hour: ");
speed = sc.nextDouble();

//time must be 60 or greater
System.out.println("Enter the number of minutes the vehicle was in motion: ");
time = sc.nextDouble();
if(time < 0 || time <= 60)
{
  System.out.println("Time must be greater than or equal to 60: ");
  time = sc.nextDouble();
}

//minutes skipped must be between 1-95
System.out.println("How many minutes should be skipped between lines in the report?");
skip = sc.nextDouble();
if(skip < 1 || skip > time)
{
  System.out.println("Minutes skipped must be between 1 and " + time + ":");
  skip = sc.nextDouble();
}

  System.setOut(o);
  System.out.println(String.format("%-20s %s", "Minutes", "Distance"));
  System.setOut(o);
  System.out.println("-------------------------------");
  
for(double i = skip; i <= time; i = i + skip)
{
  distance = ((speed/60) * i);
  System.setOut(o);
  System.out.println(String.format("%-20s %s", i, distance));
}

if(time%skip != 0)
{ 
  distance = (speed/60) * time;
  System.setOut(o);
 System.out.println(String.format("%-20s %s", time, distance));

}
System.setOut(console);
System.out.println("Report written to " + fileName);

  }

}

  