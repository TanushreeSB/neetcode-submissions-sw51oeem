class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        int n = nums.size();
        if(nums.empty()) return 0;

        int longest = 1, currstreak = 1;
        sort(nums.begin(),nums.end());
        for(int i=1;i<n;i++){
            if(nums[i] == nums[i-1])continue;
            else if(nums[i] == nums[i-1] + 1){
                currstreak++;
            }else{
                currstreak = 1;
            }
            longest = max(longest,currstreak);
        }
        return longest;
    }
};
