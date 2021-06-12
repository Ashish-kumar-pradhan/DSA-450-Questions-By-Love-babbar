package binaryTrees;

public class MirrorTree {
	
	void mirror(Node node) {
        // Your code here
        
        if(node == null){
            return;
        }
        mirror(node.left);
        mirror(node.right);
        
        Node temp = node.right;
        node.right = node.left;
        node.left = temp;
    }

}
