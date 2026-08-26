class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> seen = new HashMap<>();
        for(int i : nums){
            if(seen.containsKey(i)){
                int n = seen.get(i);
                seen.put(i, n +1);
            }
            else{
                seen.put(i,0);
            }
        }
        ArrayList<Integer> count = new ArrayList<>();
        for(int i : seen.keySet()){
            count.add(i);
        }
        Collections.sort(count, (a, b) -> seen.get(b) - seen.get(a));
        int[] result = new int[k];
        for(int i = 0 ; i < k ;i++){
            result[i] = count.get(i);
        }
        return result;
    }
}
