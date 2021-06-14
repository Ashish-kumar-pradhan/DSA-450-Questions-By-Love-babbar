package bst;

public class PopulateInorderSuccessorNodes {
	
	 public void help(Node root ,  ArrayList<Node> arr){
	        if(root == null){
	            return;
	        }
	        help(root.left , arr);
	        arr.add(root);
	        help(root.right , arr);
	    }
	    public void populateNext(Node root){
	        //code here
	        if(root == null){
	            return;
	        }
	         ArrayList<Node> arr = new ArrayList<>();
	        
	        help(root , arr);
	        
	        int n = arr.size();
	        
	        for(int i = 0 ; i < n - 1 ; i++){
	            arr.get(i).next = arr.get(i + 1);
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
