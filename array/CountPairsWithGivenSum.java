package array;

import java.util.HashMap;
import java.util.Map;

public class CountPairsWithGivenSum {
	
	public static int countPair1(int[] arr, int n, int k){
		int count = 0;
		for(int i = 0 ; i < n ; i++) {
			for(int j = i ; j < n ; j++) {
				if(arr[i] + arr[j] == k) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static int countPair2(int[] arr, int n, int k){
		int count = 0;
		HashMap<Integer,Integer> hp = new HashMap<Integer,Integer>();
		
		for(int i = 0; i < n ; i++) {
			if(hp.containsKey(arr[i])) {
				int c = hp.get(arr[i]);
				hp.put(arr[i],c+1);
			}
			else {
				hp.put(arr[i] , 1);
			}
		}
		
		for(int i = 0; i < n ; i++) {
			if(hp.containsKey(k - arr[i])) {
				if(hp.get(arr[i])==hp.get(k - arr[i])) {
					count = count + hp.get(k - arr[i]) - 1;
				}
				else{
					count = count + hp.get(k - arr[i]);
				}
			}
		}
		
		return count/2;
		
	}
	
	public static int countPair3(int[] arr, int n, int k){
	        
		  HashMap<Integer, Integer> fre = new HashMap<Integer, Integer>();
		  
		  for(int i=0;i<n;i++){
	            Integer j = fre.get(arr[i]); 
	            fre.put(arr[i], (j == null) ? 1 : j + 1);
		  }
		    
		  int answer = 0;
	        for (int i = 0; i < n; i++)
	        {
	            if (arr[i] == k - arr[i])
	            {
	                answer += (fre.get(arr[i]) - 1);
	            }
	            else
	            {
	                Integer j = fre.get(k - arr[i]); 
	                if(j!=null)
	                    answer += j;
	            }
	        }
	        answer /= 2;
	        
	        return answer;
		  
	       
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {48, 24 ,99, 51, 33, 39, 29, 83, 74, 72, 22, 46, 40, 51, 67, 37, 78, 76, 26, 28, 76, 25, 10, 65, 64, 47, 34, 88, 26, 49, 86, 73, 73, 36 ,75, 5 ,26, 4, 39, 99, 27, 12, 97, 67 ,63 ,15, 3 ,92 ,90};
		System.out.println(countPair3(arr , 49 , 50));

	}

}
