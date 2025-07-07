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


    
}
