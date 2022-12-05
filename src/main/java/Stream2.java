import java.util.*;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args) {
        Persona persona1=new Persona();
        Persona persona2=new Persona();
        persona1.setEdad(30);
        persona2.setEdad(22);
        List<Persona> personas=new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);

        System.out.println(getOldestPerson(personas).getEdad());

    }
    public static List<String> transform(List<List<String>> collection){
        return collection.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
    public static Persona getOldestPerson(List<Persona> people){
        return people.stream()
                .max(Comparator.comparing(Persona::getEdad))
                .get();
    }

}
