package grading_system;

import java.util.Scanner;

public class SenitelCisco {

	private static int Str;

	public static void main(String[] args) {
		int total;		
		Scanner input = new Scanner(System.in);
		
		System.out.println("=========================================================");
		System.out.println("CISCO CERTIFICATION EXAMINATIONS (CCNA) RESULTS");
		System.out.println("=========================================================");
//		System.out.println("Please enter the number of students who took the exams: ");
//		total = input.nextInt();
		String[] names;
		names = new String[5];
		int counter =0;
		
		while(counter != -1) {
			System.out.printf("Enter name of student " + (counter+1) + " or -1 to exit");
			names[counter] = input.next();
			counter++;
	}
			
		}
		
		/*
		
		for(; counter >= 0; ) {
			names[counter] = input.next();
			
			names[counter] = input.next();
			System.out.println("Enter name of student " + (counter+1) + " or -1 to exit");
			counter++;
		}
		*/
		
		int [] score;
		score = new int[10];
		
		for(; counter >= 0; ) {
			System.out.println("Enter score of student " + (counter+1)+ " in either 1 or 2");
			score[counter] = input.nextInt();
		}
		
		input.close();
		
		System.out.print("NAMES \t\t\t\t\t  ");
		System.out.println("MARKS");
		
		for(; counter >= 0;) {
			System.out.println(names[counter] + "\t\t\t\t\t" + score[counter]);
		}
		
	}

}
