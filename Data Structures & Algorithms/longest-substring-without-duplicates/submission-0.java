class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> resSet = new HashSet<>();
        int maxCount = 0, j=0;
        for (int i = 0; i < s.length(); i++) {
           while(resSet.contains(s.charAt(i)))
           {
            resSet.remove(s.charAt(j));
            j++;
           }
           resSet.add(s.charAt(i));
           maxCount=Math.max(maxCount,i-j+1);
        }
        return maxCount;
    }
}
