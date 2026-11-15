// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int left =0;
//         int right = numbers.length-1;
//         while(left<=right){
//             int currentsum = numbers[left]+numbers[right];
//             if(currentsum == target){
//                 return new int[]{left+1,right+1};
//             }else if(currentsum > target){
//                 right --;
//             }else{
//                 left ++;
//             }
//         }
//         return new int[]{-1,-1};
//     }
// }


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap< Integer,Integer> hasm = new HashMap();
        for(int i=0;i<nums.length;i++){
            int compliment = target - nums[i];
            if(hasm.containsKey(compliment)){
                return new int[]{hasm.get(compliment)+1,i+1};
            }
            hasm.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
