package football;

class Car {
	String Lin_Plate;
	double avg_mpg;
	String paint_color;
}

public class CarClass {
	String Lin_Plate;
	double avg_mpg;
	String paint_color;
	
	void avg_mpig(double avg_mpg){
		this.avg_mpg = avg_mpg;
	}
	
	void Paint(String paint_color){
		this.paint_color= paint_color;
	}
	void Lin_Plate(String Lin_plate){
		this.Lin_Plate = Lin_plate;
	}
	

	public static void main(String []args) {
		Car car1 = new Car();
		Car car2 = new Car();
		car1.Lin_Plate = "1BC32E";
		car1.avg_mpg = 25.5;
		car1.paint_color = "blue";
		
		car2.avg_mpg = 13.9;
		car2.Lin_Plate = "3D20BN";
		car2.paint_color = "black";
		
		System.out.println(car1.avg_mpg);
		System.out.println(car1.Lin_Plate);
		System.out.println(car1.paint_color);
	}
}
