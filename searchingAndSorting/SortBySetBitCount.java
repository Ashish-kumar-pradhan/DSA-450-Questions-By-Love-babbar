package searchingAndSorting;

import java.util.Arrays;
import java.util.Comparator;

public class SortBySetBitCount {
	
	
	static void sortBySetBitCount(Integer arr[], int n) {
		Arrays.sort(arr, new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
////				return Integer.bitCount(a) > Integer.bitCount(b);
//				Integer.bitCount(b)
				
				return a.compareTo(b);
			}
		   
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
