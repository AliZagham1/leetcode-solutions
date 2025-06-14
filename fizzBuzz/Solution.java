package fizzBuzz;

public class Solution {
    public void FizzBuzz(int n) {
        for (int i = 1; i <= n; i++) { // Loop from 1 to n
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz"); // Print "FizzBuzz"
            } else if (i % 3 == 0) {
                System.out.println("Fizz"); // Print "Fizz"
            } else if (i % 5 == 0) {
                System.out.println("Buzz"); // Print "Buzz"
            } else {
                System.out.println(i); // Print the number
            }
        }
    }
}
