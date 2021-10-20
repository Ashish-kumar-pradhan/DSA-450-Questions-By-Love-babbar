package backtracking;
import java.util.*;

public class CombinationSum {
	
    static void combi(ArrayList<Integer> A, int B , int i , ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans){
        
        if(i == A.size()){
            if(B == 0 ){
            ans.add(new ArrayList<>(arr));
            }
            return;
        }
        if(A.get(i) <= B){
            arr.add(A.get(i));
            combi(A , B - A.get(i) , i , arr , ans);
            arr.remove(arr.size() - 1);
        }
        combi(A , B , i + 1 , arr , ans);
    }
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B)
    {
        // add your code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> a = new ArrayList<Integer>();
        Collections.sort(A);
        a.add(A.get(0));
        for(int i = 1 ; i < A.size() ; i++){
            if(a.get(a.size()-1) != A.get(i)){
                a.add(A.get(i));
            }
        }
        combi(a , B , 0 , arr , ans);
        
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
