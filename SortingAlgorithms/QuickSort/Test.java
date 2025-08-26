package SortingAlgorithms.QuickSort;

public class Test {
    public static void main(String[] args) {
        int[] case1 = {4, 6, 1, 7, 3, 2, 5};
        int[] case2 = {10, 9, 8, 7, 6, 5};
        int[] case3 = {1, 2, 3, 4, 5, 6};
        int[] case4 = {5};
        int[] case5 = {};

        Solution.quickSort(case1);
        Solution.quickSort(case2);
        Solution.quickSort(case3);
        Solution.quickSort(case4);
        Solution.quickSort(case5);

        System.out.println("Sorted Arrays:");
        Solution.printArray(case1); // [1, 2, 3, 4, 5, 6, 7]
        Solution.printArray(case2); // [5, 6, 7, 8, 9, 10]
        Solution.printArray(case3); // [1, 2, 3, 4, 5, 6]
        Solution.printArray(case4); // [5]
        Solution.printArray(case5); // []
    }
}
