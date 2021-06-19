package heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedArrays {

	public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < K ; i++){
            for(int j = 0 ; j < K ; j++){
                pq.add(arr[i][j]);
            }
        }
        
        for(int i = 0 ; i < K*K ; i++){
            ans.add(pq.remove());
        }
        return ans;
        
        
    }
}
