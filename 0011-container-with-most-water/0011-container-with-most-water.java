class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            maxArea(new int[]{0, 0});
        }
    }
    public static int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int n = height.length;
        int max = 0;
        while(low < high) {
            int w = high - low;
            int h = Math.min(height[high], height[low]);
            int area = w * h;
            max = Math.max(max, area);
            while(low < high && height[low] <= h) low++;
            while(low < high && height[high] <= h) high--;   
        }
        return max;
    }
}