/*
 * Given an array arr[] of size n of non-negative integers. Each array element represents the maximum length of the jumps that can be made forward from that element. This means if arr[i] = x, then we can jump any distance y such that y ≤ x.
Find the minimum number of jumps to reach the end of the array starting from the first element. If an element is 0, then you cannot move through that element.
Note:  Return -1 if you can't reach the end of the array.
 */

public class MinimumJump {
    class Solution {
        static int minJumps(int[] arr, int n) {
            if (n <= 1) return 0; // No jumps needed if there's only one element
            if (arr[0] == 0) return -1; // Can't move anywhere if the first element is 0
    
            int jump = 0;
            int pos = 0;
            int des = 0;
    
            for (int i = 0; i < n - 1; i++) {
                des = Math.max(des, arr[i] + i);
    //arr[i]+i is why we are doing is that uss index se kitna aage jump krr skte hai 
                if (pos == i) {
                    pos = des;
                    jump++;
    
                    // If we reach or exceed the last index, return the number of jumps
                    if (pos >= n - 1) {
                        return jump;
                    }
                }
    
                // If we can't move further from the current position
                if (pos <= i) {
                    return -1;
                }
            }
    
            return -1; // In case we exit the loop without reaching the last index
        }
    }
}
