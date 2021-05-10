package searchingAndSorting;

public class ArithmeticNumber {
	
	 public static int inSequence(int A, int B, int C){
        // code here
        if(C > 0){
            if((B-A)%C == 0 && B >= A){
            	return 1;
            }  
        }
        
        else if (C < 0){
            if((A-B)%C == 0 && B <= A){
            	return 1;
            }
        }
        else {
        	
        	if(A == B) {
        		return 1;
        	}
        }
        return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(inSequence(10 , 10 , 42));

	}

}
