package stacksAndQueues;

public class CircularTour {
	
	public static int tour(int petrol[], int distance[])
    {
	// Your code here
    	int n = petrol.length;
    	int cur = 0;
    	int olddif = 0;
    	int newdif = 0;
    	
    	int i = 0;
    	while(i < n){
    	   newdif += petrol[i] - distance[i];
    	    if(newdif < 0){
    	        olddif += newdif;
    	        newdif = 0;
    	        cur = i + 1;
    	    }
    	    i++;
    	}
    	
    	if((olddif + newdif) >= 0){
    	    return cur;
    	}
    	return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
