package GridQuestion;

import java.util.Arrays;

public class MaximumSum {

	static int[] sum;
	static int count = 1;

	public static int find_MaximumSum(int[] arr) {
		for (int i=0; i<arr.length; i++) 
			sum[i] = arr[i]; 
		for (int i = 1; i < arr.length; i++) {
			if (i - 2 < 0) {
				if (arr[i] > sum[i - 1]) {
					sum[i] = arr[i];
				} else {
					sum[i] = sum[i-1];
				}
			} else {
 
				if (sum[i - 1] > (sum[i - 2] + arr[i])) {
					sum[i] = sum[i-1];
				}
				else {
					sum[i] = sum[i - 2] + arr[i];
				}
			}
 		}
		
 		return sum[sum.length-1];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 3, 2, 7, 10,32 ,42,4,566,3,4};
		sum = new int[arr.length];
		sum[0] = arr[0];
		System.out.println(find_MaximumSum(arr));
	}

}
