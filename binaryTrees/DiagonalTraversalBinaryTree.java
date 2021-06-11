package binaryTrees;

public class DiagonalTraversalBinaryTree {
	
	 public ArrayList<Integer> diagonal(Node root)
     {
          //add your code here.
          ArrayList<Integer> arr = new ArrayList<Integer>();
          Queue<Node> qu = new LinkedList<>(); 
          qu.add(root);
          while(!qu.isEmpty()){
              Node cur = qu.remove();
              while(cur != null){
                  if(cur.left != null){
                      qu.add(cur.left);
                  }
                  arr.add(cur.data);
                  cur = cur.right;
              }
          }
          
          return arr;
     }

}
