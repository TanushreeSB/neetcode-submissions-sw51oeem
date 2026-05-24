class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;

        int pivot = findPivot(nums);

        if (target >= nums[pivot] && target <= nums[n - 1]) {
            return binSearch(nums, pivot, n - 1, target);
        } else {
            return binSearch(nums, 0, pivot - 1, target);
        }

    }

    public int binSearch(int[] nums,int start,int end, int target) {
        
        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public int findPivot(int[] nums){
        int start = 0, end = nums.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(nums[mid] > nums[end]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }

}
