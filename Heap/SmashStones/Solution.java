package Heap.SmashStones;
import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {  // Returns the last stone's weight
        PriorityQueue <Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());  // max heap
        for (int num : stones) {   // iterate through the array
            maxHeap.offer(num);    // add each element to the max heap
        }

        while (maxHeap.size() > 1) {    // while the size of the max heap is greater than 1
            int y = maxHeap.poll();      // remove the largest element
            int x = maxHeap.poll();       // remove the second largest element
            if (x != y) {
                maxHeap.offer(y-x);         // add the difference to the max heap
            }
        }

        return maxHeap.peek();               // return the last stone's weight
    }
}