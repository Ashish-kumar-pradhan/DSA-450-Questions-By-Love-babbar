package dp;

public class SumTree {
	
	boolean ans = true;
	int SumTree(Node root){
	    
	    if(root == null ){
	        return 0;
	    }
	    
	    int a = SumTree(root.left);
	    int b = SumTree(root.right);
	    int x = root.data;
	    
	    if(root.left != null || root.right != null){
	        if(a + b != x){
	            ans = false;
	        }
	    }
	    
	    return a + b + x;
	    
	}
	boolean isSumTree(Node root)
	{
	         // Your code here
	    if(root == null){
	        return true;
	    }
	         
	    SumTree(root);
	    
	    return ans;
	    
	}
	
	

}
