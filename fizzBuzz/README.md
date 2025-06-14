# LeetCode Problem: Fizz Buzz

## Problem No: 412

### 🔹 Problem Description:
Write a program that outputs the string representation of numbers from 1 to `n`. But for multiples of three, it should output **"Fizz"** instead of the number and for the multiples of five output **"Buzz"**. For numbers which are multiples of both three and five output **"FizzBuzz"**.

---

### 🔸 Example:

#### Input:
n = 5


#### Output:
1
2
Fizz
4
Buzz


### 💡 Approach:
- Loop from 1 to `n`
- Use conditional checks:
  - First check if divisible by both 3 and 5 → print `"FizzBuzz"`
  - Else if divisible by 3 → print `"Fizz"`
  - Else if divisible by 5 → print `"Buzz"`
  - Else → print the number itself

---

### ⏱ Time Complexity:
- **O(n)** — Each number from 1 to `n` is processed once

### 💾 Space Complexity:
- **O(1)** — No additional space used apart from simple variables

---

### 🧠 Notes:
- Make sure to check `i % 3 == 0 && i % 5 == 0` **before** checking individual conditions.
- This is one of the most **famous coding interview warm-up questions** to test basic logic.
