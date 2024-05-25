package model;

import java.util.ArrayList;
import java.util.List;

public class ModeloTarea {
    private List<Tarea> tareas;

    public ModeloTarea() {
        tareas = new ArrayList<>();
    }

    public void agregarTarea(String descripcion) {
        tareas.add(new Tarea(descripcion));
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void completarTarea(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.get(indice).setCompleta(true);
        }
    }
}
