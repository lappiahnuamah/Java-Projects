package getter;

class PointCoordinates {
int x;
int y;

PointCoordinates(int x, int y) {
	this.x = x;
	this.y = y;
}

int getX() {
	return x;
}
int getY() {
	return y;
}

public static void main(String [] args) {
	
	PointCoordinates point = new PointCoordinates(10,10);
	System.out.println("Object toString: " + point);
	
	String s = point + " Testing";
	System.out.println(s);
	
}
}
