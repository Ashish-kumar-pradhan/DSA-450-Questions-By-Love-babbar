package greedy;

public class ChooseAndSwap {
	
	 String chooseandswap(String A){
	        // Code Here
	        int n  = A.length();
	        boolean arr[] = new boolean[256];
	        char a = 'a';
	        char b = 'a';
	        for(int i = 0 ; i < n-1 ; i++){
	            a = A.charAt(i);
	            b = A.charAt(i);
	            for(int j = i + 1 ; j < n ; j++){
	                if(!arr[A.charAt(j)] && A.charAt(j) < b){
	                    b = A.charAt(j);
	                }
	            }
	            
	            if(b == a){
	                arr[a] = true;
	            }
	            else {
	                break;
	            }
	        }
	       
	        if(b != a){
	            String ans = "";
	            for(int i = 0 ; i < n ; i++){
	                if(A.charAt(i) == a){
	                    ans += b;
	                }
	                else if(A.charAt(i) == b){
	                    ans += a;
	                }
	                else {
	                    ans += A.charAt(i);
	                }
	            }
	            return ans;
	        }
	        else {
	            return A;
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
