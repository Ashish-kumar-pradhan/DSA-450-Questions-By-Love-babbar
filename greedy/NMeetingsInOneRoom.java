package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class NMeetingsInOneRoom {
	
	public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        int[][] array = new int[n][2];
        for (int i = 0; i < n; i++) {
            array[i][0] = end[i];
            array[i][1] = start[i];
        }
        Arrays.sort(array, Comparator.comparingInt(b -> b[0]));
        int endTime = array[0][0];
        int counter = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i][1] > endTime) {
                counter++;
                endTime = array[i][0];
            }
        }
        return counter;
 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
