package getter;

public class MulOfThree {
	public static void main(String[]args) {
		int j =3, sum=0;
		/*
		for(int i=1; i<=100; i++) {
			sum = sum +j;
			j=j+3;
		}
		*/
		
		for(int i=1; i<=100; i++) {
			sum = sum +(3*i);
		}
		
		System.out.println("The sum of the multiples of 3 b/n 1 and 100 are: " + sum);
	}
}
