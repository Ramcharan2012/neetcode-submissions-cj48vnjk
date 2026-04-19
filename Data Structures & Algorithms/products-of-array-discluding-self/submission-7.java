class Solution {
    public int[] productExceptSelf(int[] nums) {
        int resArr[] = new int[nums.length];
        resArr[0] = 1;
        int product = 1;
        for (int i = 1; i < nums.length; i++) {
            product = resArr[i - 1] * nums[i-1];
            resArr[i] = product;
        }
        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            resArr[i] = suffix * resArr[i];
            suffix *= nums[i];
        }
        return resArr;
    }
}
