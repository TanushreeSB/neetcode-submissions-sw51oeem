class Solution {
public:
    string minWindow(string s, string t) {
        vector<int>freq(128,0);

        for(char ch:t){
            freq[ch]++;
        }

        int required = t.size();
        int i=0,minLen = INT_MAX;
        int startindex = 0;

        for(int j=0;j<s.size();j++){
            if(freq[s[j]] > 0){
                required--;
            }
            freq[s[j]]--;
            
            while(required == 0){
                if(j-i+1 < minLen){
                    minLen = j-i+1;
                    startindex = i;
                }
                freq[s[i]]++;
                if(freq[s[i]] > 0){
                    required++;
                }
                i++;
            }
        }
        if(minLen == INT_MAX)return "";
        return s.substr(startindex,minLen);
    }
};
