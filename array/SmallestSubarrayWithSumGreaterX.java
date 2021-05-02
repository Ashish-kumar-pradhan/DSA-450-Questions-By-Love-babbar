package array;

public class SmallestSubarrayWithSumGreaterX {
	
	public static long sb(long a[], long n, long x) {
		
		long sum = a[0];
		long curMin = Long.MAX_VALUE;
		long overMin = Long.MAX_VALUE;
		long i = 0;
		long j = 1 ;
		int c = 1 ;
		while(j < n ){
			
			if(sum <= x) {
				sum = sum + a[(int) j];
				j++;
				if(sum > x && j == n && c == 1) {
					curMin = j - i - 1;
				}
				c = 1;
			}
			else if (sum > x){
				curMin = j - i;
				sum = sum - a[(int) i];
				i++;
				c = 0;
			}
			if (overMin > curMin) {
				overMin = curMin;
			}
			
			
			System.out.println(overMin + "  " + curMin + "  " + i + "  "+ j + "       " + sum + "  "+ c);
			
		} 
		
		return overMin;
    }
	
	
	public static long sb2(long a[], long n, long x) {
		
		long min_len = n + 1;
		 
	        for (long start = 0; start < n; start++)
	        {

	           long curr_sum = a[(int) start];
	 
	            if (curr_sum > x)
	                return 1;

	            for (long end = start + 1; end < n; end++)
	            {
	                
	                curr_sum += a[(int) end];
	 
	                
	                if (curr_sum > x && (end - start + 1) < min_len)
	                    min_len = (end - start + 1);
	            }
	        }
	        return min_len;
	}
	
	public static long sb3(long a[], long n, long x) {
		
		long curr_sum = 0, min_len = n + 1;
	        long start = 0, end = 0;
	        while (end < n) {
	            while (curr_sum <= x && end < n) {
	                curr_sum += a[(int) end++];
	            }
	 
	            while (curr_sum > x && start < n) {
	                if (end - start < min_len) {
	                    min_len = (int) (end - start);
	                }
	                curr_sum -= a[(int) start++];
	            }
	        }
	        return min_len;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long A[] = {1, 3, 4, 7, 10 , 10 , 8 , 10};
		long B[] = {6, 3, 4, 5, 4, 3 , 7 ,9};
		System.out.println(sb2(B , 8 , 16));

	}

}
