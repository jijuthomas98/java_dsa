///**** Problem Statement ****///
//In this problem, you have to implement the int[] findSum(int[] arr, int n) method, which will take a number n, 
//and an array arr as input and returns an array of two integers that add up to n in an array.
// You are required to return only one such pair. If no such pair is found then simply return the array.

// Sample Input
// arr = {1, 21, 3, 14, 5, 60, 7, 6}
// value = 27

// Sample Output
// arr = {21, 6} or {6, 21}

public class SumOfTwoEqualToN {
    public static void main(String[] args) {
        int[] arr = { 1, 21, 3, 14, 5, 60, 7, 6 };
        int value = 27;
        if (arr.length > 0) {
            int[] result = findSumUsingBruteForce(arr, value);

            int num1 = result[0];
            int num2 = result[1];

            if (num1 + num2 != value) {
                System.out.println("Not found");
            } else {
                System.out.println("NUM 1 = " + num1);
                System.out.println("NUM 2 = " + num2);
                System.out.println("SUM  = " + value);
            }

        } else {
            System.out.println("Array is Empty");
        }
    }

    private static int[] findSumUsingBruteForce(int[] arr, int value) {

        // Create an array with size 2, coz we need to return values which sums to 27
        int[] result = new int[2];

        // run for inside for loop, to iterate and compare individual elements with 2
        // pointer values from each for loop
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // inside inner for loop, check weather 2 elements from each pointer equels to
                // value(27),
                // if true then put those elements in index 0 and 1 at result array and return
                // value and terminate for loop
                if (arr[i] + arr[j] == value) {
                    result[0] = arr[i];
                    result[1] = arr[j];
                    return result;
                }
            }
        }

        // else return arr;
        return arr;
    }
}

// Time Complexity = O(n^2)