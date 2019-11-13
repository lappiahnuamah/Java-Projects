package getter;

public class Fibonacci {
	public static void main(String[]args) {
		int first_num = 0;
		int second_num = 1;
		System.out.println("Fibonaci numbers are: "+ first_num + ", "+ second_num + " ");
		
		for(int i=0; i<=10;i++) {
			int next = first_num +second_num;
			System.out.println(next);
			first_num = second_num;
			second_num = next;
		}
	
	}
	
	
}
