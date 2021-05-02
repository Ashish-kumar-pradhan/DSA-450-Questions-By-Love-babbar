package array;

public class TrappingRainWater {
	
	public static int trapWater(int arr[], int n) {
		
		int sum = 0;
		
		int maxRA[] = new int[n];
		int maxLA[] = new int[n];
		
		int maxl = Integer.MIN_VALUE;
		int maxr = Integer.MIN_VALUE;
		
		for (int i = 0 ; i < n ; i++) {
			if(maxr < arr[n-1-i]) {
				maxr = arr[n-1-i];
			}
			maxRA[n-1-i] = maxr;
			
			if(maxl < arr[i]) {
				maxl = arr[i];
			}
			maxLA[i] = maxl;
		}
		
		
		for (int i = 0 ; i < n ; i++) {
			sum += Math.min(maxLA[i] , maxRA[i]) - arr[i];
		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		

	}

}
