package operators;

import java.util.Random;

/**
 * Created by donger on 4/14/18.
 */
public class MathOps {

    public static void main(String[] args){
        //Create a seeded random number generator
        Random rand = new Random(47);

        //Choose values from 1 to 100
        int i, j, k;
        j = rand.nextInt(100) + 1;
        k = rand.nextInt(100) + 1;
        System.out.println(" j = " + j);
        System.out.println(" k = " + k);

        i = j + k;
        System.out.println(" j + k = " + i);

        i = j - k;
        System.out.println(" j - k = " + i);

        i = j * k;
        System.out.println(" j * k = " + i);

        i = j / k;
        System.out.println(" j / k = " + i);

        i = j % k;
        System.out.println(" j % k = " + i);

        //Create float values
        float u, v, w;
        v = rand.nextFloat();
        w = rand.nextFloat();
        System.out.println(" v = " + v);
        System.out.println(" w = " + w);

        //Can apply to double
        u = v + w;
        System.out.println(" v + w = " + u);

        u = v - w;
        System.out.println(" v - w = " + u);

        u = v * w;
        System.out.println(" v * w = " + u);

        u = v / w;
        System.out.println(" v / w = " + u);

        //Can apply to char, byte, short, int, long and double
        u += v;
        System.out.println(" u += v = " + u);

        u -= v;
        System.out.println(" u -= v = " + u);

        u *= v;
        System.out.println(" u *= v = " + u);

        u /= v;
        System.out.println(" u /= v = " + u);

    }
}
