package getter;

public class ClassTemp {
	public static void main(String []args) {
		
		double fah = Temper.convert(Temper.BOILING_POINT);
		System.out.println("The temperature in fahrenheit is: " +fah);
	}
}
