class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>seen = new HashSet<>();
        int left = 0;
        int maxlen = 0;
        for(int right = 0 ; right < s.length() ; right++){
            while(seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            int len = right - left + 1;
            maxlen = Math.max(maxlen,len);
        }
        return maxlen;
    }
}
