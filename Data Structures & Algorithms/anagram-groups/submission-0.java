class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List>seen = new HashMap<>();
        for(String s : strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i : count){
                sb.append(i);
                sb.append('#');
            }
            String key = sb.toString();
            if(!seen.containsKey(key)){
                seen.put(key, new ArrayList<String>());
            }
            seen.get(key).add(s);
        }
        return new ArrayList(seen.values());
    }
}
