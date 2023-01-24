public class TrappingRainWater {
    public static int getWaterUnits(int[] heights) {
        int n = heights.length;
        int[] LMax = new int[n];
        int[] RMax = new int[n];
        LMax[0] = heights[0];
        RMax[n-1] = heights[n-1];

        for (int i = 1; i < n ; i++) {
            LMax[i] = Math.max(LMax[i-1], heights[i]);
        }

        for (int i = n-2; i >= 0 ; i++) {
            RMax[i] = Math.max(RMax[i+1], heights[i]);
        }

        int waterUnits = 0;
        for(int i = 0; i < n ; i++) {
            waterUnits += Math.min(LMax[i], RMax[i]) - heights[i];
        }
        return waterUnits;
    }
    public static void main(String[] args) {
        int[] heights = {6,4,3,8};
        System.out.println(getWaterUnits(heights));
    }
}
