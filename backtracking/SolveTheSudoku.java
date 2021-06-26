package backtracking;

public class SolveTheSudoku {
	
	
	static boolean isSafe(int row,int col,int[][] grid,int num){
        for(int i=0;i < 9;i++){
            if(grid[row][i]==num) return false;
            if(grid[i][col]==num) return false;
            if(grid[3*(row/3) + i/3][3*(col/3) + i%3]==num) return false;
        }
        return true;
    }
    
    static boolean recur(int[][] grid){
        for(int i=0;i < grid.length; i++){
            for(int k=0; k < grid[0].length; k++){
                if(grid[i][k]==0){
                    for(int num=1;num<=9;num++){
                        if(isSafe(i,k,grid,num)){
                            grid[i][k]=num;
                            if(recur(grid)==true){
                                return true;
                            }
                            else{
                                grid[i][k]=0;
                            }
                        }
                    }
                return false;
                }
            }
        }
        
        return true;
    }
        
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int grid[][])
    {
        // add your code here
        return recur(grid);
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        // add your code here
        for(int i=0;i < 9;i++){
            for(int k=0;k < 9;k++){
                System.out.print(grid[i][k] + " ");
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
