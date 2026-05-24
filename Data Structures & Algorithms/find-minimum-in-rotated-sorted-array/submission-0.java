class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;

        int start = 0, end = n-1;
        while(start <= end){

            int mid = start + (end - start)/2;

            if(nums[start] <= nums[end]){
                return nums[start];
            }

            int next = (mid+1)%n;
            int prev = (mid+n-1)%n;

            if(nums[mid] < nums[prev] && nums[mid] < nums[next]){
                return nums[mid];
            }

            if(nums[mid] < nums[end]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
