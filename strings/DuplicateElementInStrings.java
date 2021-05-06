package strings;

import java.util.HashMap;

public class DuplicateElementInStrings {
	
	public static void dupElem(String S) {
		HashMap<Character,Integer> hp = new HashMap<Character,Integer>();
		for(int i = 0 ; i < S.length() ; i++) {
			if(hp.containsKey(S.charAt(i))) {
				hp.put(S.charAt(i), hp.get(S.charAt(i)) + 1);
			} 
			else {
				hp.put(S.charAt(i), 1);
			}
		}
		
		for(int i = 0 ; i < S.length() ; i++) {
			if(hp.containsKey(S.charAt(i)) && hp.get(S.charAt(i)) > 1) {
				System.out.println(S.charAt(i) + " Count " + hp.get(S.charAt(i)) );
				hp.remove(S.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "test string";
        dupElem(str);

	}

}
