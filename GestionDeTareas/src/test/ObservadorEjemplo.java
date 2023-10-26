package test;

import modelo.*;

public class ObservadorEjemplo implements ObservadorTarea {
    @Override
    public void actualizar(Tarea tarea) {
        System.out.println("Notificación: La tarea '" + tarea.obtenerNombre() + "' ha sido completada.");
    }
}

