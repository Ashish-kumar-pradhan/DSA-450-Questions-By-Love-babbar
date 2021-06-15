package bst;

public class KthlargestElementBST {
	
	void af(Node root , ArrayList<Integer> arr){
        if(root == null){
            return ;
        }
        af(root.right , arr);
        arr.add(root.data);
        af(root.left , arr);
    }
    public int kthLargest(Node root,int K)
    {
        //Your code here
        ArrayList<Integer> arr = new ArrayList<>();
        af(root , arr);
        return arr.get(K-1);
    }

}
