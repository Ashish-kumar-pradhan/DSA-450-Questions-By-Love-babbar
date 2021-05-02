package array;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElementsIn3SortedArray {
	
	public static  ArrayList<Integer> commonElem1(int A[], int B[], int C[], int n1, int n2, int n3) {
		
		HashMap<Integer,Integer> h1 = new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> h2 = new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> h3 = new HashMap<Integer,Integer>();
		
		for(int i : A ) {
			h1.put(i, i);
		}
		for(int i : B ) {
			h2.put(i, i);
		}
		for(int i : C ) {
			h3.put(i, i);
		}
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0 ; i < n1 ; i++) {
			if(h1.containsKey(A[i]) && h2.containsKey(A[i]) && h3.containsKey(A[i])) {
				arr.add(A[i]);
				h1.remove(A[i]);
			}
		}
		
		return arr;
	}
	
	public static  ArrayList<Integer> commonElem2(int A[], int B[], int C[], int n1, int n2, int n3) {
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		while(i < n1 && j < n2 && k < n3) {
			if(A[i] == B[j] && A[i] == C[k]) {
				arr.add(A[i]);
				i++;
				j++;
				k++;
			}
			
			else if(A[i] < B[j]) {
				i++;
			}
			
			else if(B[j] < C[k]) {
				j++;
			}
			
			else{
				k++;
			}
			
			
			if(i > 0) {
				int xx = A[i - 1];
				while (A[i] == xx ) {
					if(i >= n1 - 2) {
						break;
					}
					i++;
				}
			}
			
			if(j > 0) {
				int yy = B[j-1];
				while (B[j] == yy) {
					if(j >= n2 - 2) {
						break;
					}
					j++;
				}
			}
			
			
			if(k > 0) {
				int zz = C[k - 1];
				while (C[k] == zz) {
					if(k >= n3 - 2) {
						break;
					}
					k++;
				}
			}
			
			
			
			
		}
		
		return arr;
	}

	public static void main(String[] args) {
		
		int a[] = {2 , 3, 3};
		int b[] = {1 , 2, 3};
		int c[] = {2 , 3, 3 , 4};
		
		ArrayList<Integer> arr = commonElem2(a , b , c , 3 , 3, 4);
		
		for(int i = 0 ; i < arr.size() ; i++) {
			System.out.print(arr);
		}
		

	}

}
