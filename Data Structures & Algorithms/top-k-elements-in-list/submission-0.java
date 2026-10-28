class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> map1 = new HashMap<>();
        ArrayList<Integer>[] list1 = new ArrayList[n+1];
        int[] ans = new int[k];
        for(int i=0 ; i<n; i++){
            map1.put(nums[i], map1.getOrDefault(nums[i],0) + 1);
        }
        for (int i = 0; i <=n; i++) {
            list1[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            list1[freq].add(num);
        }
        // for (int i = 0; i <=n; i++) {
        //    for(int j=0; j< list1[i].size() ; j++){
        //     System.out.println("Index "  + i + " values = " + list1[i].get(j));
        //    }
        // }
        int l = 0;
        for(int i=n; i>=0 ; i--){
           if( list1[i].size() > 0 ) {
            for(var t : list1[i]){
                ans[l++] = t;
            }
            if(l == k) break;
           }
        }
        return ans;
    }
}
