import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Interfaces {
    public static void main(String[] args) {
        Consumer<Integer> consumer=(a)-> {System.out.println(a);};//Carlos
        Supplier<Integer> supplier=()->1;//Javier
        Predicate<Integer> predicate=a->a>40;//Francisco
        Function<Persona, String> function=a->a.getNombre();//Carlos

        consumer=System.out::println;
        function=Persona::getNombre;

        Persona persona=new Persona();
        persona.setNombre("Ricardo");
        //System.out.println(function.apply(persona));

        Optional optional=Optional.ofNullable(null);
        System.out.println(optional.isPresent());

    }
}
