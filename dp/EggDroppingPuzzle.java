package dp;

public class EggDroppingPuzzle {
	
	static int eggDrop(int n, int k) 
	{
		
	    if(n == 1 || k <= 1) return k;
	    
        return (int)(Math.ceil(Math.log(k)/Math.log(2)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
