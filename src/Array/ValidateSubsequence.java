import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

///**** Problem Statement ****///
//Given two non empty arrays of integer, implement [ boolean isValidSubsequence(int[] array, int[] subsequence)] determine whether
// second array is subsequence of first

//What is subsequence : subsequence means the second array must present in first array, adjacent elements can differ but must be in same order

// Sample Input
// array = {1, 21, 3, 14, 5, 60, 7, 6}
// subsequence = {3 ,5 ,6 }

// Sample Output
// true

public class ValidateSubsequence {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1, 21, 3, 14, 5, 60, 7, 6));
        List<Integer> subsequence = new ArrayList<Integer>(Arrays.asList(3, 5, 6));

        boolean result = isValidSubsequence(arrayList, subsequence);
        // boolean result = isValidSubsequenceUsingForLoop(arrayList, subsequence);
        System.out.println(result);
    }

    private static boolean isValidSubsequence(List<Integer> arrayList, List<Integer> subsequence) {
        // create 2 pointer for arrayList and subsequence
        int arrayPointer = 0;
        int subsequencePointer = 0;

        // run while loop till pointers are less then arrayList.size() and
        // subsequence.size()
        while (arrayPointer < arrayList.size() && subsequencePointer < subsequence.size()) {
            // compare arrayList and subsequence using respective pointers, if equal then
            // increment subsequnce pointer else incerement arrayList pointer
            if (arrayList.get(arrayPointer).equals(subsequence.get(subsequencePointer))) {
                subsequencePointer++;
            } else {
                arrayPointer++;
            }
        }
        // after exiting from loop retrun subequence pointer == subequence.size()
        return subsequencePointer == subsequence.size();
    }

    private static boolean isValidSubsequenceUsingForLoop(List<Integer> arrayList, List<Integer> subsequence) {
        // create an counter veriable for subsequence
        int subseqenceCounter = 0;
        // run for loop on arrayList
        for (int value : subsequence) {
            // if counter is equal to subseqence then return true
            if (subseqenceCounter == subsequence.size()) {
                return true;
            }
            if (subsequence.get(subseqenceCounter).equals(value)) {
                // else incement counter
                subseqenceCounter++;
            }
        }

        // return counter == subseqence.size()
        return subseqenceCounter == subsequence.size();
    }

}
