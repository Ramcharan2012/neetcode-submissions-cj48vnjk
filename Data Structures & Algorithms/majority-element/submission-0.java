class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> resMap=new HashMap<>();
        for(int n:nums){
            resMap.put(n, resMap.getOrDefault(n, 0)+1);
        }
        for(int n:resMap.keySet()){
            if(resMap.get(n)>nums.length/2){
                return n;
            }
        }
        return 0;
    }
}