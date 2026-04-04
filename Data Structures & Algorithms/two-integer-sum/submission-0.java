class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> resMap=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int j=target-nums[i];
            if(resMap.containsKey(j)){
                int k=resMap.get(j);
            return new int[] {k,i};
            }
            resMap.put(nums[i],i);
        }
        return null;
    }
}
