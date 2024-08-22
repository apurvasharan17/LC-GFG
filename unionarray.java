import java.util.HashSet;

public class unionarray {
    //Union of two arrays

    class Solution {
    public static int doUnion(int arr1[], int arr2[]) {
        // Your code here
        HashSet<Integer> hs=new HashSet<>();
        for(int i : arr1){
            hs.add(i);
        }
        for(int i : arr2){
            hs.add(i);
        }
        return hs.size();
    }
}
}
