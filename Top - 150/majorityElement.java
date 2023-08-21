class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < n; i++ ) {
            int count = 0;

            for(int j = 0; j < n; j++) {
                if(nums[j] == nums[i]) {
                    count++;
                }
            }

            if(count > n/2) {
                ans = nums[i];
            }
        }

        return ans;  
    }
}

Time Complexity = 0(n^2)
