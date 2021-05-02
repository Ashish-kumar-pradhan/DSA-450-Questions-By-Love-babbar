package array;

public class ThreeWayPartitioning {
	
	public static void threeWayPartition(int array[], int a, int b) {
		int n = array.length;
		int l = 0;
		int r = n-1;
		
		for(int i = 0 ; i <= r ;) {
			if(array[i] < a) {
				array[l] += array[i] - (array[i] = array[l]);
				l++;
				i++;
			}
			
			else if(array[i] > b) {
				array[r] += array[i] - (array[i] = array[r]);
				r--;
			}
			else {
				i++;
			}
		}
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

}
