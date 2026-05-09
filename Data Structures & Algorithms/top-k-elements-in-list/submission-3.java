class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer,Integer>mp = new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer>pq = new PriorityQueue<>(
            (a,b) -> mp.get(b) - mp.get(a)
        );
        
        

        pq.addAll(mp.keySet());
        
        int[] result = new int[k];

        for(int i=0;i<k;i++){
            result[i] = pq.poll();
        }
        return result;
    }
}
