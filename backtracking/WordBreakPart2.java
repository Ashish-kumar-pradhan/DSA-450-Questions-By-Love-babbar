package backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordBreakPart2 {
	
	static void wBH(String s , HashMap<String , Integer> dic, String ans , List<String> ansList){
        if(s.length() == 0){
            ansList.add(ans.substring(0 , ans.length() - 1));
            return;
        }
        for(int i = 0 ; i < s.length() ; i++){
            String left = s.substring(0 , i+1);
            if(dic.containsKey(left)){
                String right = s.substring(i + 1);
                wBH(right , dic , ans + left + " " , ansList); 
            }
        }
    }
    static List<String> wordBreak(int n, List<String> dict, String s)
    {
        // code here
        List<String> ansList = new ArrayList<>();
        String ans = "";
        HashMap<String , Integer> dic = new HashMap<>();
        for(int i = 0 ; i < dict.size() ; i++){
            dic.put(dict.get(i) , i);
        }
        wBH(s , dic , ans, ansList);
        return ansList;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
