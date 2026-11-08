class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false ;
        }
        int chararray[]= new int[26];
        for(int i=0;i<s.length();i++){
            chararray[s.charAt(i)-'a']++;
        }
        for(int i=0 ;i<t.length();i++){
            chararray[t.charAt(i)-'a']--;
        }
        int i=0;
        while(i<26){
            if(chararray[i]!=0){
                return false ;
            }
            i++;
        }
        return true ;
    }
}
