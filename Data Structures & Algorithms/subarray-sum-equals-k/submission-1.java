class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> resMap = new HashMap<>();
        resMap.put(0, 1);
        int sum = 0,count=0;
        for (int n : nums) {
            sum = sum + n;
            if (resMap.containsKey(sum - k)) {
                count+=resMap.get(sum-k);
            }
            resMap.put(sum,resMap.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}