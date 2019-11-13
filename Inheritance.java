package getter;

//main class 
class Vehicle {
	String color;
	int speed;
	int size;
	void attritubes() {
		System.out.println("Color of Car is :" + color);
		System.out.println("Speed of Car is:" + speed);
		System.out.println("Size of Car is :" + size);
	}
}

//Subclass
class Car extends Vehicle {
	int Cc;
	int gears;
	void attritubesCar() {
		System.out.println("Color of Car is :" + color);
		System.out.println("Speed of Car is:" + speed);
		System.out.println("Size of Car is :" + size);
		System.out.println("Cc of Car is :" + Cc);
		System.out.println("No. of gears of Car is:" + gears);
	}
	 
}

public class Inheritance {
	public static void main(String [] args) {
		Car c1 = new Car();
		c1.color = "blue";
		c1.speed = 700;
		c1.size = 45;
		c1.Cc = 456;
		c1.gears = 4;
		c1.attritubesCar();
		
	}
}
