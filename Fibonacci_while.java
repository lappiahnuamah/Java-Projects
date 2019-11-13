package getter;

public class Fibonacci_while {

	public static void main(String[] args) {
		/*
		int num1 = 0;
		int num2 =1;
		int i = 1;
*/
		int num1=0, num2=1, i=1,next;
		System.out.println("The fibonacci series are " + num1 + " "+ num2);
		while(i>2) {
			next = num1+num2;
			System.out.println(next);
			num1 = num2;
			num2 = next;
			i= i+1;
		}
	}

}
