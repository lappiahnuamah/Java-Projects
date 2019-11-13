package grading_system;

public class Arrays {

	public static void main(String[] args) {
		int [] values;
		values  = new int [3];
		values[0] = 2;
		values[1] = 21;
		values[2] = 30;
		System.out.println("The value is: " + values[0]);
		System.out.println("The value is: " + values[1]);
		System.out.println("The value is: " + values[2]);

		int[] items = {34,90,23};
		for(int item : items) {
			System.out.println(item);
		}
		
		/*
		int [] number = {20, 14, 7};
		for (int i = 0;i <= number.length;i++) {
			System.out.println("These numbers are found in the number content " + number[i]);
		}
		*/
		
		
		
	}

}
