class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer>map = new HashMap<>();
         if( s.length() == 0) return 0;
        int maxC = 1,c=0;
        int i=0,j=0;
        while( j < s.length()){
            if(map.containsKey(s.charAt(j)) && map.get(s.charAt(j)) >= i ){
                i = map.get(s.charAt(j)) + 1;
            }
            map.put(s.charAt(j),j);
            c = j-i+1;
            maxC = Math.max(maxC,c);
            j++;
        }
        return maxC;
    }
}
