package twoDArray;

import java.util.ArrayList;

public class SpirallyTraversingMatrix {
	
	public static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c){
		
		    int t = 0;
			int b = r - 1;
			int l = 0;
			int n = c - 1;
			int it = 0;
			
			ArrayList<Integer> arr = new ArrayList<Integer>();
			while (t <= b && n >= l) {
				
				if(it==0) {
					for(int i = l ; i <= n ; i++) {
						arr.add(matrix[t][i]);
					}
					t++;
				}
				
				else if(it==1) {
					for(int i = t ; i <= b  ; i++) {
						arr.add(matrix[i][n]);
					}
					n--;
				}
				
				else if(it==2) {
					for(int i = n ; i >= l ; i--) {
						arr.add(matrix[b][i]);
					}
					b--;
				}
				
				else if(it==3) {
					for(int i = b ; i >= t ; i--) {
						arr.add(matrix[i][l]);
					}
					l++;
				}
				
				it = (it + 1) % 4 ;
			}
			
			return arr;
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrix[][] = {{1, 2, 3, 4},
		           {5, 6, 7, 8},
		           {9, 10, 11, 12},
		           {13, 14, 15,16}};
		int array[][] = {{1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12}};
		
		ArrayList<Integer> arr = spirallyTraverse(array , 3 , 4);
		for(int i = 0 ; i < arr.size() ; i++) {
			System.out.print(arr.get(i) + " ");
		}
	}
		
	
}


