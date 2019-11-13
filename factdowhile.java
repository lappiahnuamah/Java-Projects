package grading_system;

import java.util.Scanner;

public class factdowhile {

	public static void main(String[] args) {
		int num=1, fact;
		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter a number: ");
		  fact = input.nextInt();
		 
		  do {
			  num = num * fact;
			  fact--;
		  }
		  while(fact != 0);
		 
	System.out.println("The facotrial of the number is " + num);

	}

}
