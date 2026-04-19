class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> resSet=new HashSet<>();
        int left=0,maxRes=0;
        for(int i=0;i<s.length();i++){
            while(resSet.contains(s.charAt(i))){
                resSet.remove(s.charAt(left++));
            }
            resSet.add(s.charAt(i));
            maxRes=Math.max(maxRes,i-left+1);
        }
        return maxRes;
    }
}

