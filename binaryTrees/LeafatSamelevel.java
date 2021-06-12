package binaryTrees;

public class LeafatSamelevel {
	
	boolean checkI(Node root)
    {
	// Your code here
	    boolean ans = true;
	    int m = -1;
    	Queue<Node> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            int n = qu.size();
            for(int i = 0 ; i < n ; i++){
                Node cur =  qu.remove();
                if(cur.left != null){
                    qu.add(cur.left);
                }
                if(cur.right != null){
                    qu.add(cur.right);
                }
                if(cur.left == null && cur.right == null){
                    if(i == 0){
                        m = 1;
                    }
                    if(i != 0 && m != 1){
                        ans = false;
                        break;
                    }
                }
                
            }
            
        }
        
        return ans;
    }
	
	
	
	
	    boolean ans;
	    void checkHelp(Node root ,int h , int[] ln){
	        if(root == null){
	            return;
	        }
	        if(ans == false){
	            return;
	        }
	        if(root.left == null && root.right == null){
	            if(ln[0] == -1){
	                ln[0] = h;
	            }
	            else {
	                if(h != ln[0]){
	                ans = false;
	             }
	            }
	            return;
	        }
	        checkHelp(root.left , h + 1 , ln);
	        checkHelp(root.right , h + 1 , ln);
	    }
	    
	    boolean checkR(Node root)
	    {
		// Your code here
		int h = 0;
		int[] ln = new int[1];
		ln[0] = -1;
		ans = true;
		checkHelp(root , h , ln);
		
		return ans;
		
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
