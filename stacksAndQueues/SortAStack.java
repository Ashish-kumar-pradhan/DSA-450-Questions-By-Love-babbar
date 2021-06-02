package stacksAndQueues;

import java.util.Stack;

public class SortAStack {
	
	public Stack<Integer> sortI(Stack<Integer> s)
	{
		//add code here.
		int arr[] = new int[s.size()];
		for(int i = 0 ; i < arr.length ; i++){
		    arr[i] = s.pop();
		}
		
		for(int i = 0 ; i < arr.length ; i++){
		    for(int j = i + 1 ; j < arr.length ; j++){
		        if(arr[i] > arr[j]){
		            int temp = arr[i];
		            arr[i] = arr[j];
		            arr[j] = temp;
		        }
		    }
		}
		
		for(int i = 0 ; i < arr.length ; i++){
		    s.push(arr[i]);
		}
		
		return s;
	}
	
   public static void sortR(Stack<Integer> S){
		
		if(S.isEmpty()) {
			return;
		}
		
		int top = S.pop();
		sortR(S);
		
		sortElem(S , top);
		
	}

	private static void sortElem(Stack<Integer> S, int elem) {
	// TODO Auto-generated method stub
		
		if(S.isEmpty() || S.peek() < elem) {
			S.push(elem) ;
			return;
		}
		
		int topElem = S.pop();
		sortElem(S , elem);
		S.push(topElem);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    Stack<Integer> st = new Stack<>();
		
		int i = 0;
		while(i < 10) {
			st.push(i+1);
			i++;
		}
		
		sortR(st);
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}

	}

}
