package array;

import java.util.HashMap;

public class SubarrayWith0Sum {
	
	public static boolean sum(int arr[] , int n) {
		
		int as = 0;
		for(int i = 0 ; i < n ; i++) {
			if(arr[i]==0) {
				return true;
			}
			arr[i] += as;
			as = arr[i];
		}
		
		for(int i = 0 ; i < n ; i++) {
			if(arr[i]==0) {
				return true;
			}
		}
		
		HashMap<Integer , Integer> hp = new HashMap<Integer , Integer >();
		
		for(int i = 0 ; i < n ; i++) {
			if(hp.containsKey(arr[i])) {
				return true;
			}
			hp.put(arr[i], 1);
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 4 , 2 , -3 , 2 , 5};
		System.out.println(sum(arr , 5));

	}

}
