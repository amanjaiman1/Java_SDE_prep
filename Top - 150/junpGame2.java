Not solved at my own #greedy

class Solution {
    public int jump(int[] nums) {
        int curReach = 0;
        int maxReach = 0; 
        int count = 0;
        int n = nums.length;
        for(int i = 0; i < n-1; i++) {
            if(i + nums[i] > maxReach) {
                maxReach = i + nums[i];
            }

            if(i == curReach) {
                count++;
                curReach = maxReach;
            }
        }
        return count;
    }
}

Time complexity = O(n)
