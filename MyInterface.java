package getter;

interface MyInterface {
	public void method();
	public void method2();

}

class XYZ implements MyInterface {
	
	public  void method() {
		System.out.println("Implementation of the first method");
	}
	
	public  void method2() {
		System.out.println("Implementation of the second method");
	}
	
	public static void main (String [] args) {
		MyInterface obj = new XYZ();
		obj.method();	
		obj.method2();
	}
}