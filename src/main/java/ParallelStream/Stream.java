package ParallelStream;

import java.util.stream.IntStream;

public class Stream {
    public static void main (String[] args) {

        long numero1=System.currentTimeMillis();

        IntStream lista= IntStream.range(1, 10);
        int total=lista.map(Stream::duplicar).sum();

        long numero2=System.currentTimeMillis();
        System.out.println(numero2-numero1);//9098
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
