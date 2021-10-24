import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * The Bottom-Up merge sort approach uses iterative methodology.
 * It starts with the “single-element” array, and combines two adjacent elements and also sorting the two at the same time.
 * The combined-sorted arrays are again combined and sorted with each other until one single unit of sorted array is achieved.
 */
public class BottomUpMergeSort {
    
    public int[] sort(int[] input) {
        var arr = Arrays.copyOf(input, input.length);
        var aux = new int[input.length];
        for (var width = 1; width < arr.length; width = 2 * width) {
            int i;
            for (i = 0; i < arr.length; i = i + 2 * width) {
                int left = i;   // start index of array 1
                int middle = i + width; // start index of second array or the end index of first array
                int end = i + 2 * width;    // end of the second array

                merge(arr, left, middle, end, aux);
            }
            for (i = 0; i < arr.length; i++) {
                arr[i] = aux[i];
            }
        }
        return arr;
    }

    private void merge(int[] arr, int left, int middle, int end, int[] aux) {
        int i = left;
        int j = middle;
        int k = left;

        while (i < middle || j < end) {
            if (i < middle && j < end) {
                if (arr[i] < arr[j]) aux[k++] = arr[i++];
                else aux[k++] = arr[j++];
            }

            else if (i == middle) aux[k++] = arr[j++];
            else if (j == end) aux[k++] = arr[i++];
        }
    }

    public static void main(String[] args) {
        var arr = new int[]{34, 12, 34, 7, 3, 23, 65, 23};
        var mergeSort = new BottomUpMergeSort();
        int[] output = mergeSort.sort(arr);
        System.out.println(Arrays.stream(output).mapToObj(String::valueOf).collect(Collectors.joining(",")));
    }
}
