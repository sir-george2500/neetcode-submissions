class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;

        int left = 0;
        int right = n - 1;

        int currentArea = 0; 
        int maxArea = 0;

        int height = 0;

        while(left < right){
            int width = right - left;

            height = Math.min(heights[left], heights[right]);

            currentArea = width * height;

            maxArea = Math.max(currentArea, maxArea);

            if(heights[left] < heights[right])
                left++;
            else
                right--;
        }

        return maxArea;
    }
}
