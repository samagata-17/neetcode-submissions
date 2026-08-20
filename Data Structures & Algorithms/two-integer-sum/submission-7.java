class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>seen = new HashMap<>();
        int[] l = new int[2];
        for(int i = 0 ; i < nums.length;i++){
            int r = target - nums[i];
            if(seen.containsKey(r)){
                l[1] = i;
                l[0] = seen.get(r);
                return l;
            }
            seen.put(nums[i],i);
        }
        return l;
    }
}
