class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()){
            return false;
        }

        int[] arr = new int[26];

        // Store frequency of s1
        for(int i = 0; i < s1.length(); i++){
            arr[s1.charAt(i) - 'a']++;
        }

        int left = 0;

        for(int right = 0; right < s2.length(); right++){

            // Decrease frequency of current character
            arr[s2.charAt(right) - 'a']--;

            // Maintain window size equal to s1.length()
            if(right - left + 1 > s1.length()){
                arr[s2.charAt(left) - 'a']++;
                left++;
            }

            // Check whether all frequencies are zero
            if(right - left + 1 == s1.length()){

                boolean match = true;

                for(int i = 0; i < 26; i++){
                    if(arr[i] != 0){
                        match = false;
                        break;
                    }
                }

                if(match){
                    return true;
                }
            }
        }

        return false;
    }
}