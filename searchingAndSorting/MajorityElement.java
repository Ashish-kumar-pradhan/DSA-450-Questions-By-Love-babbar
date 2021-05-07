package searchingAndSorting;

public class MajorityElement {
	
	public static int majorityElement(int a[], int size) {
		int elem = a[0];
		int freq = 1;
		int n = size;
		int count = 0;
		for(int i = 1 ; i < n ; i++) {
			if(a[i] == elem) {
				freq++;
			}
			else {
				freq--;
			}
			
			if(freq == 0) {
				elem = a[i];
				freq++;
			}
		}
		
		for(int i = 0 ; i < n ; i++) {
			if(a[i] == elem) {
				count++;
			}
		}
		
		if(count > n/2) {
			return elem;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {3,1,3,2,2} ;
		System.out.println(majorityElement(A , 5));

	}

}
