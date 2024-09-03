public class GetLucky {
    class Solution {
        public int getLucky(String s, int k) {
            // Convert the string to the corresponding number string
            String charRes = "";
            for (int i = 0; i < s.length(); i++) {
                charRes += (s.charAt(i) - 'a' + 1);  // +1 to map 'a' to 1, 'b' to 2, etc.
            }
    



            // Convert the resulting string to an integer
            int res = 0;
            for (char c : charRes.toCharArray()) {
                res += c - '0';  // Convert each character to an integer and sum them
            }
            //OR
            int res2=Integer.parseInt(charRes);
    


            // Repeat the process k-1 times
            
            for (int n = 1; n < k; n++) {
                int sum = 0;
                while (res > 0) {
                    sum += res % 10;
                    res /= 10;
                }
                res = sum;  // Update res with the sum of its digits
            }
    
            return res;
        }
    }
    
}
