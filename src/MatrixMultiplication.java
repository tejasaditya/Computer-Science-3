public class MatrixMultiplication
{
    public static void main(String[] args)
    {

        int[][] matrixOne = { {3, -2, 5}, {3, 0, 4} };
        int[][] matrixTwo = { {2, 3}, {-9, 0}, {0, 4} };
        //dimensions of matrixOne
        int r1 = matrixOne.length, c1 = matrixOne[0].length;
        //dimensions of matrixTwo
        int r2 = matrixTwo.length, c2 = matrixTwo[0].length;

        // Mutliplying Two matrices
        int[][] matrixFinal = multiplyMatrix(matrixOne, matrixTwo, r1, c1, c2);

        // Displaying the result
        for(int i = 0;i<matrixFinal.length;i++)
        {
            System.out.print(matrixFinal[i]);
            System.out.print(" ");
        }
    }

    public static int[][] multiplyMatrix(int[][] matrixOne, int[][] matrixTwo, int r1, int c1, int c2)
    {
        int[][] finalMatrix = new int[r1][c2];
        for(int i = 0; i < r1; i++)
        {
            for (int j = 0; j < c2; j++)
            {
                for (int k = 0; k < c1; k++)
                {
                    finalMatrix[i][j] += matrixOne[i][k] * matrixTwo[k][j];
                }
            }
        }
        return finalMatrix;
    }
}
