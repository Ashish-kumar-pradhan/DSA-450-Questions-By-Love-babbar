package array;

public class ReverseArray {
	
	public static int[] reverse(int arr[]) {
		int arr2[] = new int[arr.length];
		for (int i = 0 ; i < arr.length ; i++) {
			arr2[arr.length - i - 1] = arr[i];
		}
		return arr2;
	}
	
	public static int[] reverseFast(int arr[]) {
		for(int i = 0 ; i < arr.length/2 ; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1 -i];
			arr[arr.length-1-i] = temp;
		}
		
		return arr;
	}
	
	public static void print(int arr[]) {
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1 , 2 , 3 , 4 , 5 , 6 , 7, 8 , 9};
		arr = reverseFast(arr);
		print(arr);

	}

}
