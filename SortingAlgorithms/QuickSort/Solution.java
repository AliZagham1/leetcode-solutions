package SortingAlgorithms.QuickSort;


import java.util.Arrays;

public class Solution {

    // Swap helper
    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    // Partition function
    private static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if (array[i] < array[pivotIndex]) {
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);
        return swapIndex;
    }

    // Recursive QuickSort
    private static void quickSortHelper(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = pivot(array, left, right);
            quickSortHelper(array, left, pivotIndex - 1);
            quickSortHelper(array, pivotIndex + 1, right);
        }
    }

    // Public method
    public static void quickSort(int[] array) {
        quickSortHelper(array, 0, array.length - 1);
    }

    // Utility method for printing
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}