package bst;

public class CountBSTNodeslieGivenRange {
	
	void af(Node root,int l, int h , ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        af(root.left , l , h , arr);
        if(root.data >= l && root.data <= h){
            arr.add(root.data);
        }
        af(root.right , l , h , arr);
        
    }
    int getCount(Node root,int l, int h)
    {
        //Your code here
        ArrayList<Integer> arr = new ArrayList<>();
        af(root , l , h , arr);
       
        return arr.size();
    }

}
