class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer>mp = new HashMap<>();

        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);    
        }
        
        for(int val: mp.values()){
            if(val>1){
                return true;
            }
        }
        return false;   
    }
}