class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length - 1, maxArea = 0;
        while (i < j) {
            int height = Math.min(heights[i], heights[j]);
            int width = j - i;
            maxArea = Math.max(maxArea, height * width);
            if (heights[i] > heights[j])
                j--;
            else
                i++;
        }
        return maxArea;
    }
}
