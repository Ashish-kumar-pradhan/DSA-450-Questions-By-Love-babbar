package searchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class BishuAndSoldiers {
	
	public static void ans(int Narr[] , int Qarr[] , int n , int q) {
		for(int i = 0 ; i < q ; i++) {
			int count = 0;
			int sum = 0;
			for(int j = 0 ; j < n ; j++) {
				if(Qarr[i] >= Narr[j]) {
					count++;
					sum += Narr[j];
				}
			}
			System.out.println(count+ " " + sum);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int Narr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			Narr[i] = s.nextInt();
		}
		
		int q = s.nextInt();
		int Qarr[] = new int[q];
		for(int i = 0 ; i < q ; i++) {
			Qarr[i] = s.nextInt();
		}
		
		ans(Narr , Qarr , n ,q);		
	}

}
