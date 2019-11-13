package football;

public class MainCoin {

	public static void main(String[] args) {
		CoinClass c = new CoinClass();
		System.out.println("Initial:" + c.getfaceUp());
		
		for(int i=0; i<10; i++) {
			c.flip();
			System.out.println("After Flip: "+ c.getfaceUp());
		}

	}

}
