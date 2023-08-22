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

Time complexity - O(n)
space  - O(n)


    

Optimal - 

public class Solution {
    public static void reverse(int nums[], int start, int end){
    // While start index is less than end index
    while(start < end){
        // Swap elements at start and end indices
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        // Increment start index and decrement end index
        start++;
        end--;
    }
}

    public void rotate(int[] nums, int k) {
        // Ensure k is within array bounds
        k %= nums.length;
        // Reverse entire array
        reverse(nums, 0, nums.length - 1);
        // Reverse first k elements
        reverse(nums, 0, k - 1);
        // Reverse remaining elements
        reverse(nums, k, nums.length - 1);
    }
}
