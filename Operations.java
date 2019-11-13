package football;


public class Operations {
		static int a =5;
		static int square(int a) {
			a = a *a;
			return a;
		}
		
		static void print() {
			System.out.println(square(a));
			System.out.println(a);
		}
		
		public static void main(String []args) {
			print();
		}
}
