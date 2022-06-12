///**** Problem Statement ****///
// In this problem, you have to implement the int [] mergeArray(int[] arr1, int[] arr2) method, 
// which merge 2 sorted array with result also sorted array

// Sample Input
// arr1 = { 1, 23, 34, 56, 87 }
// arr2 = { 4, 56, 67, 89 }

// Sample Output
// result = {1, 4, 23, 34, 56, 56, 67, 87, 89}

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 23, 34, 56, 87 };
        int[] arr2 = { 4, 56, 67, 89 };

        int[] result = mergeArray(arr1, arr2);

        System.out.println("Array after merging");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    private static int[] mergeArray(int[] arr1, int[] arr2) {
        // create an result array with size of arr1 + arr2
        int l1 = arr1.length;
        int l2 = arr2.length;
        int[] arr3 = new int[l1 + l2];
        // create counters vars to iterate arr1, arr2 and arr3
        int i = 0, j = 0, k = 0;

        // run while loop till counter var is less then length of input arrays
        while (i < l1 && j < l2) {
            // check if arr1 is lesser then arr2 with counter var at its index elements,
            // if its lesser then put arr1 at index i value into arr3 at index k and
            // increment both counter index
            // else put value of arr2 at index j into arr3 at current index k
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }

        // after above exiting from while, check if there are any element left at both
        // array to append at last
        while (i < l1) {
            arr3[k++] = arr1[i++];
        }
        while (j < l2) {
            arr3[k++] = arr2[j++];
        }
        return arr3;
    }
}

// Time Complexity = O(n + m), where n and m are sizes of array arr1 and arr2
