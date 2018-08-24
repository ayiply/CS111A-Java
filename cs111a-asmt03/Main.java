import java.util.Scanner;
 
class Main {
  public static void main(String[] args) {
   
    int numDays, numRiders;
    String lineName;
    double average;
   
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Welcome to the Muni Ridership Calculator.");
 
    System.out.println("Which Muni Line did you survey: ");
    lineName = sc.nextLine();
    System.out.println("How many days did you survey ridership?: ");
    numDays = sc.nextInt();
    System.out.println("How many riders did you count?: ");
    numRiders = sc.nextInt();
 
    average = (double)numRiders/numDays;
    System.out.printf("According to your survey, an average of %,.2f people rode the %s per day.", average, lineName);
 
  }
}