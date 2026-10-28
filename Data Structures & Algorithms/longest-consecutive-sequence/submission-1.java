class Solution {
    public int longestConsecutive(int[] nums) {
        if( nums.length <= 0) return 0;
        Set<Integer> sArr = new HashSet<>();
        int count = 1, maxCount = Integer.MIN_VALUE;
        for(int i=0; i<nums.length ; i++){
            sArr.add(nums[i]);
        }
        for(int i : sArr){
            if(sArr.contains(i-1)) continue;
                int nextNum = i+1;
                count = 1;
                while(sArr.contains(nextNum++)){
                    count++;
                }
            maxCount = Math.max(count,maxCount);
        }
        return maxCount;
    }
}
