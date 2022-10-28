import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Insertion sort is a simple sorting algorithm that builds the final sorted array one item at a time. 
 * It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.
 */
public class InsertionSort {

    public int[] sort(int[] input) {
        var arr = Arrays.copyOf(input, input.length);

        for (var i = 1; i < arr.length; i++) {
            for (var j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        var arr = new int[]{34, 12, 34, 7, 3, 23, 65, 23};
        var insertionSort = new InsertionSort();
        int[] output = insertionSort.sort(arr);
        System.out.println(Arrays.stream(output).mapToObj(String::valueOf).collect(Collectors.joining(",")));
    }

}
