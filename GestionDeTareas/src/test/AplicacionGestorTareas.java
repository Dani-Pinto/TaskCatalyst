package test;

import modelo.*;

import java.util.List;
import java.util.Scanner;

public class AplicacionGestorTareas {
    public static void main(String[] args) {
        GestorTareas gestorTareas = GestorTareas.obtenerInstancia();

        // Crear un observador de ejemplo
        ObservadorTarea observadorEjemplo = new ObservadorEjemplo();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Opciones:");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Listar tareas");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (choice) {
                case 1:
                    System.out.print("Ingrese el nombre de la tarea: ");
                    String nombreTarea = scanner.nextLine();
                    Tarea nuevaTarea = new Tarea(nombreTarea);
                    nuevaTarea.agregarObservador(observadorEjemplo);
                    gestorTareas.agregarTarea(nuevaTarea);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre de la tarea completada: ");
                    String nombreTareaCompletada = scanner.nextLine();
                    Tarea tareaCompletada = gestorTareas.obtenerTareaPorNombre(nombreTareaCompletada);
                    if (tareaCompletada != null) {
                        tareaCompletada.establecerCompletada(true);
                    } else {
                        System.out.println("Tarea no encontrada.");
                    }
                    break;
                case 3:
                    System.out.println("Lista de tareas:");
                    List<Tarea> tareas = gestorTareas.obtenerTodasLasTareas();
                    for (Tarea tarea : tareas) {
                        System.out.println(tarea.obtenerNombre() + " - Completada: " + tarea.estaCompletada());
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }
}


