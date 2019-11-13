package football;
import java.util.InputMismatchException;
//import java.util.*;
import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		try {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		double a = input.nextDouble();
		
		System.out.println("Enter an operator in A, S, M and D");
		char c = input.next().toUpperCase().charAt(0);
		
		System.out.println("Enter the second number: ");
		double b = input.nextDouble();
		
		
			if(c =='A') { 
				System.out.println("The addition of the two numbers be "+ (a+b));}
			else if(c=='S') {
				System.out.println("The substraction of the two numbers be "+ (a-b));}
			else if(c=='M') {
				System.out.println("The multiplication of the two numbers be "+ (a*b));}
			else if (c=='D') {
				System.out.println("The division of the two numbers be "+ (a/b));
			}else {
				System.out.println("Invalid Operator");
			}
			
		}catch(ArithmeticException e){
				System.out.print("Invalid Operator");
		}catch(InputMismatchException e) {
				System.out.println("It is not supposed to be a string");
		}
		
	}
		
}
