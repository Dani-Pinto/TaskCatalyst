package modelo;

import java.util.ArrayList;
import java.util.List;

public class Tarea {
    private String nombre;
    private boolean estaCompletada;
    private List<ObservadorTarea> observadores;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.estaCompletada = false;
        this.observadores = new ArrayList<>();
    }

    public void agregarObservador(ObservadorTarea observador) {
        observadores.add(observador);
    }

    public void establecerCompletada(boolean estaCompletada) {
        this.estaCompletada = estaCompletada;
        notificarObservadores();
    }

    public String obtenerNombre() {
        return nombre;
    }

    public boolean estaCompletada() {
        return estaCompletada;
    }

    public void notificarObservadores() {
        for (ObservadorTarea observador : observadores) {
            observador.actualizar(this);
        }
    }
}

