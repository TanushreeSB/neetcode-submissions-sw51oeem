class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        int n = nums.size();
        int res = 0;
        unordered_set<int>store(nums.begin(),nums.end());

        for(int num:store){
            if(store.find(num - 1) == store.end()){
                int curr = num, streak = 1;
                while(store.find(curr + 1) != store.end()){
                    streak++;
                    curr++;
                }
                res = max(res,streak);
            }
        }
        return res;
    }
};
