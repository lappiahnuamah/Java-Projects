package grading_system;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=4; i++) 
		{
			for (int j=i; j<4; j++) 
				System.out.print(" ");
			for (int k=1; k<(i*2); k++) 
				System.out.print("*");
			System.out.print("\n");
				
		}	
		System.out.println("   * ");
	}
	
}
