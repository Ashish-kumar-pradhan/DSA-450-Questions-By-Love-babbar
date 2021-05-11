package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class PermutationsGivenString {
	
	 public static List<String> find_permutation(String S) {
		 List<String> lst = new ArrayList<>();
		 lst = find_permutationHelp(S, 0 , S.length() - 1 , lst) ;
		 Collections.sort(lst);
		 return lst;
	 } 

	public static List<String> find_permutationHelp(String str , int l , int r , List<String> lst) {
		
		 if (l == r) {
			 lst.add(str);
		 }
		 else{
	            for (int i = l; i <= r; i++) {
	                str = swap(str,l,i);
	                find_permutationHelp(str, l+1, r , lst);
	                str = swap(str,l,i);
	            }
	     }
		 return lst;
	}
	
	 public static String swap(String a, int i, int j)
	    {
	        char temp;
	        char[] charArray = a.toCharArray();
	        temp = charArray[i] ;
	        charArray[i] = charArray[j];
	        charArray[j] = temp;
	        return String.valueOf(charArray);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S = "ljr";
		List<String> g = find_permutation(S);
		for(int i = 0 ; i < g.size(); i++) {
			System.out.println(g.get(i));
		}
	}

}
