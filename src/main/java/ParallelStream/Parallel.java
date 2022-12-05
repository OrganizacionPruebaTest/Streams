package ParallelStream;

import java.util.stream.IntStream;

public class Parallel {
    public static void main (String[] args) {

        long numero1=System.currentTimeMillis();

        IntStream lista= IntStream.range(1, 10);
        int total=lista.parallel().map(Parallel::duplicar).sum();
        //1,2,3,4,5,6,7,8,9,10
        //1,2,3
        //4,5,6
        //7,8,9,10
        //7,8,9,10,1,2,3,4,5,6
        long numero2=System.currentTimeMillis();
        System.out.println(numero2-numero1);
        System.out.println(total);

    }

    public static  int duplicar( int numero) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return numero*2;
    }
}
