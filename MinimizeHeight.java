/*
 * Given an array arr[] denoting heights of N towers and a positive integer K.

For each tower, you must perform exactly one of the following operations exactly once.

Increase the height of the tower by K
Decrease the height of the tower by K
Find out the minimum possible difference between the height of the shortest and tallest towers after you have modified each tower.

You can find a slight modification of the problem here.
Note: It is compulsory to increase or decrease the height by K for each tower. After the operation, the resultant array should not contain any negative integers.
 */

import java.util.Arrays;

public class MinimizeHeight {
    class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
       int min,max;
       Arrays.sort(arr);
       int diff=arr[n-1]-arr[0];
       for(int i=1;i<n;i++){
           if(arr[i]-k<0){
               continue;
           }
           max=Math.max(arr[i-1]+k,arr[n-1]-k);
           min=Math.min(arr[0]+k,arr[i]-k);
           
           diff=Math.min(diff,max-min);
       }
       return diff;
       
    }
}
}
