package binaryTrees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewBinaryTree {
	
	public static ArrayList<Integer> topView(Node root)
    {
        // add your code
      ArrayList<Integer> arr = new ArrayList<Integer>();
      if(root == null){
          return arr ;
      }
      int min = 0;
      int max = 0;
      Queue<Node> qu = new LinkedList<>();
      HashMap<Node , Integer> hp = new HashMap<>();
      HashMap<Integer , Integer> hpmain = new HashMap<>();
      
      qu.add(root);
      hp.put(root , 0);
      while(!qu.isEmpty()){
          
            Node cur = qu.remove();
              
            if(cur.left != null){
              qu.add(cur.left);
              hp.put(cur.left , hp.get(cur) - 1);
              if(hp.get(cur) - 1 < min){
                      min = hp.get(cur) - 1;
                  }
              
            }
            if(cur.right != null){
                  qu.add(cur.right);
                  hp.put(cur.right , hp.get(cur) + 1);
                  if(hp.get(cur) + 1 > max){
                      max = hp.get(cur) + 1;
                  }
            }
            
            if(!hpmain.containsKey(hp.get(cur))){
                hpmain.put(hp.get(cur) , cur.data);
            }
          
            
      }
      
      for(int i = min ; i <= max ; i++){
          arr.add(hpmain.get(i));
      }
      
      
      return arr;
        
    }

}
