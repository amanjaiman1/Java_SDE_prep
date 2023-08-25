Basic Brute force 
Time Complexity = O(N^2)
- Nested Loops checking for the duplicate element
                   if( nums[i] == nums[j+1] )
                      return true



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

By Hashmap
Time complexity = O(N) || Space = O(N)

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i],1);
        }

        return false;
    }
}


