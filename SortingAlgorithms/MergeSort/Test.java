package SortingAlgorithms.MergeSort;

class Test{

public static void main(String[] args) {
    int arr[] = {12, 11, 13, 5, 6, 7};

    Solution solution = new Solution();

    System.out.println("Given Array:");
    solution.printArray(arr);

    solution.sort(arr, 0, arr.length - 1);

    System.out.println("\nSorted Array:");
    solution.printArray(arr);
}
}
    

