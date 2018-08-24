import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    double usr_heightcm, twoyrd_heightcm; 
    
    twoyrd_heightcm = 6 * 12 * 2.54; 
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Input Height (cm): ");
    usr_heightcm = sc.nextDouble();
    
    System.out.println("2 Yardsticks = 182.88 cm");
    if(usr_heightcm > twoyrd_heightcm){
      
      System.out.println("Taller than 2 yardsticks.");
    }
    else{
      System.out.println("NOT Taller than 2 yardsticks.");
    }
    

  }
}