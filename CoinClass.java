package football;
import java.util.*;
import java.awt.*;

public class CoinClass {
	public final static int HEADS = 0;
	public final static int TAILS = 1;
	
	
	private int FaceUp;
	
	public CoinClass() {
		flip();
	}
	
	
	public String getfaceUp(){
		if(FaceUp == HEADS) {
			return "HEADS";
		}else if(FaceUp == TAILS) {
			return "TAILS";
		}else {
			return "INVALID";
		}
	}
	
	public void flip() {
		Random r = new Random();
		FaceUp  = r.nextInt(2);
	}
}
