package grading_system;
import java.util.Scanner;

public class NewGradingSystem {

	public static void main(String[] args) {
		double assessmentScore, examScore;
		int fees;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Assessment Score: ");
		assessmentScore = scanner.nextDouble();
		System.out.println("Enter Exam Score: ");
		examScore = scanner.nextDouble();
		System.out.println("Enter Fees paid: ");
		fees = scanner.nextInt();
		
		if (examScore > 24 && assessmentScore > 14) {
			System.out.println("You passed this Course!!");
			
			if (fees >= 100) {
				System.out.println("You got a certificate for this course.");
			}else {
				System.out.println("No cert for you, because you owe an amount of GHC " + (100-fees));
			}
		}else if (examScore<24 && assessmentScore>=14) {
			System.out.println("You failed in the exams");
		}else if (examScore>24 && assessmentScore<14) {
			System.out.println("You failed in the assessment");
		}else {
			System.out.println("You failed both exams and therefore, you are repeated");
		}
		
	}

}
