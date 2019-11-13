package getter;
import java.util.Scanner;
public class interest {

	public static void main(String[] args) {
		double rate = 0.1 , time = 0.5, interest, amount, prin;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal:");
		prin = sc.nextDouble();
		interest = (rate * time * prin ) /100;
		System.out.println("Your interest is: " + interest);
		System.out.println("And the amount is: " + (interest + prin));
		

	}

}
