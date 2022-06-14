import java.util.Arrays;

public class SortedSquaredArray {
    public static void main(String[] args) {
        int[] array = { -7, -5, -4, 3, 6, 8, 9 };
        int[] result = sortedSquaredArrayBruteForce(array);
        for (int value : result) {
            System.out.println(value);
        }
        System.out.println("Is Array Sorted : " + isSorted(result));

    }

    private static boolean isSorted(int[] array) {
        int[] defaultArray = array.clone();
        Arrays.sort(array);
        if (Arrays.equals(defaultArray, array)) {
            return true;
        }
        return false;
    }

    private static int[] sortedSquaredArrayBruteForce(int[] array) {
        // create a new array with size of original array
        int[] squaredArray = new int[array.length];
        // run a for loop
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            // on every iteration keep sorting square of value in newly created array
            squaredArray[i] = value * value;
        }
        // sort the array and return it
        Arrays.sort(squaredArray);
        return squaredArray;
    }
}
