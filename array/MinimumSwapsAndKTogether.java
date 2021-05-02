package array;

public class MinimumSwapsAndKTogether {
	
	public static int minSwap(int arr[], int n, int k) {
		
		int j = 0;
		int v = 0;
		int min = 0;
		for(int i = 0 ; i < n ; i++) {
			if(arr[i] <= k) {
				j++;
			}
		}
		
		for(int i = 0 ; i < j ; i++) {
			if(arr[i] > k) {
				v++;
			}
		}
		
		min = v;
		
		for(int i = 0 ; i + j < n ; i++) {
			if(arr[i] > k) {
				v--;
			}
			
			if(arr[i+j] > k) {
				v++;
			}
			
			if(min > v) {
				min = v;
			}
		}
			
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 12, 20, 20, 5, 19, 19, 12, 1, 20, 1};
		int arr2[] = {4 , 3};
		System.out.println(minSwap(arr , 11 , 1));

	}

}
