package twoDArray;

import java.util.Arrays;

public class SortedMatrix {
	
	public static int[][] sortedMatrix(int N, int Mat[][]) {
		
		int temp[] = new int[N*N];
		int k = 0;

		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N ; j++) {
				temp[k] = Mat[i][j];
				k++;
			} 
		}
		
		Arrays.sort(temp);
		k = 0;
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N ; j++) {
				Mat[i][j] = temp[k];
				k++;
			} 
		}
		
		return Mat;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] Mat = {{10,20,30,40},
		         {15,25,35,45}, 
		        		 {27,29,37,48}, 
		        		 {32,33,39,50}};
		
		int mat[][] = sortedMatrix(4 , Mat);
		
		for(int i = 0 ; i < 4 ; i++) {

			for(int j = 0 ; j < 4 ; j++) {
				System.out.print(mat[i][j] + " ");
			} 
			System.out.println();
		} 

	}

}
