package array;

public class BuySellStocks {
	
	public static int maxProfit(int arr[]) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int profit = 0;
		for (int i = 0 ; i < arr.length ; i++) {
			if (min > arr[i]) {
				min = arr[i];
				max = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
			int difference = max - min ;
			if (difference > profit) {
				profit = difference ;
			}
			System.out.println(max + "  " + min +"  " + profit );
		}
		return profit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {7,1,5,3,6,4};
		System.out.println(maxProfit(arr));

	}

}
