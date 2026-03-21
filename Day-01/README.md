# Day 01 – DSA Recap

Problems Solved: **5**

---

## Problem 1 – Majority Element

### Problem
Find the element that appears more than ⌊n/2⌋ times in the array.

### Approach
- Traverse each element.
- Count how many times it appears.
- If count > n/2 return that element.

### Time Complexity
O(n²)

### Space Complexity
O(1)

### Java Solution

```java
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        for(int val : nums){
            int count = 0;

            for(int num : nums){
                if(val == num){
                    count++;
                }
            }

            if(count > n/2){
                return val;
            }
        }

        return -1;
    }
}
```

---

## Problem 2
Description and approach.

---

## Problem 3
Description and approach.

---

## Problem 4
Description and approach.

---

## Problem 5
Description and approach.

---

⭐ Day 01 completed – 5 problems solved.