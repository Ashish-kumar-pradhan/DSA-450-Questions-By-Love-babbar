package greedy;

import java.util.Arrays;

public class SwapAndMaximize {
	
	long maxSum(long arr[] ,int n)
    {
        Arrays.sort(arr);
        int i = 0;
        int j = n-1;
        long sum = 0;
        while(i <= j){
            if(i == j){
                sum += (arr[j] - arr[0]);
            }
            else if((i+1) == j){
                sum += (arr[j] - arr[i]);
                sum += (arr[j] - arr[0]);
            }
            else {
                sum += (arr[j] - arr[i]);
                sum += (arr[j] - arr[i+1]);
            }
            i++;
            j--;
        }
        
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
