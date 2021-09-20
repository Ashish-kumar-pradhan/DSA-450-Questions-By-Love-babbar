package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class JobSequencingProblem {
	
	void reverse(int[][] array , int n){
        for (int i = 0; i < n/2; i++) {
            int temp[] = array[i];
            array[i] = array[n-1-i];
            array[n-1-i] = temp;
        }
    }
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        
        int[][] array = new int[n][2];
        for (int i = 0; i < n; i++) {
            array[i][0] = arr[i].deadline;
            array[i][1] = arr[i].profit;
        }
        Arrays.sort(array, Comparator.comparingInt(b -> b[1]));
        reverse(array , n);
        
        
        int mI = 0;
        for(int i = 0 ; i < n ; i++){
            if(mI < array[i][0]){
                mI = array[i][0];
            }
        }
        int dp[] = new int[mI+1];
        for(int i = 0 ; i < n ; i++){
            int v = array[i][0];
            for(int j = v ; j > 0 ; j--){
                if(dp[j] == 0){
                    dp[j] = array[i][1];
                    break;
                }
            }
        }
        
        int c = 0;
        int sum = 0;
        for(int i = 1 ; i <= mI ; i++){
            if(dp[i] != 0){
                c += 1;
                sum += dp[i];
            }
        }
        
        
        int ans[] = {c , sum};
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
