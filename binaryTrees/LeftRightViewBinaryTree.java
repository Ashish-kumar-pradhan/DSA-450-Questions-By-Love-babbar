package binaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftRightViewBinaryTree {
	
	ArrayList<Integer> rightView(Node root)
    {
      // Your code here
      ArrayList<Integer> arr = new ArrayList<Integer>();
      if(root == null){
          return arr ;
      }
      Queue<Node> qu = new LinkedList<>();
      
      qu.add(root);
      while(!qu.isEmpty()){
          
          int n = qu.size();
          
          for(int i = 0 ; i < n ; i++){
              Node cur = qu.remove();
              if(i == n-1){
                  arr.add(cur.data);
              }
              if(cur.left != null){
                  qu.add(cur.left);
              }
              if(cur.right != null){
                  qu.add(cur.right);
              }
              
          }
          
      }
      return arr;
    }
	
	ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> arr = new ArrayList<Integer>();
      if(root == null){
          return arr ;
      }
      Queue<Node> qu = new LinkedList<>();
      
      qu.add(root);
      while(!qu.isEmpty()){
          
          int n = qu.size();
          
          for(int i = 0 ; i < n ; i++){
              Node cur = qu.remove();
              if(i == 0){
                  arr.add(cur.data);
              }
              if(cur.left != null){
                  qu.add(cur.left);
              }
              if(cur.right != null){
                  qu.add(cur.right);
              }
              
          }
          
      }
      return arr;
    }

}
