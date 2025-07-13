package Heap.KthLargestElement_Stream;
import java.util.PriorityQueue;

// This class implements a KthLargest class that maintains the k-th largest element in a stream of integers.
public class KthLargest {
   private PriorityQueue<Integer> minHeap ;
   private int k;

    public KthLargest(int k, int[] nums) {
       this.k = k;
       minHeap = new PriorityQueue<>();  // min heap
        for (int num : nums) {         // iterate through the array
            minHeap.offer(num);
            if (minHeap.size() > k) {  // if the size of the min heap is greater than k 
                minHeap.poll();        // remove the smallest element
            }
        }

        
    }
    
    public int add(int val) {  // add an element to the stream
       minHeap.offer(val);   // add the element to the min heap

       if (minHeap.size() > k) {   // if the size of the min heap is greater than k
        minHeap.poll();           // remove the smallest element
       }

       return minHeap.peek();   // return the kth largest element
     
        
    }
    

}
