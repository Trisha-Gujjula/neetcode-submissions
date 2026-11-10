class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count =0;
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i], 0) + 1);
        }
        Integer arr[] = hm.keySet().toArray(new Integer[0]);
        Arrays.sort(arr, (a, b) -> hm.get(b) - hm.get(a));

        int ans[] =new int[k];
        for(int i=0;i<k;i++){
            ans[i]=arr[i];
        }
        return  ans ;
    }
}
