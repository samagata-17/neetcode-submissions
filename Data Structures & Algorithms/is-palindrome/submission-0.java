class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char str : s.toCharArray()){
            if(Character.isLetterOrDigit(str))
            sb.append(Character.toLowerCase(str));
        }
        String original = sb.toString();
        String reverse = sb.reverse().toString();

        if(original.equals(reverse)){
            return true;
        }
        return false;
    }
}
