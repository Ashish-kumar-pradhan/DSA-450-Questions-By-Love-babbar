package binaryTrees;

public class DuplicatesubtreeinBinaryTree {
	
	HashMap<String , Integer> hp;
    String solve(Node root ,  HashMap<String , Integer> hp ){
        if(root == null){
            return "&";
        }
        String s = "";
        if(root.left == null && root.right == null){
            s = String.valueOf(root.data);
            return s;
        }
        
        s = s + String.valueOf(root.data);
        s = s + solve(root.left , hp);
        s = s + solve(root.right , hp);
        
        if(hp.containsKey(s)){
            hp.put(s , 1);
        }
        else {
            hp.put(s , 0);
        }
        return s;
        
    }
    int dupSub(Node root) {
        // code here 
        hp = new HashMap<>();
        solve(root , hp);
        if(hp.containsValue(1)){
            return 1;
        }
        
        return 0;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
