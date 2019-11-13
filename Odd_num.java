package getter;

public class Odd_num {
	public static void main(String []args) {
		System.out.println("The odd numbers are: "); 
		for(int i=1; i<=40; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
	}
}
