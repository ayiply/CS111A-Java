import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String person1, person2;
    int age1, age2;
    
    
    System.out.println("Enter First Name");
  Scanner sc = new Scanner(System.in);
  person1 = sc.nextLine();
    System.out.println("Enter age1");
  age1 = sc.nextInt();
  
    System.out.println("Enter Second Name");
  Scanner sc2 = new Scanner(System.in);
  person2= sc2.nextLine();
      System.out.println("Enter age2");
  age2 = sc2.nextInt();
  
  if( age1 < age2 ){
        System.out.printf("%s is older", person2);
    
    
    
  }
  if( age1 > age2){
        System.out.printf("%s is older", person1);
    
  }
  else if( age1 == age2){
        System.out.printf("%s and %s are the same age.", person1, person2);
    
  }
}
}