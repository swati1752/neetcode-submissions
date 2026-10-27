class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer>s = new HashSet<>();
        boolean duplicateKey = false;
        for(int i=0; i<nums.length ; i++){
            if(s.contains(nums[i])){
                duplicateKey = true;
                break;
            }
            s.add(nums[i]);
        }
        return duplicateKey;
    }
}