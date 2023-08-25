Basic Brute force - Nested Loops checking for the duplicate element
                   if( nums[i] == nums[j+1] )
                      return true

Time Complexity = O(N^2)

2nd Brute - O(nlogn)

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
}



