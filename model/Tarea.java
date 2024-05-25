package model;

public class Tarea {
    private String descripcion;
    private boolean estaCompleta;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        estaCompleta = false;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean estaCompleta() {
        return estaCompleta;
    }

    public void setCompleta(boolean estaCompleta) {
        this.estaCompleta = estaCompleta;
    }
}

