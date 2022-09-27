package lesson9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Storage test = new Storage();
        Fruit fruit0 = new Apple(2.5D,10.3D);
        Fruit fruit2 = new Apple(2.2D,1.5D);
        Fruit fruit1 = new Orange(9.1D,1.5D);
        Fruit fruit3 = new Orange(9.5D,1.1D);
        test.addFruit(fruit0);
        test.addFruit(fruit1);
        test.addFruit(fruit2);
        test.addFruit(fruit3);

        Matrix matrix0 = new Matrix();
        Matrix matrix1 = new Matrix();
        System.out.println(Arrays.deepToString(matrix0.content));
        System.out.println(Arrays.deepToString(matrix1.content));

        Matrix plus = matrix0.plus(matrix1);

        Matrix plus1 = Matrix.plus(matrix0, matrix1);

        Matrix mxr = Matrix.initMatrix();


        System.out.println(Arrays.deepToString(plus1.content));



//        Apple[] apples = new Apple[3];
//
//
//
//        for (int i = 0; i < test.getFruits().length; i++) {
//            System.out.println(test.getFruits()[i]);
//        }
//
//        fruit0.info();
//        System.out.println(fruit0.getPrice());
//        test.infoAbout();
//        test.infoAbout("Apple");


    }
}
