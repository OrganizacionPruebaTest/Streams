package AJMQ;

import Tarea1Stream.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Y la siguiente coleccion
public class Coleccion {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
        cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
        cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
        cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
        cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300));

        System.out.println("==================================================================================");
        //Obtener la cantidad de cursos con una duración mayor a 5 horas.
        Long nCursosConDuracionMayor5 = cursos.stream().filter(c -> c.getDuracion()>5f).count();
        System.out.println("Cantidad de cursos con una duración mayor a 5 horas: " + nCursosConDuracionMayor5);

        System.out.println("==================================================================================");
        //cantidad de cursos con una duración menor a 2 horas
        Long nCursosConDuracionMenor5 = cursos.stream().filter(c -> c.getDuracion()<2f).count();
        System.out.println("Cantidad de cursos con una duración menor a 2 horas: " + nCursosConDuracionMenor5);

        System.out.println("==================================================================================");
        //Cursos con una cantidad de vídeos mayor a 50
        System.out.println("Cursos con una cantidad de vídeos mayor a 50: ");
        cursos.stream().filter(c ->c.getVideos()>50).forEach(c->System.out.println("-" + c.getTitulo()));

        System.out.println("==================================================================================");
        //Título de los 3 cursos con mayor duración
        //cursos.stream().sorted(Comparator.comparingDouble(c -> c.getDuracion())).forEach(c-> System.out.println(c.getDuracion()));
        System.out.println("3 Cursos con mayor duracion");
        cursos.stream().map(c ->c.getDuracion()).sorted(Comparator.reverseOrder()).limit(3).forEach(c -> System.out.println(c));

        System.out.println("==================================================================================");
        //Duración total de todos los cursos
        Double duracionTotal = cursos.stream().mapToDouble(c->c.getDuracion()).sum();
        System.out.println("Duración total de todos los cursos: " + duracionTotal);

        System.out.println("==================================================================================");
        //Todos aquellos libros que superen el promedio en cuanto a duración se refiere
        System.out.println("Libros que superen el promedio de duracion:");
        double promedio = (cursos.stream().mapToDouble(c->c.getDuracion()).sum()/cursos.size());
        cursos.stream().filter(c ->c.getDuracion()>promedio).forEach(c -> System.out.println("-" + c.getTitulo()));

        System.out.println("==================================================================================");
        //Duración de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500
        System.out.println("Cursos que tengan una cantidad de alumnos inscritos menor a 500");
        cursos.stream().filter(c ->c.getAlumnos()<500).forEach(c -> System.out.println("-" + c.getTitulo() +" con duracion de: " + c.getDuracion()));

        System.out.println("==================================================================================");
        //Obtener el curso con mayor duración.
        System.out.println("Obtener el curso con mayor duración");
        Curso cMayorDuracion = cursos.stream().max(Comparator.comparingDouble(c->c.getDuracion())).get();
        System.out.println("-"+cMayorDuracion.getTitulo());

        System.out.println("==================================================================================");
        //Crear una lista de Strings con todos los titulos de los cursos
        System.out.println("Titulos de los cursos");
        List<String> listaDeCursos = cursos.stream().map(c -> c.getTitulo()).collect(Collectors.toList());
        listaDeCursos.stream().forEach(c -> System.out.println("-" + c));
    }
    /***
     * Resolver los siguientes problemas:
     * Obtener la cantidad de cursos con una duración mayor a 5 horas.
     * Obtener la cantidad de cursos con una duración menor a 2 horas.
     * Listar el título de todos aquellos cursos con una cantidad de vídeos mayor
     * a 50.
     * Mostrar en consola el título de los 3 cursos con mayor duración.
     * Mostrar en consola la duración total de todos los cursos.
     * Mostrar en consola todos aquellos libros que superen el promedio en
     * cuanto a duración se refiere.
     * Mostrar en consola la duración de todos aquellos cursos que tengan una
     * cantidad de alumnos inscritos menor a 500.
     * Obtener el curso con mayor duración.
     * Crear una lista de Strings con todos los titulos de los cursos.
     *
     * Una vez terminado subirlo al repositorio
     */
}
