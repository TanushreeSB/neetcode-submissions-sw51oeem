class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        int n = nums.size();
        vector<int>ans;
        deque<int>dq;

        if(n==0 || k==0)return ans;
        if(k>n)k=n;
        if(k==1)return nums;

        for(int i=0;i<k;i++){
            while(!dq.empty() && nums[dq.back()] <= nums[i]){
                dq.pop_back();
            }
            dq.push_back(i);
        }

        ans.push_back(nums[dq.front()]);

        for(int i=k;i<n;i++){
            while(!dq.empty() && dq.front() <= i-k){
                dq.pop_front();
            }


            while(!dq.empty() && nums[dq.back()] <= nums[i]){
                    dq.pop_back();
                }
                dq.push_back(i);
                ans.push_back(nums[dq.front()]);
        }
        return ans;
    }
};
