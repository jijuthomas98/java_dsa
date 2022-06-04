
///**** Problem Statement ****///
// In this problem, you have to implement the int [] removeEven(int[] arr) method, 
// which removes all the even elements from the array and returns back updated array.

// Sample Input
// arr = {1, 2, 4, 5, 10, 6, 3}

// Sample Output
// arr = {1, 5, 3}

public class RemoveEventInt {
    public static void main(String[] args) {
        int[] inputArray = { 1, 2, 4, 5, 10, 6, 3 };

        int[] outputArray = removeEven(inputArray);

        for (int i = 0; i < outputArray.length; i++) {
            System.out.println(outputArray[i] + " ");
        }
    }

    private static int[] removeEven(int[] inputArray) {
        // find the occurence of odd element in array ;
        int oddCounter = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 != 0)
                oddCounter++;
        }

        // create a new array with the size of odd elements from {oddCounter}
        int[] oddArray = new int[oddCounter];
        // maintain a counter to add values in {oddArray}
        int oddArrayCounter = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 != 0)
                oddArray[oddArrayCounter++] = inputArray[i];
        }

        return oddArray;
    }
}
