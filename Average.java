package getter;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double sum = 0, n, avg, x;
		/*
		System.out.println("Please User enter the number of numbers to input");
		n = input.nextDouble();
		int i=1;
		while(i<=n) {
			System.out.println("Enter number "+ i);
			x = input.nextDouble();
			sum= sum+x;
			i=i+1;
		}
		avg = sum/n;
		System.out.println("The average of the numbers are: "+ avg);
*/
		System.out.println("Please User enter the number of numbers to input");
		n = input.nextDouble();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Enter number" + i);
			x = input.nextDouble();
			sum = sum+x;
		}
		avg = sum/n;
		System.out.println("The average of the numberes are: "+ avg);
	}

}
