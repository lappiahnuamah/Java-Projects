package grading_system;

import java.util.Scanner;

public class CiscoCertifications {

	public static void main(String[] args) {
		
		
		int total;		
		Scanner input = new Scanner(System.in);
		
		System.out.println("=========================================================");
		System.out.println("CISCO CERTIFICATION EXAMINATIONS (CCNA) RESULTS");
		System.out.println("=========================================================");
		System.out.println("Please enter the number of students who took the exams: ");
		total = input.nextInt();
		String[] names;
		names = new String[total];
		
		for(int counter =0; counter < total; counter++) {
			System.out.println("Enter name of student " + (counter+1));
			names[counter] = input.next();
		}
		
		int [] score;
		score = new int[total];
		
		for(int counter = 0; counter < total; counter++) {
			System.out.println("Enter score of student " + (counter+1)+ " in either 1 or 2");
			score[counter] = input.nextInt();
		}
		
		input.close();
		
		System.out.print("NAMES \t\t\t\t\t  ");
		System.out.println("MARKS");
		
		for(int counter = 0; counter < total; counter++) {
			System.out.println(names[counter] + "\t\t\t\t\t" + score[counter]);
		}
		
	}

}
