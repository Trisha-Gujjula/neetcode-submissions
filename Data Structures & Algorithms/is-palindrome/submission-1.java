class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        int start = 0;
        sb.append(s.toLowerCase());

        char[] ch = new char[s.length()];
        int index =0;
        for(int i=0;i<sb.length();i++){
            if(Character.isLetterOrDigit(sb.charAt(i))){
                ch[index]=sb.charAt(i);
                index ++;
            }
            
        }
        int end= index-1;
        while(start<=end){
            if(ch[start]!=ch[end]){
                return false ;
            }
            start ++;
            end --;
        }
        return true ;
    }
}
