class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int num : nums){
            seen.add(num);
        }
        int longest = 0;
        for(int num : nums){
            if(!seen.contains(num-1)){
                int current = num;
                int len = 1;
                while(seen.contains(current+1)){
                    current++;
                    len++;
                }
                longest = Math.max(longest,len);
            }
        }
        return longest;
    }
}
