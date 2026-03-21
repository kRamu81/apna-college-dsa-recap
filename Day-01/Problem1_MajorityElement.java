class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        for(int val : nums){
            int count = 0;
            for(int num : nums){
                if(val==num){
                    count++;
                }
            }
            if(count>n/2) return val;
        }
        return -1;
    }
}