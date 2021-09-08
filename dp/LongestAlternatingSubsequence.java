package dp;

public class LongestAlternatingSubsequence {
	
	public int AlternatingaMaxLength(int[] arr)
    {
        // code here
        int n = arr.length;
        int ma = 1;
        int mi = 1;
        for(int i = 1 ; i < n ; i++){
            if(arr[i] > arr[i-1]) ma = mi + 1;
            else if(arr[i] < arr[i-1]) mi = ma + 1;
        }
        
        return Math.max(ma , mi);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
