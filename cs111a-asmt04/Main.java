import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
  int sec_time;
  int sec_min = 60; //seconds in a minute
  int sec_hour = 3600; //3600 seconds in an hour_time
  int sec_day = 86400; //seconds in a day 
  
  
  Scanner sc = new Scanner(System.in);  
  System.out.println("Enter the number of seconds: ");
  sec_time = sc.nextInt();
  
  int num_days = (sec_time / sec_day);  //Return number of days given seconds
  int hour_time = (sec_time % sec_day) / sec_hour; //After dividing seconds for number of whole days, calculates remainder into hours
  int min_time = (((sec_time % sec_day) % sec_hour) / sec_min); // After determining whole integer hours, finds remaining minutes
  int sec_rem = (((sec_time % sec_day) % sec_hour) % sec_min); //Remainder seconds
  
  
  
  
  if( sec_time >= 86400 ){
  System.out.printf("%n That equals %d day(s) %d hours %d minutes %d seconds", num_days, hour_time, min_time, sec_rem);
  }
  if( sec_time < 86400 && sec_time >= 3600){
  System.out.printf("%n That equals: %d hours %d minutes %d seconds", hour_time, min_time, sec_rem);
  }
  if( sec_time < 3600 ){
  System.out.printf("%n That equals: %d minutes and %d seconds", min_time, sec_rem);
  }
  
  
    
    
    
    
    
  }
}