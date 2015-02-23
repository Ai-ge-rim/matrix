package matrix;

import javafx.scene.transform.MatrixType;
import matrix1.Matrix;

public class matrix {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix ();
        Matrix matrix2 = new Matrix();

        Matrix matrixC = Matrix.multiply (matrix1, matrix2);
        matrixC = matrix1.multiply(matrix2);
        System.out.println(matrixC);
            }











}
