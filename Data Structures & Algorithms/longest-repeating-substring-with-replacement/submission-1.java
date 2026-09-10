class Solution {
    public int characterReplacement(String s, int k) {
        int[] seen = new int[26];
        int left = 0;
        int maxfreq = 0;
        int maxlen = 0;
        for(int right = 0 ; right < s.length(); right++){
            seen[s.charAt(right)-'A']++;
            maxfreq = Math.max(maxfreq,seen[s.charAt(right) - 'A']);
            while((right - left + 1) - maxfreq > k){
                seen[s.charAt(left) - 'A']--;
                left++;
            }
            maxlen = Math.max(maxlen , right - left + 1);
        }
        return maxlen;        
    }
}
