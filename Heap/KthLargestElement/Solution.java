package Heap.KthLargestElement;
import java.util.*;

public class Solution {
  public static int findKthLargest(int[] nums, int k) {
      PriorityQueue<Integer> maxHeap = new PriorityQueue<>(); // max heap
      for (int num : nums) { // iterate through the array
          maxHeap.add(num);   // add each element to the max heap
          if (maxHeap.size() > k) {  // if the size of the max heap is greater than k
              maxHeap.poll();  // remove the smallest element
          }
      }
      return maxHeap.peek();  // return the kth largest element
  } 


    
}
