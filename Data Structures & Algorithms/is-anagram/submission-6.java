class Solution {
    public boolean isAnagram(String s, String t) {
        int[] seen = new int[26];
        if(t.length() != s.length()){
            return false;
        }
        for(int i = 0 ; i < s.length() ; i++){
            seen[t.charAt(i) - 'a']++;
            seen[s.charAt(i) - 'a']--;
        }
        for(int i = 0 ;i < 26 ;i++){
            if(seen[i] != 0){
                return false;
            }
        }
        return true;
    }
}
