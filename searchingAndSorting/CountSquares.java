package searchingAndSorting;

public class CountSquares {
	
	public static int countSquares(int N) {

		return (int)Math.pow(N-1, .5);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countSquares(0));

	}

}
