package bst;

public class LowestCommonAncestorBST {
	
	Node LCA(Node root, int n1, int n2)
	{
        // code here. 
        if(root == null){
            return null;
        }
        if(root.data == n1 || root.data == n2){
            return root;
        }
         Node l = LCA(root.left , n1 , n2);
         Node r = LCA(root.right , n1 , n2);
         
         if(l != null && r != null ){
             return root;
         }
         if(l != null){
             return l;
         }
         else{
             return r;
         }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
