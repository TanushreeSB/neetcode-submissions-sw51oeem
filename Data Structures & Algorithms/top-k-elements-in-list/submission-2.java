class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        HashMap<Integer,Integer>mp = new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

        List<Integer>list = new ArrayList<>(mp.keySet());
        list.sort((a,b) -> mp.get(b) - mp.get(a));

        int[] result = new int[k];

        for(int i=0;i<k;i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
