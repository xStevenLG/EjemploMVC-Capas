package main;

import controller.ControladorTarea;
import model.ModeloTarea;
import view.VistaTarea;

public class Main {
    public static void main(String[] args) {
        ModeloTarea modelo = new ModeloTarea();
        VistaTarea vista = new VistaTarea();
        ControladorTarea controlador = new ControladorTarea(modelo, vista);

        controlador.iniciar();
    }
}
