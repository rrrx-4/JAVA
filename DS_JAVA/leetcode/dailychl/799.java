class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {

        double st[][] = new double[101][101];
        st[0][0] = poured;

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j <= 99; j++) {
                double extra;
                extra = Math.max(st[i][j] - 1, 0.0);

                st[i + 1][j] = st[i + 1][j] + extra / 2.0;
                st[i + 1][j + 1] = st[i + 1][j + 1] + extra / 2.0;
            }
        }

        return Math.min(st[query_row][query_glass], 1.00);

    }
}
