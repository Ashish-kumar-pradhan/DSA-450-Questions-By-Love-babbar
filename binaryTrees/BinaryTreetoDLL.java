package binaryTrees;

public class BinaryTreetoDLL {
	
	 void inorder(Node root , Queue<Node> qu){
	        if(root == null){
	    	    return;
	    	}
	    	inorder(root.left , qu);
	    	qu.add(root);
	    	inorder(root.right , qu);
	    }
	    
	    Node bToDLL(Node root)
	    {
		//  Your code here
	    	if(root == null){
	    	    return root;
	    	}
	    	Queue<Node> qu = new LinkedList<>();
	    	inorder(root , qu);
	    	Node head = qu.remove();
	    	Node pre = head;
	    	while(!qu.isEmpty()){
	    	    Node cur = qu.remove();
	    	    pre.right = cur;
	    	    cur.left = pre;
	    	    pre = cur;
	    	}
	    	
	    	return head;
	    }

}
