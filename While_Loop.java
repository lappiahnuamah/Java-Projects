package grading_system;
import java.util.Scanner;

public class While_Loop {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		System.out.println("User Please enter your name: ");
//		String name = input.nextLine();
//		System.out.println("Enter your age: ");
//		int age = input.nextInt();
//		System.out.println("Your full name is " + name + " and your age is " + age + " respectively!");
		
		int counter = 1;
		int guessNumber = 19;
		int guessTimes = 3;
		while(counter <=guessTimes) {
			System.out.println("Enter guess number => ");
			int guess = input.nextInt();
			if (guess < guessNumber &&  counter !=guessTimes) {
				System.out.println("Very low!!, try again");
			}else if (guess > guessNumber &&  counter!=guessTimes) {
				System.out.println("Very high!!, try again");
			}else if ((guess == guessNumber &&  counter != guessTimes)||(guess == guessNumber &&  counter == guessTimes))   {
				System.out.println("Congratulations!! You had the number...");
				break;
			}else if (guess != guessNumber && counter == guessTimes){
				System.out.println("You have only three chances by the way, you lose");
				break;
			}
			counter++;
		}

		}
		
	}
