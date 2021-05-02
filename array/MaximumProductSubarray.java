package array;

public class MaximumProductSubarray {
	
	public static long maxProduct(int nums[] , int n) {
		long max_overall = nums[0];
        long max_ending_here = nums[0], min_ending_here = nums[0];
        
        for(int i = 1; i < n ; ++i){
            long tmp = max_ending_here;
            max_ending_here = Math.max(nums[i], Math.max(nums[i]*max_ending_here, nums[i]*min_ending_here));
            min_ending_here = Math.min(nums[i], Math.min(nums[i]*tmp, nums[i]*min_ending_here));
            max_overall = Math.max(max_overall, max_ending_here);
        }
        return max_overall;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {-1 , -2 , -3 , -4 , -5};
		
		System.out.println(maxProduct(arr , 5));

	}

}