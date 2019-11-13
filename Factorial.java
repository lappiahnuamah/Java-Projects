package grading_system;
import java.util.Scanner;

public class Factorial {
	
  public static void main(String[] args) {
	  int num=1, fact;
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter a number: ");
	  fact = input.nextInt();
	  
	  while(fact != 0) {
			  num = num * fact;
			  fact--;
	  }
	 
System.out.println("The facotrial of the number is " + num);
  }
}
