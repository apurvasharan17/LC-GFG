public class LongestPalindromicSubstring {
    class Solution {
        public String longestPalindrome(String s) {
            if (s == null || s.length() < 1) return "";
    
            String str = "";
            int maxlen = 0;
    
            for (int i = 0; i < s.length(); i++) {
                // Check for odd-length palindromes
                
                int l = i;
                int r = i;
                while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                    if ((r - l + 1) > maxlen) {
                        maxlen = r - l + 1;
                        str = s.substring(l, r + 1);
                    }
                    l--;
                    r++;
                }
                
            
                // Check for even-length palindromes
                 l = i;
                 r = i + 1;
                while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                    if ((r - l + 1) > maxlen) {
                        maxlen = r - l + 1;
                        str = s.substring(l, r + 1);
                    }
                    l--;
                    r++;
                }
            }
    
            return str;
        }
    }
    
}
