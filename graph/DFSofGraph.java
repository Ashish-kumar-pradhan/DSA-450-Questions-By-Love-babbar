package graph;

import java.util.ArrayList;

public class DFSofGraph {
	
	 void DFS(ArrayList<ArrayList<Integer>> adj , ArrayList<Integer> ans , boolean[] visited , int j){
	        if(!visited[j]){
	            ans.add(j);
	            visited[j] = true;
	            ArrayList<Integer> fir = adj.get(j);
	            for(int i = 0 ; i < fir.size() ; i++){
	                DFS(adj , ans , visited , fir.get(i));
	            }
	        }
	    }
	    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
	    {
	        // Code here
	         ArrayList<Integer> ans = new ArrayList<>();
	         boolean[] visited = new boolean[V];
	         DFS(adj , ans , visited , 0);
	        
	         return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
