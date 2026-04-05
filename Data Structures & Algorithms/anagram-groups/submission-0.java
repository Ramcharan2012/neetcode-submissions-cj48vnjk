class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
HashMap<String ,List<String>> freqMap=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String str1=strs[i];
           char [] strCh= str1.toCharArray();
            char ch []=new char[26];
            for(int j=0;j<strCh.length;j++){
              ch[strCh[j]-'a']++;
            }
            StringBuilder strBd=new StringBuilder();
            for(int k=0;k<ch.length;k++){
                strBd.append('#');
                strBd.append(ch[k]);
            }
             String key = strBd.toString();

            if (!freqMap.containsKey(key)) {
                freqMap.put(key, new ArrayList<>());
            }

            freqMap.get(key).add(str1);
        }
         return new ArrayList<>(freqMap.values());
    }
}
