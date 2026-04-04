class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> resSet =new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(resSet.contains(nums[i]))
                return true;
            resSet.add(nums[i]);
        }
        return false;
    }
}