package A;

import java.util.*;

public class Main {
  
  /**
   * Merge sort the array and return the number of swaps.
   * 
   * @param array the array to be merge sorted
   * @return the number of swaps to sort the array
   */
  public static int mergeSortCountSwaps(int[] array) {
    return mergeSortCountSwaps(array, new int[array.length], 0, array.length - 1);
  }

  /**
   * Merge sort implementation.
   * 
   * @param array the array to be sorted
   * @param temp the temp array to help the merge part
   * @param left the left start index
   * @param right the right ending index
   * @return the number of swaps to sort the array
   */
  private static int mergeSortCountSwaps(int[] array, int[] temp, int left, int right) {
    if (right > left) {
      int middle = (left + right) / 2;
      // call it recursively for two halves
      return mergeSortCountSwaps(array, temp, left, middle)
            + mergeSortCountSwaps(array, temp, middle + 1, right)
            // merge the two sorted halves
            + merge(array, temp, left, middle + 1, right);
    }
    return 0;
  }

  /**
   * The merge helper function for MergeSort
   * 
   * @param array the array to be sorted
   * @param temp the helper temp array
   * @param left the left start index
   * @param middle the middle index
   * @param right the right ending index
   * @return the number of swaps on subarrays merge
   */
  private static int merge(int[] array, int[] temp, int left, int middle, int right) {
    int i = left;
    int j = middle;
    int k = left;
    int swaps = 0;

    while ((i <= middle - 1) && (j <= right)) {
      if (Integer.compare(array[i], array[j]) <= 0) {
        temp[k++] = array[i++];
      } else {
        temp[k++] = array[j++];
        /** Count swaps from j to i */
        swaps += (middle - i);
      }
    }

    /** Copy remaining elements of left subarray */
    while (i <= middle -1) {
      temp[k++] = array[i++];
    }

    /** Copy remaining elements of right subarray */
    while (j <= right) {
      temp[k++] = array[j++];
    }

    /** Copy back merged elements to original array */
    while (left <= right) {
      array[left] = temp[left];
      ++left;
    }

    return swaps;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int t = sc.nextInt();
      
      while (t -- > 0) {
        int n = sc.nextInt();
        int[] array = new int[n];
        Arrays.setAll(array, (i) -> sc.nextInt());

        int minSwaps = mergeSortCountSwaps(array);
        
        System.out.printf("Optimal train swapping takes %d swaps.\n", minSwaps);
      }
    }
  }
}