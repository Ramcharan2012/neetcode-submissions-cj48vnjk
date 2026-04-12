class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer,Integer> resMap=new HashMap<>();
      List<Integer>[] resArray=new List[nums.length+1];
     
         for(int n:nums){
            resMap.put(n,resMap.getOrDefault(n, 0)+1);
         }
         
         for(Integer n: resMap.keySet()){
            int frequency=resMap.get(n);
            if(resArray[frequency]==null){
                resArray[frequency]=new ArrayList<>();
            }
            resArray[frequency].add(n);
         }
          int[] finalArray=new int[k];
        int count=0;
         for(int i=resArray.length-1;i>=0 && count<k;i--){
            if(resArray[i]!=null){
            for(int n: resArray[i]){
                 finalArray[count++]=n;
            }
            }
           
         }
         return finalArray;
    }
}
