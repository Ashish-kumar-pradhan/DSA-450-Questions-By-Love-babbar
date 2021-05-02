package array;

public class KadanesAlgorithm {
	
	public static int greatestSumSubArray(int arr[]) {
		
		int currentBest = 0;
		int overAllBest = 0;
		
		for(int i = 0 ; i < arr.length ; i ++ ) {
			if (currentBest + arr[i] >= arr[i]) {
				currentBest += arr[i];
			}
			if(currentBest + arr[i] < arr[i]) {
				currentBest = arr[i];
			}
			if (currentBest > overAllBest) {
				overAllBest = currentBest;
			}
		}
		return overAllBest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {4 , 3, -2, 6, -14, 7, -1, 4 , 5, 7, -10, 2 , 9 , -5, -9, 6 , 1};
		System.out.println(greatestSumSubArray(arr));
	}
}
