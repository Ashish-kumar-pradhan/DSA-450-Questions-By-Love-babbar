package binaryTrees;

public class BoundaryTraversalBinaryTree {
	
	 void leftT(Node root , ArrayList<Integer> arr){
	        if(root == null){
	            return;
	        }
	        if(root.left != null){
	            arr.add(root.data);
	            leftT(root.left , arr);
	        }
	        else if(root.right != null){
	            arr.add(root.data);
	            leftT(root.right , arr);
	        }
	    }
	    
	    void leaf(Node root , ArrayList<Integer> arr){
	        
	       if(root == null){
	           return;
	       }
	       leaf(root.left , arr);
	       if(root.left == null && root.right == null){
	           arr.add(root.data);
	       }
	       leaf(root.right , arr);
	        
	    }
	    
	    void rightT(Node root , ArrayList<Integer> arr){
	       if(root == null){
	            return;
	        }
	        if(root.right != null){
	            rightT(root.right , arr);
	            arr.add(root.data);
	        }
	        else if(root.left != null){
	            rightT(root.left , arr);
	            arr.add(root.data);
	        }
	        
	    }
	    
		ArrayList <Integer> printBoundary(Node root)
		{
		  ArrayList<Integer> arr = new ArrayList<Integer>();
	      if(root == null){
	          return arr;
	      }
	      arr.add(root.data);
	      leftT(root.left , arr);
	      leaf(root , arr);
	      rightT(root.right , arr);
	      return arr;

		}

}
