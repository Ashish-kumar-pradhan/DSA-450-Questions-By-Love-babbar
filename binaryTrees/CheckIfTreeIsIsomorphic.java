package binaryTrees;

public class CheckIfTreeIsIsomorphic {
	
	boolean isIsomorphic(Node root1, Node root2)  
    { 
         // code here.
         if(root1 == null && root2 == null){
             return true;
         }
         if(root1 == null || root2 == null){
             return false;
         }
         if(root1.data != root2.data){
             return false;
         }
         
         boolean a = isIsomorphic(root1.left, root2.right) && isIsomorphic(root1.right, root2.left);
         boolean b = isIsomorphic(root1.left, root2.left) && isIsomorphic(root1.right, root2.right);
         
         return a || b; 
         
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
