/*
Finding a position to insert the numeric element in the array: This is a small cool trick to find the position where the requested element can be inserted in the sorted array.
*/


import java.util.Arrays;
public class ElementInsert {
	public static void main(String[] args)
	{
		int[] arr = new int[] { 1, 3, 4, 5, 6 };

		// 2 has to be inserted
		int pos = Arrays.binarySearch(arr, 2);
		System.out.print("Element has to be inserted at: "+ ~pos);
	}
}


//Output: Element has to be inserted at: 1
