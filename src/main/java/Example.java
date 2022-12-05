import java.util.function.*;

public class Example implements Example3{
    @Override
    public void hablar() {
        System.out.println("Hola estoy hablando");
    }

    @Override
    public String saludar() {
        return "Hola, como estás?";
    }

    @Override
    public void decirAdios(){
        System.out.println("Hasta luego");
    }

    public static void main(String[] args) {
        /*Example example = new Example();
        example.hablar();
        System.out.println(example.saludar());
        example.decirAdios();*/

        Consumer<String> STRING_CONSUMER= s -> System.out.println(s);
        STRING_CONSUMER.accept("Hola");

        Supplier<Integer> c=() -> {
            int a=3;
            int b=2;
            return a+b;
        };
        System.out.println(c.get());

        Function<Integer, Integer> a=integer -> integer-2;
        System.out.println(a.apply(28));

        Predicate<Integer> predicate=integer -> integer>a.apply(28);
        System.out.println(predicate.test(27));
        if(predicate.test(30)){
            System.out.println("Es mayor");
        }else {
            System.out.println("No es mayor");
        }
        BiFunction<Integer,Integer, Integer> biFunction=(o, o2) -> o+o2;
        BiConsumer<Integer,Integer> biConsumer=(integer, integer2) -> System.out.println(integer+integer2);
        BiPredicate<Integer, Integer> biPredicate=(integer, integer2) -> integer>integer2;
    }
}
