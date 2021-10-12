package greedy;

import java.util.Arrays;

public class MinimumPlatforms {
	
	static int findPlatform(int arr[], int dep[], int n)
    {
        
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0;
        int j = 0;
        int cm = 0;
        int om = 0;
        while(i < n){
            if(arr[i] <= dep[j]){
                cm++;
                i++;
            }
            else {
                cm--;
                j++;
            }
            
            if(om < cm) om = cm;
        }
        
        return om;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
