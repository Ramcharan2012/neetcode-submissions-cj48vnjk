class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefixPro[]= new int[nums.length];
         int suffixPro[]= new int[nums.length];
         int k=nums.length-1;
         int product =1;
          int kproduct =1;
          int resArr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            product=product*nums[i];
            prefixPro[i]=product;
            kproduct=kproduct*nums[k];
            suffixPro[k--]=kproduct;
        }
        for(int i=0;i<nums.length;i++){
             int prod=1;
            if(i==0){
                prod= suffixPro[i+1];
            }
            else if(i==nums.length-1){
                prod=prefixPro[i-1];
            }
            else{
                prod=prefixPro[i-1]*suffixPro[i+1];
            }
            
            resArr[i]=prod;
        }
        return resArr;
    }
}