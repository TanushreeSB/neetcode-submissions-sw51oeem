class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            // shrink window until valid
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            // expand window
            set.add(s.charAt(right));

            // update answer
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
