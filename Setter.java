package getter;

 class Trail {
	private int legs;
	private boolean hair;
	private int tail;
	
	public int getLegs() {
		return legs;
	}
	
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public boolean getHair() {
		return hair;
	}
	
	public void setHair(boolean hair) {
		this.hair = hair;
	}
	public int getTail() {
		return tail;
	}
	
	public void setTail(int tail) {
		this.tail = tail;
	}
}

public class Setter {
	public static void main(String[]args) {
		
		Trail trail1 = new Trail();
		
		trail1.getLegs();
	
	}
}