import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input first matrix
        System.out.print("Enter the number of rows and columns of the first matrix: ");
        int rows1 = input.nextInt();
        int cols1 = input.nextInt();
        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }

        // Input second matrix
        System.out.print("Enter the number of rows and columns of the second matrix: ");
        int rows2 = input.nextInt();
        int cols2 = input.nextInt();
        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }

        // Matrix addition
        if (rows1 == rows2 && cols1 == cols2) {
            int[][] sum = new int[rows1][cols1];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    sum[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            System.out.println("The sum of the two matrices is:");
            printMatrix(sum);
        } else {
            System.out.println("Matrix addition is not possible.");
        }

        // Matrix multiplication
        if (cols1 == rows2) {
            int[][] product = new int[rows1][cols2];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    for (int k = 0; k < cols1; k++) {
                        product[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            System.out.println("The product of the two matrices is:");
            printMatrix(product);
        } else {
            System.out.println("Matrix multiplication is not possible.");
        }
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
