class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap< Integer,Integer> hasm = new HashMap();
        for(int i=0;i<nums.length;i++){
            int compliment = target - nums[i];
            if(hasm.containsKey(compliment)){
                return new int[]{hasm.get(compliment),i};
            }
            hasm.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
