
public class SpiralMatrix {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows+1][cols+1];
        int val = 1;
        for (int i = rStart; i < cols+1; i++) {
            for (int j = cStart; j < rows+1; j++) {
                result[i][j] = val;
                val++;
            }
        }

        return result;
    }
}