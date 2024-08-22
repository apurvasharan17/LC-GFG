public class rotateby1 {
    //Given an array arr, rotate the array by one position in clock-wise direction.
    class Solution {
        public void rotate(int[] arr) {
            // code here
            int lastElement = arr[arr.length - 1];  // Store the last element
    
            // Shift all elements to the right by one position
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0]=lastElement;
        }
    }
}
