package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElements {
	
	int[] kLargest(int[] arr, int n, int k) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i < n ; i++){
            pq.add(arr[i]);
        }
        int max[] = new int[k] ;
        for(int i = 0 ; i < k ; i++){
            max[i] = pq.remove();
        }
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
