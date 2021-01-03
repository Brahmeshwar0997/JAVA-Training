package GridQuestion;

import java.util.*;

public class SmallestMissingNo {

	public int smallestNo(int[] array) {

		/*
		 * First Way to Finding Smallest missing number with n log(n)
		 * 
		 */
//		Arrays.sort(array); 
//		for (int i = 0; i < array.length-1; i++) {
// 			if((array[i]>=0 && array[i+1]-array[i]>1)) {
//				return array[i]+1;
//			}
//			
//		}
//		return array[array.length-1]+1;

		/*
		 * Second Way to Finding Smallest missing number with n log(n)
		 * 
		 */
//		Arrays.sort(array);
//		int key=0;
//		for (int i = 0; i < array.length-1; i++) {
//			  
//			  int res = Arrays.binarySearch(array, array[i]+1); 
//			  
//		        boolean test = res <0 ? true : false; 
//  			if((array[i]>=0 && test)) {
// 				return array[i]+1;
// 			}
//			 
//		}
//		return array[array.length-1]+1;
//		
		
		
		/*
		 * Third Way to Finding Smallest missing number with O(n)
		 * 
		 */
		
		Map<Integer, Integer> miss = new HashMap();

		for (int i : array) {
			if (miss.containsKey(i)) {
				miss.put(i, miss.get(i) + 1);
			} else {
				miss.put(i,  1);

			}

		}
		for (int i = 1; i < 2000000; i++) {
			if(!miss.containsKey(i)) {
				return i;
			}
		}return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmallestMissingNo miss = new SmallestMissingNo();
		int[] arr = new int[] { -6, 2, 1, -4, 4, 3, 7, 5 };
		// invoking sort() method of the Arrays class
		Arrays.sort(arr);
		System.out.println(miss.smallestNo(arr));

	}

}
