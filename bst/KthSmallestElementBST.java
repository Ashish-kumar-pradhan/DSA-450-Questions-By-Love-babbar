package bst;

public class KthSmallestElementBST {
	
	void af(Node root , ArrayList<Integer> arr){
        if(root == null){
            return ;
        }
        af(root.left , arr);
        arr.add(root.data);
        af(root.right , arr);
    }
    public int KthSmallestElement(Node root, int K) 
    {
        // Write your code here
        ArrayList<Integer> arr = new ArrayList<>();
        af(root , arr);
        if(arr.size() >= K ){
            return arr.get(K-1);
        } else {
            return -1;
        }
    }

}
