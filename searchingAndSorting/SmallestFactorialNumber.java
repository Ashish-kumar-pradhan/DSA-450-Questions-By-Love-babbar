package searchingAndSorting;

public class SmallestFactorialNumber {
	
	public static int findNum(int n) {
		int count5 = 0;
		int fac = 1;
		
		while(count5 < n) {
			if(fac%5 == 0) {
				int div = fac;
				while(div != 1) {
					div = div/5;
					count5++;
				}
			}
			fac++;
		}
		return fac - 1;
	}
	
	public static int findNumOpti(int n) {
		
		int count5 = 0;
		int fac = 0;
		
		while(count5 < n) {
			fac += 5;
			int f = 5 ;
			while(f <= fac) {
				if(fac%f == 0) {
					count5++;
				}
				f *= 5;
			}
		}
		return fac ;
		
	}
	
	public static int findNumOP(int n) {
		int x = n;
		int i = 0;
		int a = 0;
		while(x >= 0) {
			 x = x - (int)Math.pow(5, i);
			 if(i > 0) {
				 a = a + (int)Math.pow(5, i - 1);
			 }
			 i++; 
		}
	    int count = (int)Math.pow(5, i - 1);
	    if(a == n) {
	    	return count;
	    }
	    
		return  count + findNumOP( n - a) ;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findNumOP(0));
		System.out.println(findNumOpti(0));
		System.out.println(findNum(0));
	}

}
