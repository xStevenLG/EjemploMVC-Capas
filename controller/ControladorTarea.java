package controller;

import model.ModeloTarea;
import view.VistaTarea;

import java.util.Scanner;

public class ControladorTarea {
    private ModeloTarea modelo;
    private VistaTarea vista;

    public ControladorTarea(ModeloTarea modelo, VistaTarea vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        boolean ejecutando = true;

        while (ejecutando) {
            vista.mostrarMenu();
            int eleccion = scanner.nextInt();
            scanner.nextLine(); // consume la nueva línea

            switch (eleccion) {
                case 1:
                    vista.mostrarMensaje("Ingrese la descripción de la tarea:");
                    String descripcion = scanner.nextLine();
                    modelo.agregarTarea(descripcion);
                    vista.mostrarMensaje("--> Tarea agregada.");
                    vista.mostrarMensaje("-------------");
                    break;
                case 2:
                    vista.mostrarMensaje("Ingrese el número de la tarea a completar:");
                    int numeroTarea = scanner.nextInt();
                    modelo.completarTarea(numeroTarea - 1);
                    vista.mostrarMensaje("Tarea completada.");
                    vista.mostrarMensaje("-------------");
                    vista.mostrarTareas(modelo.getTareas());
                    break;
                case 3:
                    vista.mostrarTareas(modelo.getTareas());
                    break;
                case 4:
                    ejecutando = false;
                    break;
                default:
                    vista.mostrarMensaje("Elección inválida. Por favor, intente de nuevo.");
            }
        }
        scanner.close();
    }
}
