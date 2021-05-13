package strings;

public class CountReversals {
	
	public static int countRev(String s) {
		int op = 0;
		int cl = 0;
		if(s.length()%2 != 0) {
			return -1;
		}
		else {
			for(int i = 0 ; i < s.length() ; i++) {
				if(s.charAt(i) == '{') op++;
				else if(s.charAt(i) == '}' && op > 0) op--;
				else cl++;
			}
			System.out.println(cl + "  " + op);
			
			return (cl+1)/2 + (op+1)/2;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "}{{}}{{{"; 
	    System.out.println(countRev(s));

	}

}
