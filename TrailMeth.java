package getter;

public class TrailMeth {
	public static void main(String []args) {
		int[] numb1 = {1, 2 ,3 , 1 };
		System.out.println(scaleProduct(numb1, 3));
	}

	
public static int scaleProduct(int[]numb1, int a) {
	int p = 1, sum;
	for(int i=0; i<numb1.length; i++){
		p*=numb1[i];
	}
	sum = p + a;
	return sum;
}
}
