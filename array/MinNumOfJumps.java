package array;

public class MinNumOfJumps {
	
	public static int minJumps(int[] arr) {
		int i = 0 ;
		int j = 0 ;
		while(i < arr.length) {
			i = i + arr[i];
			j++;
		}
		
		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		System.out.println(minJumps(arr));

	}

}
