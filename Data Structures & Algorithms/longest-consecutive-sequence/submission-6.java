class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> resSet=new HashSet<>();
        for(int n:nums){
            resSet.add(n);
        }
        int longest=0;
        for(int s:resSet){
            if(!resSet.contains(s-1)){
                 int current = s;
                int cont = 1;
                while(resSet.contains(current + 1)){
                    current++;
                    cont++;
                }
            longest=Math.max(longest,cont);

            }
        }
        return longest;
    }
}
