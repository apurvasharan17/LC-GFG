import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UncommonWordsFromTwoSentences {
    class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
       String[] str1=s1.split(" ");
        String []str2=s2.split(" ");
        List<String> s = new ArrayList<>();
        HashMap<String,Integer> hm=new HashMap<>();
        for(String str:str1){
            if(!hm.containsKey(str)){
                hm.put(str,1);
            }else{
                hm.put(str,hm.get(str)+1);
            }
        }
        for(String str:str2){
            if(!hm.containsKey(str)){
                hm.put(str,1);
            }else{
                hm.put(str,hm.get(str)+1);
            }
        }
        List<String> l=new ArrayList<>();
        for(String key:hm.keySet()){
            if(hm.get(key)==1){
                l.add(key);
            }
        }
    
    String[] stri=new String[l.size()];
    for(int i=0;i<l.size();i++){
        stri[i]=l.get(i);
    }
    return stri;
    }
}
}
