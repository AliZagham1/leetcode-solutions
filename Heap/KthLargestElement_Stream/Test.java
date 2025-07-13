package Heap.KthLargestElement_Stream;

public class Test {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        KthLargest kthLargest = new KthLargest(k, nums);
        int result = kthLargest.add(7);
        System.out.println("The " + k + "th largest element is: " + result); // Output: The 2th largest element is: 5
    }
    
}
