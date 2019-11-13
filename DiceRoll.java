package football;

import java.util.*;
import java.lang.reflect.*;
import java.awt.*;

public class DiceRoll {
	public static void main(String [ ]args) {
		Scanner input = new Scanner(System.in);
		
		//Random roll = new Random();
		
		System.out.println("Press 1 to roll the die or -1 to exit ");
		int Start = input.nextInt();
	}
	
	public int  DiceRoll(int Start) {
		int lower = 1;
		int upper = 7;
		
		if(Start == 1) {
			int r = (int) (Math.random() * (upper - lower)) + lower;
			return r;
		}else {
			return 0;
		}
	}

	

	
	
}
