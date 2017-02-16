package labWork_2_14_2and3;

/**
 * Created by Bulik on 13.08.2016.
 */
public class MyTestMethod {
    public static <T extends Comparable> int calcNum(T[] array, T maxElem) {
        int count = 0;
        for (T element : array) {
            if (element.compareTo(maxElem) > 0) {
                count++;
            }
        }
        return count;
    }

    public static <T extends Number & Comparable> double calcSum(T[] array, T maxValue) {
        double sum = 0.0;
        for (T element : array) {
            if (element.compareTo(maxValue) > 0) {
                sum += element.doubleValue();
            }
        }
        return sum;
    }
}