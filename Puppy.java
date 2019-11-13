package getter;

public class Puppy {

	public Puppy (String name, Integer age) {
		System.out.println("Passed name is "+ name + " and age is "+ age);
	}
	
public static void main(String[] args) {
	
	new Puppy ("James", 98);
}

}