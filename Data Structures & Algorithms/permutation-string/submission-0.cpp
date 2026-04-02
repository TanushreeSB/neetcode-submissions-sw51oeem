class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        int n = s1.size();
        int m = s2.size();

        if (n > m) return false;

        vector<int> freq1(26, 0), freq2(26, 0);

        // frequency of s1
        for (char ch : s1) {
            freq1[ch - 'a']++;
        }

        // first window of size n in s2
        for (int i = 0; i < n; i++) {
            freq2[s2[i] - 'a']++;
        }

        if (freq1 == freq2) return true;

        // slide the window
        for (int i = n; i < m; i++) {
            freq2[s2[i] - 'a']++;           // add new character
            freq2[s2[i - n] - 'a']--;       // remove old character

            if (freq1 == freq2) return true;
        }

        return false;
    }
};

