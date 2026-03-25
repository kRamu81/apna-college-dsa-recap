# Day 01 -- DSA Recap (Array Part-1)

Problems Solved: **6**

------------------------------------------------------------------------

## 1. Majority Element

### Algorithm

1.  Traverse each element in the array.
2.  Count how many times it appears.
3.  If count \> n/2, return that element.

### Java Code

``` java
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

**Time Complexity:** O(n²)\
**Space Complexity:** O(1)

------------------------------------------------------------------------

## 2. Repeat and Missing Number

### Algorithm

1.  Create a frequency array.
2.  Traverse the grid and count occurrences.
3.  Number with count = 2 → repeated.
4.  Number with count = 0 → missing.

### Java Code

``` java
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;
        int size = n * n;
        int[] count = new int[size + 1];

        for(int[] row : grid){
            for(int num : row){
                count[num]++;
            }
        }

        int repeat = -1, missing = -1;

        for(int i = 1; i <= size; i++){
            if(count[i] == 2) repeat = i;
            if(count[i] == 0) missing = i;
        }

        return new int[]{repeat, missing};
    }
}
```

**Time Complexity:** O(n²)\
**Space Complexity:** O(n²)

------------------------------------------------------------------------

## 3. Merge Two Sorted Arrays (Without Extra Space)

### Algorithm

1.  Start pointers at the end of both arrays.
2.  Compare elements from both arrays.
3.  Place the larger element at the end of nums1.
4.  Continue until nums2 is empty.

### Java Code

``` java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }

        while(j >= 0){
            nums1[k--] = nums2[j--];
        }
    }
}
```

**Time Complexity:** O(m + n)\
**Space Complexity:** O(1)

------------------------------------------------------------------------

## 4. Single Number

### Algorithm

1.  Initialize result = 0.
2.  XOR every element with result.
3.  Duplicate numbers cancel out.
4.  Remaining number is the answer.

### Java Code

``` java
class Solution {
    public int singleNumber(int[] nums) {

        int result = 0;

        for(int num : nums){
            result ^= num;
        }

        return result;
    }
}
```

**Time Complexity:** O(n)\
**Space Complexity:** O(1)

------------------------------------------------------------------------

## 5. Best Time to Buy and Sell Stock

### Algorithm

1.  Keep track of minimum price.
2.  Calculate profit for each day.
3.  Update maximum profit.

### Java Code

``` java
class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++){

            if(prices[i] < minPrice){
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}
```

**Time Complexity:** O(n)\
**Space Complexity:** O(1)

------------------------------------------------------------------------

## 6. Pow(x, n)

### Algorithm

1.  Use binary exponentiation.
2.  If n is negative, convert x = 1/x.
3.  Square the base each step.
4.  Multiply result when exponent is odd.

### Java Code

``` java
class Solution {
    public double myPow(double x, int n) {

        long power = n;
        if(power < 0){
            x = 1 / x;
            power = -power;
        }

        double result = 1;

        while(power > 0){
            if(power % 2 == 1){
                result *= x;
            }

            x *= x;
            power /= 2;
        }

        return result;
    }
}
```

**Time Complexity:** O(log n)\
**Space Complexity:** O(1)

------------------------------------------------------------------------

⭐ **Day 01 Completed -- 6 Problems Solved**
