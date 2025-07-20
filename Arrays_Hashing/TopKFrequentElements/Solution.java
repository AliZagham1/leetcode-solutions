package Arrays_Hashing.TopKFrequentElements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;


class Solution {
public int[] topKFrequentElements(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();  // key: number, value: frequency
    for (int num : nums) {
        map.put(num, map.getOrDefault(num,0)+1); // increment the frequency of the number
    }

    PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(  // min heap
        (a, b) -> a.getValue() - b.getValue()  
    );

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {  // iterate through the map
        minHeap.add(entry);  // add each entry to the min heap
        if (minHeap.size() > k) {
            minHeap.poll();
        }
    }

    ArrayList<Integer> results = new ArrayList<>();   // list to store the results
    while (!minHeap.isEmpty()) {
        results.add(minHeap.poll().getKey());   // add the number to the list
    }

    int[] array = new int[results.size()];  // array to store the results
    for (int i = 0; i < results.size(); i++) {
        array[i] = results.get(i);  // add the number to the array
    }

    return array;   // return the array
}

}
