import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {
        //Imprimir todos los numeros que no esten repetidos
        List<Integer> list= Arrays.asList(1,2,3);
        List<Integer> list2= Arrays.asList(1,2,3);
        List<List<Integer>> listList=new ArrayList<>();
        listList.add(list);
        listList.add(list2);

        //De la lista listList, crear un HashMap con streams donde la llave sea el valor de
        // la primera lista (list) y el valor sea el valor de la segunda lista (list2) e imprimir los valores del Hashmap
        //Ejemplo: HashMap<Integer,Integer> map=(1,2),(3,4),(5,65)
        Map<Integer,Integer> map= IntStream
                .range(0,list.size())
                .boxed()
                .collect(Collectors.toMap(list::get,list2::get));
        System.out.println(map);

        //Boxing, Autoboxing, Unboxing
    }
}
