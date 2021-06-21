package heap;

import java.util.PriorityQueue;

public class MinimumCostOfRopes {
	
	 long minCost(long arr[], int n) 
	    {
	        // your code here
	        PriorityQueue<Long> pq = new PriorityQueue<>();
	        for(long i : arr){
	            pq.add(i);
	        }
	        long ans = 0;
	        while(pq.size() > 1){
	            long first = pq.remove();
	            long second = pq.remove();
	            long sum = first + second;
	            ans += sum;
	            pq.add(sum);
	        }
	        
	        return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
