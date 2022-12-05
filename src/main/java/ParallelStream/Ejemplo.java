package ParallelStream;

public class Ejemplo {
    public static void main(String[] args) {

        int total=0;

        long numero1=System.currentTimeMillis();

        for (int i=0;i<10;i++) {

            total+=duplicar(i);
        }

        long numero2=System.currentTimeMillis();

        System.out.println(numero2-numero1);//10000
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
