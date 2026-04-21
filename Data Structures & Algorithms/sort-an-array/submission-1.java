class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            boolean swap=false;
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                    swap=true;
                }
            }
            if(!swap)
                return nums;

        }
        return nums;
    }
}