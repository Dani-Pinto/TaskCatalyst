package modelo;

import java.util.ArrayList;
import java.util.List;

public class GestorTareas {
    private static GestorTareas instancia;
    private List<Tarea> tareas;

    private GestorTareas() {
        tareas = new ArrayList<>();
    }

    public static GestorTareas obtenerInstancia() {
        if (instancia == null) {
            instancia = new GestorTareas();
        }
        return instancia;
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public Tarea obtenerTareaPorNombre(String nombreTarea) {
        for (Tarea tarea : tareas) {
            if (tarea.obtenerNombre().equals(nombreTarea)) {
                return tarea;
            }
        }
        return null; // Si no se encuentra la tarea
    }

    public List<Tarea> obtenerTodasLasTareas() {
        return tareas;
    }
}


