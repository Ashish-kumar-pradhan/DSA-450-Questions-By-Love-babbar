package bst;

public class BinaryTreeBST {
	
	void af(Node root , ArrayList<Integer> arr){
        if(root == null){
            return ;
        }
        af(root.left , arr);
        arr.add(root.data);
        af(root.right , arr);
    }
    
     void bf(Node root , Queue<Integer> qu){
        if(root == null){
            return ;
        }
        bf(root.left , qu);
        root.data = qu.remove();
        bf(root.right , qu);
    }
    Node binaryTreeToBST(Node root)
    {
       
       ArrayList<Integer> arr = new ArrayList<>();
       Queue<Integer> qu = new LinkedList<>();
       af(root ,arr);
       Collections.sort(arr);
       for(int i = 0 ; i < arr.size() ; i++){
           qu.add(arr.get(i));
       }
       bf(root ,qu);
       return root;
    }

}
