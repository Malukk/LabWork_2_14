package labWork_2_14_4;

import java.util.Arrays;

/**
 * Created by Bulik on 23.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        Integer [] arrInt ={1,2,3,4,5,6,7,8,9};
        String [] arrString = {"one", "two", "three", "four", "five", "sex", "seven", "eight", "nine"};

        MyMixer<Integer> myMixer_1 = new MyMixer<>(arrInt);
        myMixer_1.shuffle();
        System.out.println(Arrays.toString(myMixer_1.getArrey()));

        MyMixer<String> myMixer_2 =new MyMixer<>(arrString);
        myMixer_2.shuffle();
        System.out.println(Arrays.toString(myMixer_2.getArrey()));
    }
}
