package alg;

public class Triangle {
    public int minimalTotal(int[][] triangle) {
        if (triangle == null || triangle.length == 0) {
            return -1;
        }

        if (triangle[0] == null || triangle[0][0] == 0) {
            return -1;
        }

        // state: f[x][y] = minimum path value from 0,0 to x,y
        int len = triangle.length;
        int[][] tmp = new int[len][len];

        // initialize
        tmp[0][0] = triangle[0][0];

        for (int i = 1; i < len; i++) {
            tmp[i][0] = tmp[i - 1][0] + triangle[i][0];
            tmp[i][i] = tmp[i - 1][i - 1] + triangle[i][i];

        }


        // top down

        for (int i = 1; i < len; i++) {

            for (int j = 1; j < i; j++) {
                tmp[i][j] = Math.min(tmp[i-1][j-1],tmp[i-1][j]) + triangle[i][j];

            }
        }


        // answer
        int best = Integer.MAX_VALUE;
        for (int i = 0;i<triangle[len-1].length; i++)
            if (tmp[len-1][i] < best){
                best = tmp[len-1][i];
            }

        return best;

    }


}
