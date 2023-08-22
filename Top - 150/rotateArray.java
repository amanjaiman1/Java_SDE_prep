public class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int temp[] = new int[n];

        // Copy the original array into temp
        for (int i = 0; i < n; i++) {
        temp[i] = nums[i];
        }

// Rotate the array using temp
        for (int i = 0; i < n; i++) {
        nums[(i + k) % n] = temp[i];
        }

    }
}
