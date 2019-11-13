package getter;


class Person {
	String name;
	int age;
	
	void speak() {
		System.out.println("My name is " + name);
	}
	
	int CalYearsLeft() {
		Integer YearsLeft = 60 - age;
		return YearsLeft;
	}
	
	String getName(){
		return name;
	}
	
	int getAge() {
	
		return age;
	}
	
}

public class ArrayTrails {
	public static void main(String[] args) {
		
		Person person1 = new Person();
		
		person1.name="John";
		person1.age =20;
		
		System.out.println("My name is " + person1.name);
		
		int years = person1.CalYearsLeft();
		System.out.println("Years Left for retirement is " + years);
		
		/*
		String [][] things = {
				{"Rich", "Door", "Sea", "gate"},
				{"Dog", "Cat", "Mouse"},
				{"Kitten", "mice", "dog2"}
		};
		for(int i=0; i<things.length;i++) {
			System.out.println(things[i][0]);
			for(int j=1; j<things[i].length;j++) {
				System.out.println(things[i][j]);
			}
		}
		*/
		String name = person1.getName();
		int age = person1.getAge();
		
	}

//	private static String getName() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}

