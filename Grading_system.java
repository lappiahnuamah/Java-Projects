package grading_system;

import java.util.Scanner;


public class Grading_system {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter your score in exam: ");
    	int exam = input.nextInt();
    	System.out.print("Enter your score in assessment: ");
    	int assess = input.nextInt();
    	System.out.println("Have you paid your fees in full(Y/N): ");
    	char c = input.next(".").charAt(0);
    	boolean certificate;
    
    	if(exam >= 25 && assess >= 15) {
    		System.out.println("You passed the exams!");
    	}
    	if(exam >= 24 && assess <= 14) {
    		System.out.println("You passed the exams but you have failed the assessment!");
    	}else {
    		System.out.println("You passed the assessment but you have failed the exam!");
    	}
    	if(exam == 25 && assess == 14 || exam == 24 && assess == 15) {
    		System.out.println("Please student, you are condoned");
    	}else {
    		System.out.println("Please student, you are not condoned");
    	}
    	
    	if((exam >= 25 && assess >= 15) || (exam == 25 && assess == 14 || exam == 24 && assess == 15) && c == 'Y') {
    		certificate = true;
    		System.out.println("Go for your certificate ");
    	}else {
    		certificate = false;
    		System.out.println("You cannot have a certificate");
    	}
    	
    	int sum = exam + assess;
    	if (sum >= 70) {
    		System.out.println("Grade A");
    	}else if (sum>= 60 && sum <70) {
    		System.out.println("Grade B");
    	}else if (sum>= 50 && sum <60) {
    		System.out.println("Grade C");
    	}else if (sum>= 40 && sum <50) {
    		System.out.println("Grade D");
    	}else {
    		System.out.println("Grade F");
    	}
	}

}
