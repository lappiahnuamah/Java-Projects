package getter;

import java.util.Scanner;
class Para {
	public String speak(String text) {
		System.out.println(text);
		return text;
	}
	
	public double addition(double operator1, double operator2) {
		
		System.out.println("The sum of the opeartors are " + (operator1 + operator2));
		return operator1+operator2;
		
	}
}

public class Method {
	
	public static void main(String[] args) {
		Para para = new Para();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter operator 1: ");
		double operator1 = input.nextDouble();
		
		System.out.println("Enter operator 2: ");
		double operator2 = input.nextDouble();
		
		para.addition(operator1, operator2);
	
	}

}