package binaryTrees;

public class HeightofBinaryTree {
	
	public static int height(Node node) 
    {
        // code here
        if(node == null){
            return 0;
        }
        
        return 1 + Math.max(height(node.left),height(node.right));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
