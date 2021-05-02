package array;

import java.util.HashMap;

public class UnionOfTwoArrays {
	
	public static int doUnion(int a[], int n, int b[], int m) {
		
		HashMap hp = new HashMap();
		
		for(int i = 0 ; i < n ; i++) {
			hp.put(a[i], a[i]);
		}
		
		for(int i = 0 ; i < m ; i++) {
			hp.put(b[i], b[i]);
		}
		
		return hp.size();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1 ,2 ,3 ,4 ,5};
		int b[] = {1 , 2 , 3};
		
		System.out.println(doUnion(a , 5 , b , 3));

	}

}
