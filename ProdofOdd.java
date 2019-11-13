package football;

public class ProdofOdd {

	public static void main(String[] args) {
		/*
		int product=1, n=1;
		while(n<=20) {
			if(n%2==1) {
				product*=n;
			}
			n++;
		}
		System.out.println("The product of the 10 odd numbers are: " + product);

*/
	
	int cnt = 0;
	int odd = 1;
	int prod = 1;
	while (cnt < 10) {
	     prod *= odd;
	     odd += 2;
	     cnt++;
	}
	System.out.println("The product of the 10 odd numbers are: " + prod);
	
	for(int i=0; i<10; i++) {
		System.out.print(i + " ,");
	     i+=2;
	}
	}
}