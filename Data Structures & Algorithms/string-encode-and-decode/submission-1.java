class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            int len = str.length();
            sb.append(len);
            sb.append('#');
            sb.append(str);
        }
        String key = sb.toString();
        return key;
    }

    public List<String> decode(String str) {
        ArrayList<String> result = new ArrayList<>();
        int i = 0 ; 
        while(i < str.length()){
            int j = str.indexOf('#',i);
            int len = Integer.parseInt(str.substring(i,j));
            String s = str.substring(j+1,j+1+len);
            result.add(s);
            i = j + 1 + len;
        }
        return result;
    }
}
