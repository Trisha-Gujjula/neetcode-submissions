class Solution {
    public boolean isPalindrome(String s) {
        int right= s.length()-1;
        int left =0;
        while(left<=right){

            char leftChar = s.charAt(left);
            if ((leftChar < 'a' || leftChar > 'z') && (leftChar < '0' || leftChar > '9')) {
                if (leftChar >= 'A' && leftChar <= 'Z') {
                    leftChar += 32;
                } else {
                    left += 1;
                    continue;
                }
            }

            char rightChar = s.charAt(right);
            if ((rightChar < 'a' || rightChar > 'z') && (rightChar < '0' || rightChar > '9')) {
                if (rightChar >= 'A' && rightChar <= 'Z') {
                    rightChar += 32;
                } else {
                    right -= 1;
                    continue;
                }
            }



            if(leftChar != rightChar){
                return false ;
            }
            left ++;
            right --;
        }
        return true ;
    }
}