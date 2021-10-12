package greedy;

import java.util.Arrays;

public class MaximizeSumAfterKNegations {
	
	public static long maximizeSum(long a[], int n, int k)
    {
        // Your code goes here
        Arrays.sort(a);
        int i = 0;
        while(k > 0){
            if(i < n && a[i] < 0){
                a[i++] *= -1;
            }
            else{
                Arrays.sort(a);
                while(k > 0){
                    a[0] *= -1;
                    k--;
                }
            }
                
            k--;
        }
        long sum = 0;
        for(int j = 0 ; j < n ; j++){
            sum += a[j];
        }
        
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
