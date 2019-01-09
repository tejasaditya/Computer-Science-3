public class Array_Rotation
    {
        public static void main(String[] args)
        {
            int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
            System.out.println("Original Array");
            for(int i = 0;i<matrix.length;i++)
            {
                for (int j = 0; j<matrix[0].length;j++)
                {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }

            System.out.println("Rotated Array");
            int[][] final_matrix = matrix_rotation(matrix);
            for (int i = 0;i<final_matrix.length;i++)
            {
                for(int j = 0; j<final_matrix[0].length;j++)
                {
                    System.out.print(final_matrix[i][j]);
                }
                System.out.println();
            }

        }
        public static int[][] matrix_rotation(int [][]array)
        {
            int length = array.length;
            int width = array[0].length;
            //declaring array with flipped number of rows and columns
            int [][] answer = new int[width][length];

            //creating transpose
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < width; j++) {
                    answer[j][i] = array[i][j];
                }

            }

            //swapping elements in each row
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < length/2; j++) {
                    int temp = answer[i][j];
                    answer[i][j] = answer[i][length-j-1];
                    answer[i][length-j-1] = temp;
                }
            }

            //returning the rotated array
            return answer;
        }
    }
