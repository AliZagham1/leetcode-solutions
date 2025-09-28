package Heap.Validheap;

public class Solution {
    public  Boolean validHeap (int[] heap) {
        int n = heap.length;
        for (int i = 0; i < n/2 ; i++) {
            int leftChild = 2 * i + 1;
            int rightChild =  2 * i + 2;
            if (leftChild < n && heap[leftChild]< heap[i]){
                return false;
            }
            if (rightChild < n && heap[rightChild]< heap[i]){
                return false;
            
        }
        }
        
        return true;
        
    }

    
}
