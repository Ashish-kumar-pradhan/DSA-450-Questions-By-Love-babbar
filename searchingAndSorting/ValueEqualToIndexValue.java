package searchingAndSorting;

import java.util.ArrayList;

public class ValueEqualToIndexValue {
	
	public static ArrayList<Integer> valueEqualToIndex(int arr[], int n){
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i = 0 ; i < n ; i++) {
			if(i == arr[i]) {
				a.add(i);
			}
		}
		
		return a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
