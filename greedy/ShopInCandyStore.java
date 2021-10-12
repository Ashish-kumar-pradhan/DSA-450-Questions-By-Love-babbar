package greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class ShopInCandyStore {
	
	static ArrayList<Integer> candyStore(int candies[],int N,int K){
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>(); 
        Arrays.sort(candies);
        int l = (N-1)/(K+1) + 1;
        int min = 0;
        int max = 0;
        for(int i = 0 ; i < l ; i++){
            min += candies[i];
            max += candies[N-1-i];
        }
        ans.add(min);
        ans.add(max);
        
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
