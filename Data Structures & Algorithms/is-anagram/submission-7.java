class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>seen = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(char ch : s.toCharArray()){
            if(seen.containsKey(ch)){
                seen.put(ch,seen.get(ch)+1);
            }
            else{
                seen.put(ch,1);
            }
        }
        for(char ch : t.toCharArray()){
            if(!seen.containsKey(ch)){
                return false;
            }
            else{
                seen.put(ch ,seen.get(ch)-1);
            }
        }
        for(int c : seen.values()){
            if(c > 0){
                return false;
            }
        }
        return true;
    }
}
