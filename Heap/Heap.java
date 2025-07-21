package Heap;
import java.util.*;

public class Heap {
    private List<Integer> heap;  // List to store the heap

    public Heap() {
        this.heap = new ArrayList<>();  // Initialize the heap as an empty list
    }

    public List<Integer> getHeap() {
        return new ArrayList<>(heap);  // Return a copy of the heap as a list
    }

    private int leftChild(int index) { // Returns the index of the left child
        return 2 * index + 1;          
    }

    private int rightChild(int index) {  // Returns the index of the right child
        return 2 * index + 2;
    }

    private int parent(int index) {  // Returns the index of the parent
        return (index - 1) / 2;
    }

    public void swap (int index1, int index2) {  // Swaps the values at the given indices
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value) {   // Inserts a value into the heap
        heap.add(value);
        int currentIndex = heap.size() - 1;
        while (currentIndex > 0 && heap.get(currentIndex) > heap.get(parent(currentIndex))) {
            swap(currentIndex, parent(currentIndex));
            currentIndex = parent(currentIndex);
        }
    }

    public Integer remove() {
        if (heap.size() == 0){
            return null;
        }

        if (heap.size() == 1) {
            return heap.remove(0);
        }

        int maxValue = heap.get(0);
        heap.set(0, heap.remove(heap.size()-1));
        sinkDown(0);
        return maxValue;
    }

    public void sinkDown(int index) { // Sink down the value at the given index
        int maxIndex = index;   // Initialize maxIndex to the current index
        while (true){
        int leftIndex = leftChild(index); // Get the index of the left child
        int rightIndex = rightChild(index);  // Get the index of the right child
        if (leftIndex < heap.size()  && heap.get(leftIndex) > heap.get(maxIndex)) {  // If the left child exists and is greater than the current max
            maxIndex = leftIndex;  // Set maxIndex to the index of the left child
        }
        if (rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)) {  // If the right child exists and is greater than the current max
            maxIndex = rightIndex;  // Set maxIndex to the index of the right child
        }

        if (maxIndex != index) {  // If maxIndex is not the current index
            swap(index, maxIndex);  // Swap the values at the current index and maxIndex
            index = maxIndex;  // Set index to maxIndex
        } else {
            return;  // Return if no swaps were made
        }

    }



    }

    




    
}
