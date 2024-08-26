public class DuplicateNum287 {
    /*
     * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.
     */

     class Solution {
        public int findDuplicate(int[] nums) {
           int slow = nums[0];
            int fast = nums[0];
    
            // Find the intersection point of the two pointers
            do {
                slow = nums[slow];
                fast = nums[nums[fast]];
            } while (slow != fast);
    
            // Find the entrance of the cycle
            slow = nums[0];
            while (slow != fast) {
                slow = nums[slow];
                fast = nums[fast];
            }
    
            return slow;
        }
    }
    
}
