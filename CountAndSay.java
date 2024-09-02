public class CountAndSay {
    
    class Solution {
        public String countAndSay(int n) {
            if(n==1)return "1";
            String say=countAndSay(n-1);
            String res="";
            for(int i=0;i<say.length();i++){
                int count=1;
                char ch=say.charAt(i);
                while(i<say.length()-1 && say.charAt(i)==say.charAt(i+1)){
                    count++;
                    i++;
                }
                res=res+ String.valueOf(count)+  String.valueOf(ch);
            }
    
            return res;
        }
    }
}
