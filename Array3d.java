package getter;

public class Array3d {

	public static void main(String[] args) {
		int a[] = new int[4];
		int b[][] = new int[4][4];
		int c[][][]= new int [4][4][4];
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				for(int k=0; k<4; k++) {
					 c[i][j][k] = i+j+k;
					 System.out.println("They are: "+ c[i][j][k]);
				}
			}
		}

	}

}
