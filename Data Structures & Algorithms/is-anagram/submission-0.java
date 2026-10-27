class Solution {
    public boolean isAnagram(String s, String t) {
        int [] charArray = new int[26];
        int sLen = s.length() , tLen = t.length();
        if(sLen != tLen) return false;
        s = s.toLowerCase();
        t = t.toLowerCase();
        for(int i=0; i<sLen ; i++)charArray[s.charAt(i)-'a']++;
        for(int i=0; i<tLen ; i++)charArray[t.charAt(i)-'a']--;

        for(int i=0 ; i<26 ; i++){
            if(charArray[i] != 0) return false;
        }
            return true;
    }
}
