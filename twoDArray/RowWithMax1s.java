package twoDArray;

public class RowWithMax1s {
	
	public static int rowWithMax1s(int arr[][], int n, int m) {
		int row = 0 ;
		int j = m - 1;
		for(int i = 0 ; i < n ; i++) {
			while(arr[i][j] == 1) {
				row = i;
				j--;
				if(j==-1) {
					break;
				}
			}
			if(j==-1) {
				break;
			}	
		}
		
		return row;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Arr[][] = {{1, 1, 1, 1},
		           {0, 0, 0, 1},
		           {0 , 0 , 1, 1},
		           {0, 1, 1, 1}};
		
		System.out.println(rowWithMax1s( Arr , 4, 4));
		

	}

}
