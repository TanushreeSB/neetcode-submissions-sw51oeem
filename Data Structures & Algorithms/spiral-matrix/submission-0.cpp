class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();

        vector<int> result;
        vector<vector<bool>> visited(m, vector<bool>(n, false));

        // right, down, left, up
        int dr[] = {0, 1, 0, -1};
        int dc[] = {1, 0, -1, 0};

        int r = 0, c = 0, dir = 0;

        for (int i = 0; i < m * n; i++) {
            result.push_back(matrix[r][c]);
            visited[r][c] = true;

            int nr = r + dr[dir];
            int nc = c + dc[dir];

            if (nr >= 0 && nr < m && nc >= 0 && nc < n && !visited[nr][nc]) {
                r = nr;
                c = nc;
            } else {
                dir = (dir + 1) % 4; // change direction
                r += dr[dir];
                c += dc[dir];
            }
        }
        return result;
    }
};
