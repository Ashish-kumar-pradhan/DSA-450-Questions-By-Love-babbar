package searchingAndSorting;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllFourSumNumbers {
	
	public static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k){
		
		int n = arr.length;
		Arrays.sort(arr);
		ArrayList<ArrayList<Integer>> list = new  ArrayList<>();
		
		for(int i = 0 ; i < n - 3 ; i++) {
		    if (arr[i] > 0 && arr[i] > k) break;
            if (i > 0 && arr[i] == arr[i - 1]) continue;
			for(int j = i + 1 ; j < n - 2 ; j++) {
			    if (j > i + 1 && arr[j] == arr[j - 1]) continue;
				int l = j + 1 ;
				int r = n - 1;
				while(r > l) {
				    int old_l = l;
                    int old_r = r;
					if(arr[i] + arr[j] + arr[l] + arr[r] < k) {
						l++;
						
					}
					else if(arr[i] + arr[j] + arr[l] + arr[r] > k) {
						r--;
					}
					else {
						ArrayList<Integer> a = new ArrayList<Integer>();
						a.add(arr[i]);
						a.add(arr[j]);
						a.add(arr[l]);
						a.add(arr[r]);
						list.add(a);
						while (l < r && arr[l] == arr[old_l]) l++;
                        while (l < r && arr[r] == arr[old_r]) r--;
					}
				}
				
			}
			
		}
		return list;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {0,0,2,1,1};
		ArrayList<ArrayList<Integer>> list = fourSum(A , 3);
		
		
		for(int i = 0 ; i < list.size() ; i++) {
			ArrayList<Integer> a = list.get(i);
			for(int j = i + 1 ; i < a.size() ; j++) {
				System.out.print(a.get(i) + " ");
			}
			System.out.println();
			
		}

	}

}
