package backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class RatInAMazeProblem1 {
	
	public static void printAllPaths(int maze[][] , int i , int j , int path[][] , ArrayList<String> arr ,  String s) {
		int n = maze.length;
		if(i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
			return;
		}
		path[i][j] = 1;
		if(i == n - 1 && j == n - 1) {
			arr.add(s);
			s = "";
			path[i][j] = 0;
			return;
		}
		printAllPaths(maze , i , j - 1 , path , arr , s + "L");
		printAllPaths(maze , i + 1 , j , path , arr , s + "D");
		printAllPaths(maze , i , j + 1 , path , arr , s + "R");
		printAllPaths(maze , i - 1 , j , path , arr , s + "U");
		path[i][j] = 0;
		
	}
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        String s = "";
        ArrayList<String> arr = new ArrayList<String>();
        int path[][] = new int[n][n];
	    printAllPaths(m , 0 , 0 , path , arr , s);
	    Collections.sort(arr);
	    return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
