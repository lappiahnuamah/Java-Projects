package grading_system;
import java.util.Scanner;
import java.util.*;


public class GuessGame {
	
	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		
//		System.out.println("User Please enter your name: ");
//		String name = input.nextLine();
//		System.out.println("Enter your age: ");
//		int age = input.nextInt();
//		System.out.println("Your full name is " + name + " and your age is " + age + " respectively!");
		
		Random rand = new Random();
		int counter = 1;
		int guessNumber = rand.nextInt(30);
		int guessTimes = 5;
		System.out.println("==================================");
		System.out.println("\tSTAGE 1: BEGINNER'S STAGE");
		System.out.println("==================================");
		while(counter <=guessTimes) {
			Thread.sleep(1000);
			System.out.println("Enter guess number between 1 and 30 => ");
			int guess = input.nextInt();
			if (guess < guessNumber &&  counter !=guessTimes) {
				System.out.println("Very low!!, try again");
			}else if (guess > guessNumber &&  counter!=guessTimes) {
				System.out.println("Very high!!, try again");
			}else if ((guess == guessNumber &&  counter != guessTimes)||(guess == guessNumber &&  counter == guessTimes))   {
				System.out.println("Congratulations!! You had the number...");
				Thread.sleep(2000);
				System.out.println("Move on to the next round");
				Thread.sleep(4000);
				moveon();
				break;
			}else if (guess != guessNumber && counter == guessTimes){
				System.out.println("You have only five chances by the way, you lose");
				Thread.sleep(1000);
				System.out.println("==========================");
				System.out.println("\tEND OF THE GAME!!");
				System.out.println("==========================");
				break;
			}
			counter++;
		}

		}

private static void moveon() throws InterruptedException{
	Scanner input2 = new Scanner(System.in);
		System.out.println("==================================");
		System.out.println("\tSTAGE 2: CHAMPION STAGE");
		System.out.println("==================================");
			
		Random rand = new Random();
		int lower = 30;
		int upper = 60;
		int r = (int) (Math.random() * (upper - lower)) + lower;
		int counter = 1;
		int guessNumber = r;
		int guessTimes = 5;
		while(counter <=guessTimes) {
			System.out.println("Enter guess number between 30 and 60");
			int guess2 = input2.nextInt();
			if (guess2 < guessNumber &&  counter !=guessTimes) {
				System.out.println("Very low!!, try again");
			}else if (guess2 > guessNumber &&  counter!=guessTimes) {
				System.out.println("Very high!!, try again");
			}else if ((guess2 == guessNumber &&  counter != guessTimes)||(guess2 == guessNumber &&  counter == guessTimes))   {
				System.out.println("Congratulations!! You had the number...");
				System.out.println("You're the Overall boss");
				System.out.println("==============================");
				System.out.println("\tEND OF THE GAME!!");
				System.out.println("==============================");
				break;
			}else if (guess2 != guessNumber && counter == guessTimes){
				System.out.println("You have only five chances by the way, you lose");
				Thread.sleep(1000);
				System.out.println("==============================");
				System.out.println("\tEND OF THE GAME!!");
				System.out.println("==============================");
				break;
			}
			counter++;
		}

		}

	}
	
