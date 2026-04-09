class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int k=0;
        int [] newArr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            product=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                product=product*nums[j];    
                }
            }
            newArr[k++]=product;
        }
        return newArr;
    }
}  
