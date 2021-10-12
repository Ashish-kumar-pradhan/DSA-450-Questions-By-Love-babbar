package greedy;

import java.util.Arrays;

public class MaximizeSumArrIOfAnArray {
	
	int Maximize(int arr[], int n)
    {
        // Complete the function
        long sum = 0;
        long m = 1000000007;
        Arrays.sort(arr);
        for(int i = 0 ; i < n ; i++){
            sum = (sum + (long)arr[i]*i)%m;
        }
        return (int)sum;
        
    }   

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
