package getter;




public  class WorkwArrays {
	public static void main(String []args) {
		
		int []nums = new int [7];
		nums[0] = 2;
		nums[1] = 9;
		nums[2] = 4;
		nums[3] = 5;
		nums[4] = 2;
		nums[5] = 9;
		nums[6] = 7;
		System.out.println(product(nums));
	}
	

public static int product (int [] nums) {
	int p =1;
	for (int i=0; i<nums.length; i++) {
		p*=nums[i];
	}
//	 System.out.println(p);
	 return p;
	 
	}
}