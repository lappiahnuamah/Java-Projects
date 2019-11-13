package football;

import java.lang.reflect.Array;
import java.util.Arrays;



public class ArraysWorkings {

	public static void main(String [] args) {
		int [] numbers = { 10,32, 62, 12, 45,78};
		System.out.println(numbers);
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers.length);
	
		String [] names = {
			"Brino" , "Kate", "Owura" , "Stephen"
		};
		
		String name1 = "entertaiment";
		System.out.println(name1.contains("ente".toUpperCase()));
		System.out.println();
		
		
	}
	
}
	