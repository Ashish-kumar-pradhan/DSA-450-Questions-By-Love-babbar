package binaryTrees;

public class DiameterOfBinaryTree {
	
	public static int height(Node node) 
    {
        // code here
        if(node == null){
            return 0;
        }
        
        return 1 + Math.max(height(node.left),height(node.right));
    }
    public static int diameter(Node root) {
        if(root == null){
            return 0;
        }
        
        int option1 = 1 + height(root.left) + height(root.right);
		int option2 = diameter(root.left);
		int option3 =  diameter(root.right);
		
		int ans = Math.max(option1, Math.max(option2, option3));
		
		return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
