/*
 * 
Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
 */
public class MaxConsecutuveOnesPART3 {
    class Solution {
        public int longestOnes(int[] nums, int k) {
            int maxlen=0;
            int left=0;
            int right=0;
            int zeroes=0;
            while(right<nums.length){
                if(nums[right]==0){
                zeroes++;
                }
                if(zeroes>k){
                    if(nums[left]==0){
                        zeroes--;
                    }
                    left++;
                }
                if(zeroes<=k){
                    maxlen=Math.max(maxlen,right-left+1);
                }
                right++;
            }
            return maxlen;
            }
            
        }
    
}
