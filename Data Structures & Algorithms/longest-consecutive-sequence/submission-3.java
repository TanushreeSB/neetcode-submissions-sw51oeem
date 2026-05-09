class Solution {

    // Function to check if target exists in array
    public boolean linearSearch(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public int longestConsecutive(int[] nums) {

        int longest = 0;

        // Check every number
        for (int num : nums) {

            int currNum = num;
            int streak = 1;

            // Find next consecutive numbers
            while (linearSearch(nums, currNum + 1)) {
                currNum++;
                streak++;
            }

            longest = Math.max(longest, streak);
        }

        return longest;
    }
}