class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n = nums.size();
        long long expectedsum = (long long)n*(n+1)/2;
        long long actualsum = 0;

        for(int num:nums){
            actualsum += num;
        }
        return expectedsum - actualsum;
    }
};
