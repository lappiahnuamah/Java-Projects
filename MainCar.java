package football;

import java.awt.Color;
import java.util.Scanner;

public class MainCar {

	public static void main(String[] args) {
		
		Car myCar = new Car("12GED02", 25.5, Color.BLUE,true);
		Car myCar2 = new Car("12OED03", 34.5, Color.RED,true);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(myCar);
		
		Chal1 mydog = new Chal1(Color.BLACK, "Puppy Wheels", "Puppy", 6);
		System.out.println(mydog.bark(" Dog barks!!"));
		System.out.println(mydog.move(" Dog moves!!"));
		System.out.println(mydog.Age);
		
		System.out.println("Enter age: ");
		int age = input.nextInt();
		
		Switch(age);{
			if(age>=0 && age<=5) {
				System.out.println("Baby");
			}else if(age>5 && age<=10) {
				System.out.println("Child");
			}else if(age>10 && age<=19) {
				System.out.println("Teen");
			}else if(age>19) {
				System.out.println("Adult");
			}else {
				System.out.println("Invalid");
			}
		}
		
		
		// This is the CoinClass Section
		

	}

	private static void Switch(int age) {
		// TODO Auto-generated method stub
		
	}

}
