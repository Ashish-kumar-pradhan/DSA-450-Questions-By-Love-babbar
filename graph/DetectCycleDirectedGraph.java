package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleDirectedGraph {
	
	 public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> list)
	    {
		   
		    int indegree[] = new int[V];

	        for(int i = 0; i < V; i++){
	            for(int node : list.get(i)){
	                indegree[node]++;
	            }
	        }
	        
	        Queue<Integer> q = new LinkedList<Integer>();
	        for(int i = 0;i < V; i++){
	            if(indegree[i]==0) q.add(i);
	        }
	        int cnt = 0;

	        while(!q.isEmpty()){
	            int u=q.poll();
	            
	            for(int node : list.get(u)){
	                if(--indegree[node] == 0) q.add(node);
	            }
	            cnt++;
	        }
	        
	        return cnt != V;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
