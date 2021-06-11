package dp;

public class ConstructTreefromInorderPreorder {
	
	 public static Node buildTreeH(int in[], int pre[] , int inS , int inE  , int preS , int preE ){
	        if(inS > inE){
	            return null;
	        }
	        Node root = new Node(pre[preS]);
	        int mid = -1;
	        for(int i = 0 ; i < pre.length ; i++){
	            if(in[i] == pre[preS]){
	                mid = i; 
	                break;
	            }
	        }
	        root.left = buildTreeH(in, pre , inS , mid - 1  , preS + 1, mid + preS - inS);
	        root.right = buildTreeH(in, pre, mid + 1 , inE , mid + preS - inS + 1, preE );
	        
	        return root;
	    }
	   
	   public static Node buildTree(int in[], int pre[], int n)
	    {
	        // code here 
	        return buildTreeH(in, pre, 0 , n - 1 , 0 , n - 1 );
	    } 

}
