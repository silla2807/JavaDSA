import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    // Function to compute the maximum area
    public static int maxArea(int[] height) {
        int maxArea = 0; // To store the maximum area found
        ArrayList<Integer> max = new ArrayList<>();

        for(int i = 0; i < height.length; i++) {
            for(int j = i + 1; j < height.length; j++) {
                int minHeight = Math.min(height[i], height[j]);
                maxArea = Math.max(maxArea, minHeight * (j - i));
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {1, 8, 9}; // Example input heights
        int result = maxArea(heights);
        System.out.println("Maximum area: " + result);
    }
}
