package searchingAndSorting;

public class ProductArrayPuzzle {
	
	public static long[] productExceptSelfD(int nums[], int n) {
		long allPro = 1;
		long Parr[] = new long[n];
		for(int i = 0 ; i < n ; i++) {
			allPro *= nums[i];
		}
		
		for(int i = 0 ; i < n ; i++) {
			Parr[i] = allPro/nums[i];
		}
		
		return Parr;
	}
	
	public static long[] productExceptSelfWD(int nums[], int n) {
		
		long Parr[] = new long[n];
		long l[] = new long[n];
		long r[] = new long[n];
		
		l[0] = 1;
		r[n-1] = 1;
		for(int i = 1 ; i < n ; i++) {
			l[i] = l[i-1] *nums[i - 1];
			r[n-1-i] = r[n-i] * nums[n-i];
		}

		for(int i = 0 ; i < n ; i++) {
			Parr[i] = l[i]*r[i];
		}
		return Parr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {10, 3, 5, 6, 2};
		System.out.println(productExceptSelfWD(nums , 5));

	}

}
