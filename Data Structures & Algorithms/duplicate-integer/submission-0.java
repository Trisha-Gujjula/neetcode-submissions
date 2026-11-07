class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet <Integer> has = new HashSet<>();
        for(int i=0;i<nums.length ;i++){
            if(has.contains(nums[i])){
                return true ;
            }
            else{
                has.add(nums[i]);
            }
        }
        return false ;
    }
}