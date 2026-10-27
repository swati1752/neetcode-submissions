class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map1 = new HashMap<>();
        int []ans = new int[2];
        for(int i=0;i < nums.length ; i++){
            if(map1.get(target - nums[i]) != null)
                return new int[] {map1.get(target - nums[i]),i};
            map1.put(nums[i],i);
        }
        return new int[] {};
    }
}
