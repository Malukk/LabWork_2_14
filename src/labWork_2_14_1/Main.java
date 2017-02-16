package labWork_2_14_1;

/**
 * Created by Bulik on 13.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyTuple<String, Integer, Long> obj_1 = new MyTuple<>("test", 100, 111111111111L);
        MyTuple<Double, String, String> obj_2 = new MyTuple<>(0.5, "demo", "hellov");
        System.out.println("1 :" + obj_1.getFiled_1() + ", "+ obj_1.getFiled_2()+ ", " + obj_1.getFiled_3());
        System.out.println("2 :" + obj_2.getFiled_1() + ", "+ obj_2.getFiled_2()+ ", " + obj_2.getFiled_3());


    }
}
