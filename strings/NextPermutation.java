package strings;

import java.util.ArrayList;
import java.util.List;

public class NextPermutation {

	static List<Integer> nextPermutation(int N, int arr[]){
		int li = -1;
		int gi = 0;
		for(int i = arr.length - 2 ; i >= 0 ; i--) {
			if(arr[i] < arr[i+1]) {
				li = i;
				break;
			}
		}
		if(li > -1){
			for(int i = arr.length - 1 ; i > 0 ; i--) {
				if(arr[i] > arr[li]) {
					gi = i;
					break;
				}
			}
			
			int temp = arr[li];
			arr[li] = arr[gi];
			arr[gi] = temp;
		}
		
		List<Integer> lst = new ArrayList<>();
		for(int i = 0 ; i < arr.length ; i++) {
			if(i <= li) {
				lst.add(arr[i]);
			}
			else {
				lst.add(arr[arr.length + li - i]);
			}
			
		}
		return lst;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1 , 4 , 3 , 2};
		List<Integer> l = nextPermutation(4 , arr); 
		for(int i = 0 ; i < l.size() ; i++) {
			System.out.println(l.get(i));

		}
		
	}

}
