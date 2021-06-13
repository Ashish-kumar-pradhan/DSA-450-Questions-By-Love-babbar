package bst;

public class CheckforBST {
	
	 void BST(Node root , ArrayList<Integer> arr){
	        
	        if(root == null){
	            return;
	        }
	        
	        BST(root.left , arr);
	        arr.add(root.data);
	        BST(root.right , arr);

	    }
	    boolean isBST(Node root)
	    {
	        // code here.
	        ArrayList<Integer> arr = new ArrayList<>();
	        BST(root , arr);
	        for(int i = 0 ; i < arr.size() - 1 ; i++){
	            if(arr.get(i) >= arr.get(i + 1)){
	                return false;
	            }
	        }
	        return true;
	    }

}
