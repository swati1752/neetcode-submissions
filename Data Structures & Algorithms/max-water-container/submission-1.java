class Solution {
    public int maxArea(int[] heights) {
        if( heights.length < 1) return 0;
        int i=0, j=heights.length-1;
        int maxA = 0;
        while(i < j){
            if( heights[i] == 0) i++;
            if( heights[j] == 0) j--;
            int pro = Math.min(heights[i],heights[j]) * Math.abs(j-i);
            if( heights[i] > heights[j]) j--;
            else i++;
            maxA = Math.max(maxA,pro);
        }
        return maxA;
    }
}
