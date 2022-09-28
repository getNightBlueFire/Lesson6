import java.util.Arrays;
import java.util.Random;

public class Matrix {
    int[][] content;
    int n;
    int k;

    Matrix(){}
    public Matrix(int n, int k) {
        this.n = n;
        this.k = k;
        this.content = new int[n][k];
        //init();
    }

    void init(){
        Random random = new Random();
        for (int i = 0; i < content.length; i++) {
            for (int j = 0; j < content[i].length; j++) {
                content[i][j] = random.nextInt(10,30);
            }
        }
    }

    void printMatrix(){
        System.out.println(Arrays.deepToString(this.content));
    }

    Matrix plus(Matrix matrix){

        int[][] temp = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                temp[i][j] = this.content[i][j] + matrix.content[i][j];
            }
        }

        Matrix matrix1 = new Matrix();
        matrix1.content = temp;
        matrix1.k = k;
        matrix1.n = n;
        return matrix1;
    }


}
