class Solution {
public:
    vector<int> countBits(int n) {
        vector<int>result(n+1);

            for(int i=1;i<=n;i++){
                int num = i;
                while( num != 0){
                    result[i]++;
                    num &= (num - 1);
                }
            }
        return result;
    }
};
