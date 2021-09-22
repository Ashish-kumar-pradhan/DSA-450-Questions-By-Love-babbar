package greedy;

public class SmallestNumber {
	
	static String smallestNumber(int S, int D){
        // code here
        if(S > D*9) return "-1";
        if(S == 0 && D != 1) return "-1";
        
        String ans = "";
        int n = D;
        while(S > 1){
            if(S > 9){
                ans = 9 + ans;
                S = S - 9;
            }
            else if(S <= 9){
                if(n == 1){
                  ans = S + ans;
                  S = 0;  
                }
                else{
                    int v = S-1;
                    ans = v + ans;
                    S = 1;
                }
            }
            n--;
        }
        while(n > 1){
            ans = 0 + ans;
            n--;
        }
        
        if(n == 1 && S == 1 ){
            ans = 1 + ans;
        }
        
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
