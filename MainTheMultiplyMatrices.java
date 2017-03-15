package dev8;

/**
 * Entry point of program.
 */
public class MainTheMultiplyMatrices {

    /**
     * Entry method.
     */
    public static void main(String[] args) {
        TheMatrixBuilder builder = new TheMatrixBuilder();
        TheMatricesMultiplier multiplier = new TheMatricesMultiplier();
        System.out.println("First matrix");
        double[][] matrixA = builder.buildMatrix();
        System.out.println("Second matrix");
        double[][] matrixB = builder.buildMatrix();
        double[][] resMatrix;

        resMatrix = multiplier.multiplyMatrices(matrixA, matrixB);
        for (int i = 0; i < resMatrix.length; i++) {
            for (int j = 0; j < resMatrix[i].length; j++) {
                System.out.format("%6d ", resMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
