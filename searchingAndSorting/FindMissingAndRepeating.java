package searchingAndSorting;

public class FindMissingAndRepeating {
	
	public static int[] findTwoElement(int arr[], int n) {
		int[] a = new int[2];
		int max = Integer.MIN_VALUE;
		int maxI = 0;
		int min = Integer.MAX_VALUE;
		int minI = 0;
		for(int i = 0 ; i < n ; i++) {
			if(arr[i]%n == 0) {
				arr[n-1] += n;
			}else {
				arr[arr[i]%n-1] += n;
			} 
		}
		
		for(int i = 0 ; i < n ; i++) {
			if(arr[i] > max) {
				max = arr[i];
				maxI = i;
			}
			if(arr[i] < min) {
				min = arr[i];
				minI = i;
			}
		}
		a[0] = minI + 1;
		a[1] = maxI + 1;
		
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 3, 2 , 4 , 5 , 5};
		int a[] = findTwoElement(arr , 6);
		System.out.println(a[0] + "  " + a[1]);

	}

}
