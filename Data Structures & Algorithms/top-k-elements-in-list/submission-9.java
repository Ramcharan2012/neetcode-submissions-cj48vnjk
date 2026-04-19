class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> resMap=new HashMap<>();
        List<Integer> freqBuck[]=new List[nums.length+1];

        for(int num : nums){
            resMap.put(num,resMap.getOrDefault(num, 0)+1);
        }
        for(Integer key:resMap.keySet()){
            if( freqBuck[resMap.get(key)]==null){
                freqBuck[resMap.get(key)]=new ArrayList<>();
            }
                freqBuck[resMap.get(key)].add(key);
        }
        int [] resArr=new int[k];
        int c=0;
        for(int i=freqBuck.length-1;i>=0 && c<k;i-- ){
              if(freqBuck[i]!=null){
            for(int n: freqBuck[i]){
                 resArr[c++]=n;
            }
              }
        }
        return resArr;
        
    }
}
