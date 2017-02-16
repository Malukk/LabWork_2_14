package labWork_2_14_4;

import java.util.Random;

/**
 * Created by Bulik on 23.08.2016.
 */
public class MyMixer<T> {
    private T [] arrey;

    public MyMixer(T[] arrey) {
        this.arrey = arrey;
    }

    public T[] getArrey() {
        return arrey;
    }

    public void shuffle(){
        Random random = new Random();
        for (int i = 0; i<arrey.length; i++){
            int position = random.nextInt(arrey.length);
            T temp = arrey[i];
            arrey[i] = arrey[position];
            arrey[position] = temp;
        }
    }
}
