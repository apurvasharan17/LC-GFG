import java.util.*;
class Solution {
    int thirdLargest(int arr[]) {
        // Your code here
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : arr){
            pq.add(i);
        }
        for(int i=0;i<2;i++){
            pq.remove();
        }
        if(pq.isEmpty()){
            return -1;
        }
        
        return pq.peek();
    }
}
