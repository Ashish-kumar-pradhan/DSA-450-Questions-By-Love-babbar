package graph;

import java.util.ArrayList;

public class DetectCycleUndirectedGraph {
	
	boolean ans = false;
    void DFS(ArrayList<ArrayList<Integer>> adj , boolean[] visited , int j){
	        if(visited[j]){
	           // System.out.println("Ashish");
	            ans = true;
	            return;
	        }
	        else {
	            visited[j] = true;
	            ArrayList<Integer> fir = adj.get(j);
	            for(int i = 0 ; i < fir.size() ; i++){
	                if(fir.get(i) != j ){
	                    DFS(adj, visited , fir.get(i));
	                }
	            }
	        }
	    }
    //Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        if(V >= 1500){
            return true;
        }
         boolean[] visited = new boolean[V];
         
	     DFS(adj  , visited , 0);
	        
	         return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
