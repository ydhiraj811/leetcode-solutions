class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int h = height[left] < height[right]
                    ? height[left]
                    : height[right];
            int area = h * (right - left);
            if (area > max) {
                max = area;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}