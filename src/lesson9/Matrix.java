package lesson9;

import java.util.Random;

public class Matrix {
    int[][] content = new int[2][2];

    public Matrix() {
        init();
    }

    public Matrix plus(Matrix matrix){
        Matrix matrix1 = new Matrix();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix1.content[i][j] = this.content[i][j] + matrix.content[i][j];
            }
        }
        return matrix1;
    }

    public static Matrix plus(Matrix m1, Matrix m2){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m1.content[i][j] = m1.content[i][j] + m2.content[i][j];
            }
        }
        return m1;
    }

    public void init(){
        Random random = new Random();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                this.content[i][j] = random.nextInt(10,20);
            }
        }
    }

    public static Matrix initMatrix(){
       return  new Matrix();
    }

}
