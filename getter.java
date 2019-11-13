package getter;

class Person {
	String name;
	int age;
	
	void speak() {
		System.out.println("Hello this is my name : " + name);
	}
	
	int calculateYears() {
		
		int YearsLeft =2019 - age; 
		return YearsLeft;
	}
	int getAge () {
		return age;
	}
	
	String getName () {
		return name;
	}
}


public class getter {

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		
		person1.name = "Alibaba";
		person1.age = 50;
		
		person2.name = "Baba Ali";
		person2.age = 42;
		
		int years = person1.calculateYears();
		int years1 = person2.calculateYears();
		/*
		System.out.println("Hello my name is " 
		+ person1.name+ " and my date of birth is " +  years 
		+ " and also I have a friend who is by name " + person2.name 
		+ " and is has his date of birth to be " + years1);
		person1.speak();
		person2.speak();
*/
			
		System.out.println("Person 1 name: " + person1.getName()); 
		System.out.println("Person 1 age: " + person1.getAge());
		
		
	}

	/*
	private static int calculateYears(int age) {
		int YearsLeft =2019 - age; 
		return YearsLeft;
	}
*/
}
