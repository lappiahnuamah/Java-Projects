package getter;

class MytoStringdemo {
	int roll;
	String name;
	String city;
	
	MytoStringdemo(int roll, String name,String city){
		this.roll = roll;
		this.name = name;
		this.city = city;
	}
	
	public String toString() {
		return roll + " " + name + " " + city;
	}
	
	public static void main(String[] args) {
		
		/*
		StringBuilder sb = new StringBuilder("Hello");
//		sb.append(" java");
    	sb.insert(1,"java");
		System.out.println(sb.toString());
		
	*/
		MytoStringdemo s1 = new MytoStringdemo(111, " Pie", "Korea");
		MytoStringdemo s2 = new MytoStringdemo(122, " Cake", "Japan");
		System.out.println(s1);
		System.out.println(s2);
		
		
	}	
}
