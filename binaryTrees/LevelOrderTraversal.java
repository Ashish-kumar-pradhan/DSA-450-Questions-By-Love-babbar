package binaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	
	public static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList <Integer> arr = new ArrayList<>();
        Queue<Node> qu = new LinkedList<>();
        qu.add(node);
        while(!qu.isEmpty()){
          Node cur =  qu.remove();
            if(cur.left != null){
                qu.add(cur.left);
            }
            if(cur.right != null){
                qu.add(cur.right);
            }
            arr.add(cur.data);
        }
        
        return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
