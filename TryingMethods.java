package grading_system;
import java.util.Scanner;

class Person {
	static String name;
	static int age;
	static String profession;

//	void speak() {
//		System.out.println("My name is " + name + " and I am " + age + " years old" + ". I am " + profession
//				+ " by  profession. Thank you!!");
//	}

}

public class TryingMethods {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your full name: ");
		Person.name = input.nextLine();
		System.out.println("Please enter your age: ");
		Person.age = input.nextInt();
		System.out.println("Please enter your profession: ");
		Person.profession = input.next();
		
		speak();
		
		/*
		Person person1 = new Person();
		person1.name = "Albert Kusi";
		person1.age = 24;
		person1.profession = "A Doctor";
		person1.speak();
		person1.speak();

		// Subroutines (method)

		Person person2 = new Person();
		person2.name = "Emmanuel Kudjoe";
		person2.age = 24;
		person2.profession = ("A nurse");
		person2.speak();

		System.out.println(person2.profession);
*/
		
	}

	private static void speak() {
		// TODO Auto-generated method stub
		System.out.println("My name is " + Person.name + " and I am " + Person.age + " years old" + ". I am " + Person.profession
				+ " by  profession. Thank you!!");
	}
}