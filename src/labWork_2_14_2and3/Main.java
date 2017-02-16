package labWork_2_14_2and3;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Bulik on 13.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        final int SIZE=15;
        Integer[] arreyInt = new Integer[SIZE];
        Double[] arreyDouble = new Double[SIZE];

        Random random = new Random();
        for (int i=0; i<SIZE; i++){
            arreyInt[i] = random.nextInt(44);
            arreyDouble[i] = random.nextDouble() * 44;
        }
        Arrays.sort(arreyInt);
        System.out.println("Array values: " + Arrays.toString(arreyInt));
        System.out.println("Number of elements that are greater than 20: " + MyTestMethod.<Integer>calcNum(arreyInt, 20));
        Arrays.sort(arreyDouble);
        System.out.println("Array values: " + Arrays.toString(arreyDouble));
        System.out.println("Number of elements that are greater than 15: " + MyTestMethod.<Double>calcNum(arreyDouble, 15.0));
        //lab_2_14_3
        System.out.println("*************************************");
        System.out.println("Sum of elements that are greater than 20 for int :" + MyTestMethod.<Integer>calcSum(arreyInt,20));
        System.out.println("Sum of elements that are greater than 20.0 for double :" + MyTestMethod.<Double>calcSum(arreyDouble,20.0));

    }
}
