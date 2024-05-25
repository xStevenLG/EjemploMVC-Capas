package view;

import model.Tarea;

import java.util.List;

public class VistaTarea {
    public void mostrarTareas(List<Tarea> tareas) {
        System.out.println("-------------");
        System.out.println("TAREAS:");
        System.out.println();
        for (int i = 0; i < tareas.size(); i++) {
            Tarea tarea = tareas.get(i);
            System.out.println((i + 1) + ". " + tarea.getDescripcion() + " ["
                    + (tarea.estaCompleta() ? "Completa" : "No Completa") + "]");
        }
        System.out.println("-------------");
    }

    public void mostrarMenu() {
        System.out.println("ADMIN. DE TAREAS");
        System.out.println("Seleccione una opcion:");
        System.out.println("1. Agregar Tarea");
        System.out.println("2. Completar Tarea");
        System.out.println("3. Mostrar Tareas");
        System.out.println("4. Salir");
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

