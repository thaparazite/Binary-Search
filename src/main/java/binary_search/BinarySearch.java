package binary_search;

/**
 * Binary Search Algorithm Implementation for searching a key in a sorted collection
 */
import java.util.Arrays;

public class BinarySearch {

    public static int recursiveBinarySearch(int[] array, int key, int low, int high) {
        // check if the collection is empty and return -1 if it is
        if (high < low) {
            return -1; // collection is empty
        } // end of if statement

        // calculate mid index of the collection
        int mid = low + (high - low) / 2;

        // check if the key is at the mid index
        if (key < array[mid]) {
            // search the left half of the collection
            return recursiveBinarySearch(array, key, low, mid - 1);
            // check if the key is at the mid index
        } else if (key > array[mid]) {
            // search the right half of the collection
            return recursiveBinarySearch(array, key, mid + 1, high);
        } else {
            // key found at mid index
            return mid;
        } // end of if-else statement

    }// end of recursiveBinarySearch method

    public static void main(String[] args) {
        /*
         * The binary search algorithm works on a sorted collection. If the collection
         * is not sorted, the algorithm will not work. Therefore I am going to implement
         * two scenarios to test the recursiveBinarySearch
         * 
         * Scenario 1: Key not found in the array because the array is not sorted
         * Scenario 2: Key found in the array because the array is sorted
         */
        // Scenario 1: Key found in the array because the array is not sorted
        System.out.println("--------------------- *** Binary Search *** ---------------------------");
        System.out.println("Scenario 1: Key not found in the array because the array is not sorted");
        int[] numbers = { 72, 12, 23, 5, 2, 16, 8, 91, 38, 56 };
        System.out.println(Arrays.toString(numbers));// print the array using the Arrays.toString method
        int key = 23;// key to search for in the collection
        // call the recursiveBinarySearch method to search for the key
        int index = recursiveBinarySearch(numbers, key, 0, numbers.length - 1);
        // check if the key is found in the collection and print the result
        BinarySearch.printResult(key, index);

        /*
         * call the divider method to separate the scenarios and make the output
         * readable
         */
        System.out.println("-----------------------------------------------------------------------");
        // Scenario 2: Key found in the array because the array is sorted
        System.out.println("Scenario 2: Key found in the array because the array is sorted");
        Arrays.sort(numbers);// sort the array in ascending order using the Arrays.sort method
        System.out.println(Arrays.toString(numbers));// print the array using the Arrays.toString method
        // call the recursiveBinarySearch method to search for the key
        index = recursiveBinarySearch(numbers, key, 0, numbers.length - 1);
        // check if the key is found in the collection and print the result
        BinarySearch.printResult(key, index);

        System.out.println("---------------- *** End of Binary Search *** -------------------------");

    }// end of main method

    private static void printResult(int key, int index) {
        // check if the key is found in the collection
        if (index != -1) {
            // key found in the collection
            System.out.println("Key " + key + " found at index " + index);
        } else {
            // key not found in the collection
            System.out.println("Key " + key + " not found in the collection");
        } // end of if-else statement

    }// end of printResult method

}// end of class BinarySearch
