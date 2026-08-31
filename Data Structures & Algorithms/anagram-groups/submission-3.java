class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List> seen = new HashMap<>();
        for(String str : strs){
            int[] map = new int[26];
            for(char ch : str.toCharArray()){
                map[ch - 'a']++;
            }
            StringBuilder sb =  new StringBuilder();
            for(int i : map){
                sb.append('#');
                sb.append(i);
            }
            String key = sb.toString();
            if(!seen.containsKey(key)){
                seen.put(key,new ArrayList<String>());
            }
            seen.get(key).add(str);
        }
        return new ArrayList(seen.values());
    }
}
