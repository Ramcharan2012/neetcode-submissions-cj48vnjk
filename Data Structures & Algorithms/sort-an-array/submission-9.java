class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;

    }
     public static void quickSort(int[] nums,int l,int h) {
        if(l<h){
            int loc=partition(nums,l,h);
            quickSort(nums,l,loc-1);
            quickSort(nums,loc+1,h);
        }
    }

     public static int  partition(int[] nums,int l,int h) {
        int pivot=nums[l];
        int start=l+1;
        int end=h;
        while(start<=end){
        while(start <= h&&nums[start]<=pivot){
            start++;
        }
        while(end>=l&&nums[end]>pivot){
            end--;
        }
        if(start<end){
            swap(nums,start,end);
        }
     }
        swap(nums,l,end);
        return end;

    }

     public static void swap(int[] nums,int i,int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}