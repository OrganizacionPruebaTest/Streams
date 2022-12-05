package Tarea1Stream.FIDM;

import Tarea1Stream.Curso;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Y la siguiente coleccion
public class ColeccionI {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
        cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
        cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
        cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
        cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300));
        //1.- Obtener la cantidad de cursos con una duración mayor a 5 horas.
        //Long cantidad=cursos.stream().filter(x->x.getDuracion()>5).count();
        //2.- Obtener la cantidad de cursos con una duración menor a 2 horas.
        //Long cantidad2=cursos.stream().filter(x->x.getDuracion()<2).count();
        //3.- Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a 50.
        //List<String>listaTitulos=cursos.stream().filter(x->x.getVideos()>50).map(y->y.getTitulo()).collect(Collectors.toList());
        //listaTitulos.stream().forEach(System.out::println);
        // /*Prueba*/ System.out.println(listaTitulos.stream().collect(Collectors.toList()));
        //4.- Mostrar en consola el título de los 3 cursos con mayor duración.
        // /*Prueba/*cursos.stream().map(x->x.getDuracion()).sorted(Collections.reverseOrder()).limit(3).forEach(System.out::println);
            /*List<Float>primeros3=cursos.stream().map(x->x.getDuracion()).sorted(Collections.reverseOrder()).limit(3).collect(Collectors.toList());
            System.out.println(cursos.stream().filter(x->{
                if(x.getDuracion()==primeros3.get(0).floatValue()||x.getDuracion()==primeros3.get(1).floatValue()||x.getDuracion()==primeros3.get(2).floatValue()){
                    return true;
                }else return false;
            }).map(y->y.getTitulo()).collect(Collectors.toList()));*/
        //5.- Mostrar en consola la duración total de todos los cursos.
        // /*Prueba/* System.out.println(cursos.stream().map(x->x.getDuracion()).collect(Collectors.summingLong(Float::byteValue)));
        // /*Prueba/* System.out.println(cursos.stream().map(Curso::getDuracion).collect(Collectors.summingDouble(Float::floatValue)));
        //System.out.println((Double) cursos.stream().map(Curso::getDuracion).mapToDouble(Float::floatValue).sum());
        //6.- Mostrar en consola todos aquellos cursos que superen el promedio en cuanto a duración se refiere.
        // /*Prueba/* Stream.of(cursos.stream().map(x->x.getDuracion()).mapToDouble(Float::floatValue).average());
        //Double promedio=cursos.stream().map(Curso::getDuracion).mapToDouble(Float::floatValue).average().getAsDouble();
        //System.out.println(cursos.stream().filter(x->x.getDuracion()>promedio).map(y->y.getTitulo()).collect(Collectors.toList()));
        //7.- Mostrar en consola la duración de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500.
        // /*Prueba*/ System.out.println(cursos.stream().filter(x->x.getAlumnos()<500).map(y->y.getTitulo()).collect(Collectors.toList()));
        //System.out.println(cursos.stream().filter(x->x.getAlumnos()<500).map(y->y.getDuracion()).collect(Collectors.toList()));
        //8.- Obtener el curso con mayor duración.
            /*Float mayorDuración=cursos.stream().map(x->x.getDuracion()).max(Comparator.comparing(Float::floatValue)).get();
            Curso cursoMayorDuracion= cursos.stream().filter(x->{
                if(x.getDuracion()==mayorDuración){
                    return true;
                }else return false;
            }).collect(Collectors.toList()).get(0);*/
        //9.- Crear una lista de Strings con todos los titulos de los cursos.
        //List<String>listaTitulos=cursos.stream().map(x->x.getTitulo()).collect(Collectors.toList());
    }



}
