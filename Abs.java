package football;

public class Abs {
	

	public static int absoluteValue(int a) {
		if(a>=0) {
			return a;
		}else {
			return -a;
		}
	}
	
	
	public static int absoluteSum(int [] nums) {
		int sum =0;
		for(int i=0; i<nums.length; i++) {
			/*
			if(nums[i]>=0) {
				sum = sum +nums[i] ;
			}else {
				sum = sum +(nums[i]*-1);
			}
			*/
			sum += Abs.absoluteValue(nums[i]);
		}
		return sum;
	}
	
	public static void main(String [] args) {
		
		System.out.println(absoluteValue(-98));
		
		int nums []= {1, -1, 2, -2};
		System.out.println("The sum is :"+ absoluteSum(nums));
	}
	
}


