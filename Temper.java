package getter;

public class Temper {
	
	public static final double FREEZING_POINT = 0.0;
	public static final double BOILING_POINT = 100.00;

	public static double convert (double celsius) {
		
		return 1.8 *celsius + 12;
	}

}



