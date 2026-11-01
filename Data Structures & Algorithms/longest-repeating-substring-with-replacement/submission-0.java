class Solution {
    public int characterReplacement(String s, int k) {
        int i=0;
        int[] count = new int[26];
        int maxFreq = 0, maxLen = 0;
        for(int j=0; j < s.length(); j++){
           int currLen = j-i+1;
           count[s.charAt(j)-'A']++;
           maxFreq = Math.max(maxFreq, count[s.charAt(j)-'A']);

           if(currLen - maxFreq > k){
            count[s.charAt(i)-'A']--;
            i++;
           }

           maxLen = Math.max(maxLen,j-i+1);
        }
        return maxLen;
    }
}
