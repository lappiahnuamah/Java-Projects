package football;

public class JavaExcept {

	public static void main(String[] args) {
		// Single Try and Catch Exception
		/*
		try {
			int data = 100/0;
			
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println("The rest of the code...");
		*/
		
		try {
			int a []= new int [5];
			a[5]=6/0;
		}
		catch(ArithmeticException e){System.out.println("Task 1 completed");}
		catch(IndexOutOfBoundsException e){System.out.println("Task 2 completed");}
		catch(Exception e){System.out.println("Normal Exception");}
		
		System.out.println("And the process continues");
	}
}
