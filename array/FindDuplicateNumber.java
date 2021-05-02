package array;

import java.util.Arrays;
import java.util.HashMap;

public class FindDuplicateNumber {
	
	
   public static int findDuplicate1(int[] nums) {  // O(N2) O(1)
        int same = 0;
		for(int i = 0 ; i < nums.length-1 ; i++) {
			for(int j = i + 1 ; j < nums.length ; j++) {
				if(nums[i] == nums[j]) {
					same = nums[i];
					break;
				}
			}	
		}
		return same;
   }
   
    public static int findDuplicate2(int[] nums) { //O(NlogN) O(1)
    	Arrays.sort(nums);
    	int same = 0;
    	for (int i = 0 ; i < nums.length-1 ; i++) {
    		if(nums[i] == nums[i+1]) {
    			same = nums[i];
    		}
    	}
    	return same;
    }
    
    public static int findDuplicate3(int[] nums) { //O(N) O(1)
    	
    	int n = nums.length;
    	int max = Integer.MIN_VALUE;
    	int same = 0;
    	for(int i = 0 ; i < n ; i++) {
    		nums[nums[i]%n] = nums[nums[i]%n] + n;
    	}
    	
    	for(int i = 0 ; i < n ; i++) {
    		if(max < nums[i]) {
    			max = nums[i];
    			same = i;
    		}
    	}
    	return same;
    	
    }
    
    public static int findDuplicate4(int[] nums) { //O(N) O(1) Best method -- Floyd's Tortoise and Hare (Cycle Detection)
    	int s = nums[0];
    	int f = nums[0];
    	do {
    		s = nums[s];
    		f = nums[nums[f]];
    	} while(s != f);
    	
    	f = nums[0];
    	while(s != f) {
    		s = nums[s];
    		f = nums[f];
    	}
    	
    	return s;
    }
    
    public static int findDuplicate5(int[] nums) {
    	int same = 0 ;
    	int arr[] = new int[nums.length];
    	for(int i = 0 ; i < nums.length ; i++) {
    		if(arr[nums[i]] == 1) {
    			same = nums[i];
    		}
    		arr[nums[i]] = 1;
    	}
    	return same;
    }
    
    
    public static int findDuplicate6(int[] nums) {
    	 HashMap<Integer , Integer> hp = new HashMap<Integer , Integer>();
         for (int i = 0 ; i < nums.length ; i++) {
             if (hp.containsKey(nums[i])) {
                 return nums[i];
             }
             hp.put(nums[i], nums[i]);
         }

         return -1;
    }
    
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2 , 3 , 1 , 6 , 5 , 1 , 4};
//		System.out.println(findDuplicate2(arr));
//		System.out.println(findDuplicate3(arr));
		System.out.println(findDuplicate6(arr));

	}

}
