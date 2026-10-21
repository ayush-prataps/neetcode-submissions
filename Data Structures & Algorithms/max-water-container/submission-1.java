class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int area = 0;
        int left = 0; 
        int right = n-1;

        while(left<right){
            int level = Math.min(heights[left], heights[right]);
            int width = right - left;
            int currentArea = level * width;
            area = Math.max(area, currentArea);
            
            if(heights[left] < heights[right]) left++; 
            else right--; 
        }

        return area;
    }
}
