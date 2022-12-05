import java.util.function.Consumer;
import java.util.function.Function;

public interface Example3 {
    void hablar();
    String saludar();

    default void decirAdios(){
        System.out.println("Adios");
    }
}
