package binaryTrees;

public class CheckforBalancedTree {
	
	boolean dif = true;
    int height(Node node) 
    {
        // code here
        if(node == null){
            return 0;
        }
        
        int l = height(node.left);
        int r = height(node.right);
        
        if(Math.abs(l - r) > 1){
            dif = false;
        }
        
        return 1 + Math.max(l,r);
        
    }
    
    boolean isBalanced(Node root)
    {
	// Your code here
    	int h = height(root);
    	
    	return dif;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
