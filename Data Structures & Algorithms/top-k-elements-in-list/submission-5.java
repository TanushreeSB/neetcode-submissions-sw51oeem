class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // STEP 1: build frequency map
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        // STEP 2: create buckets
        List<Integer>[] bucket = new List[nums.length + 1];

        for (int key : mp.keySet()) {
            int freq = mp.get(key);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        // STEP 3: collect result
        int[] res = new int[k];
        int idx = 0;

        for (int i = bucket.length - 1; i >= 0 && idx < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    res[idx++] = num;
                    if (idx == k) break;
                }
            }
        }

        return res;
    }
}