package Tarea1Stream.BRG;

import Tarea1Stream.Curso;

import java.util.*;

public class Main {
    private static int idProblema;

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200));
        cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800));
        cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700));
        cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400));
        cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300));

        final int FILTRO_DURACION_MAYOR = 5, FILTRO_DURACION_MENOR = 2;
        msgProblema("Obtener la cantidad de cursos con una duración mayor a 5 horas.");
        long cantidadCursosDuracionMayor = cursos.stream()
                .filter(curso -> curso.getDuracion() > FILTRO_DURACION_MAYOR)
                .count();
        msgResultadoProblema("Cantidad de cursos mayor a \"" + FILTRO_DURACION_MAYOR + "\" horas = " + cantidadCursosDuracionMayor);

        msgProblema("Obtener la cantidad de cursos con una duración menor a 2 horas.");
        long cantidadCursosDuracionMenor = cursos.stream()
                .filter(curso -> curso.getDuracion() < FILTRO_DURACION_MENOR)
                .count();
        msgResultadoProblema("Cantidad de cursos menor a \"" + FILTRO_DURACION_MENOR + "\" horas = " + cantidadCursosDuracionMenor);

        final int FILTRO_CANTIDAD_VIDEOS = 50;
        msgProblema("Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a 50.");
        cursos.stream()
                .filter(curso -> curso.getVideos() > FILTRO_CANTIDAD_VIDEOS)
                .forEach(curso -> msgResultadoProblema(curso.getTitulo()));

        msgProblema("Mostrar en consola el título de los 3 cursos con mayor duración.");
        cursos.stream()
                .sorted(Comparator.comparingDouble(Curso::getDuracion).reversed())
                .limit(3)
                .forEach(curso -> msgResultadoProblema(curso.getTitulo()));

        msgProblema("Mostrar en consola la duración total de todos los cursos.");
        double duracionTotalCursos = cursos.stream()
                .mapToDouble(Curso::getDuracion)
                .sum();
        msgResultadoProblema("Duración total " + duracionTotalCursos + " horas.");

        msgProblema("Mostrar en consola todos aquellos cursos que superen el promedio en cuanto a duración se refiere.");
        //Promedio (5.7)
        final double PROMEDIO_CURSOS = cursos.stream()
                .mapToDouble(Curso::getDuracion)
                .average()
                .orElse(0);

        cursos.stream()
                .filter(curso -> curso.getDuracion() > PROMEDIO_CURSOS)
                .forEach(curso -> msgResultadoProblema(curso.getTitulo()));

        final int FILTRO_CANTIDAD_ALUMNOS = 500;
        msgProblema("Mostrar en consola la duración de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500.");
        cursos.stream()
                .filter(curso -> curso.getAlumnos() < FILTRO_CANTIDAD_ALUMNOS)
                .forEach(curso -> msgResultadoProblema(curso.getDuracion() + " horas."));

        msgProblema("Obtener el curso con mayor duración.");
        Optional<Curso> cursoMayorDuracion = cursos.stream().max(Comparator.comparing(Curso::getDuracion));
        msgResultadoProblema(cursoMayorDuracion.get().getTitulo() + " | " + cursoMayorDuracion.get().getDuracion() + " horas.");

        msgProblema("Crear una lista de Strings con todos los titulos de los cursos.");
        List<String> tituloCursos = cursos.stream().map(Curso::getTitulo).toList();
        tituloCursos.forEach(Main::msgResultadoProblema);
    }

    public static void msgProblema(String mensaje) {
        System.out.println(++idProblema + ") \"" + mensaje + "\"");
    }

    public static void msgResultadoProblema(String mensaje) {
        System.out.println("R= " + mensaje);
    }

}
