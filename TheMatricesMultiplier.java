package dev8;

/**
 * Class TheMatrixMultplier contains a method
 * for multiplying of two matrices.
 */
public class TheMatricesMultiplier {

    /**
     * Multiply two matrices.
     *
     * @param matrixA - contains elements of first matrix.
     * @param matrixB - contains elements of second matrix.
     * @return resMatrix - result of multiplying of two matrices.
     */
    public double[][] multiplyMatrices(double[][] matrixA, double[][] matrixB) {
        int rowsMatrixA = matrixA.length;
        int columnsMatrixB = matrixB[0].length;
        int rowsMatrixB = matrixB.length;
        double[][] resMatrix = new double[rowsMatrixA][columnsMatrixB];

        if (rowsMatrixA != columnsMatrixB) {
            System.out.println("These Matrices can not multiply.");
        } else {
            for (int i = 0; i < rowsMatrixA; i++) {
                for (int j = 0; j < columnsMatrixB; j++) {
                    for (int n = 0; n < rowsMatrixB; n++) {
                        resMatrix[i][j] += matrixA[i][n] * matrixB[n][j];
                    }
                }
            }
        }
        return resMatrix;
    }
}
