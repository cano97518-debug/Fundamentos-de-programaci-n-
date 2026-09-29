package a2261330031_practica4;

public class Ejercicio5 {
    public static void main(String[] args) {
        String nombre = "Ana María";
        String materia = "Fundamentos de Programación";
        char grupo = 'A';

        System.out.printf("Nombre del alumno: %s\n", nombre);
        System.out.printf("Materia: %s\n", materia);
        System.out.printf("Grupo: %c\n", grupo);
        System.out.printf("Ficha: El alumno %s pertenece al grupo %c en %s.\n", nombre, grupo, materia);
    }
}