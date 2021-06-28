package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSofGraph {
	
	 public ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj)
	    {
	        ArrayList<Integer> ans = new ArrayList<>();
	        boolean[] visited = new boolean[V];
	        Queue<Integer> q = new LinkedList<>();
	        
	        q.add(0);
	        
	        while (!q.isEmpty()) {
	            int u = q.poll();
	            ans.add(u);
	            for (int s: adj.get(u)) {
	                if(!visited[s]) {
	                    visited[s] = true;
	                    q.add(s);
	                }
	            }
	        }
	        return ans;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
