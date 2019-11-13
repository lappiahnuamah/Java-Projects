package grading_system;

import java.util.Scanner;

public class Cafetaria {
	/*
	A number of students were asked to rate on a scale of 1 to 5, 
	the quality of food in the student cafetaria. Determine the 
	frequency of each rating using arrays 

	*/
	public static void main(String[] args) {
		System.out.println("=========================");
		System.out.println(" STUDENT CAFETARIA SHOP ");
		System.out.println("=========================");
		
//		int num;
		Scanner input = new Scanner(System.in);
//		System.out.println(" Enter the number of students who purchased the item? ");
//		num = input.nextInt();
		
		/*
		String [] name;
		name = new String[num];
		
		for(int counter= 0; counter < num; counter++) {
			System.out.println("Enter the name of student "+ (counter+1));
			name[counter] = input.next();
		}
		
		*/

		int [] rate;
		rate = new int [5];
		
		int counter = 0 ;
		for(; counter>= 0; ) {
			System.out.println("Enter the rate of each "
					+ "student "+ (counter++) + " in rate of 1 to 5");
			//rate[counter] = input.nextInt();
			int studentInput = input.nextInt();
			switch (studentInput) {
			case 1: 
				rate[0]++;
				break;
			case 2: 
				rate[1]++;
				break;
			case 3: 
				rate[2]++;
				break;
			case 4: 
				rate[3]++;
				break;
			case 5: 
				rate[4]++;
				break;
			default: 
				break;
			}
			System.out.println("Enter a neg value if stoped: ");
			counter = input.nextInt();
		}
		
		
			System.out.println("Rate 1: " + rate[0]);
			System.out.println("Rate 2: " + rate[1]);
			System.out.println("Rate 3: "  + rate[2]);
			System.out.println("Rate 4: " + rate[3]);
			System.out.println("Rate 5: " +rate[4]);
		
		

	}

}
