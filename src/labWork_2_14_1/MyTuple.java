package labWork_2_14_1;

/**
 * Created by Bulik on 13.08.2016.
 */
public class MyTuple<T, S, U> {
    private T filed_1;
    private S filed_2;
    private U filed_3;

    public MyTuple(T filed_1, S filed_2, U filed_3) {
        this.filed_1 = filed_1;
        this.filed_2 = filed_2;
        this.filed_3 = filed_3;
    }

    public T getFiled_1() {
        return filed_1;
    }

    public S getFiled_2() {
        return filed_2;
    }

    public U getFiled_3() {
        return filed_3;
    }
}
