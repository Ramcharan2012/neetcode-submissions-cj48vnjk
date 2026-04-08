class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int left = 0;
int right = numbers.length - 1;

while (left < right) {
    int currentSum = numbers[left] + numbers[right];
    if (currentSum == target) {
        return new int[]{left+1,right+1};
    } else if (currentSum < target) {
        // Need a larger sum
        left++;
    } else {
        // Need a smaller sum
        right--;
    }
}
        return new int[]{};
    }
}
