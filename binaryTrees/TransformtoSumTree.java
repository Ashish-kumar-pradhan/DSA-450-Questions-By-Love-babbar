package binaryTrees;

public class TransformtoSumTree {
	
	public int sum(Node root){
        if(root == null){
            return 0;
        }
        int a = sum(root.left);
        int b = sum(root.right);
        int x = root.data;
        root.data = a + b;
        return a + b + x;
   }
   public void toSumTree(Node root){
        //add code here.
        if(root == null){
            return;
        }
        sum(root);
        
   }

}
