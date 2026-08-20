class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer>seen=new HashMap<>();
        for(int num : nums){
            if(seen.containsKey(num)){
                seen.put(num , seen.get(num)+1);
            }
            else{
                seen.put(num,1);
            }
        }
        for(int num : nums){
            if(seen.get(num) > 1){
                return true;
            }
        }
        return false;
    }
}