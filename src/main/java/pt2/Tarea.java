package pt2;

public class Tarea implements ItemProyecto {
    private String nombre;
    private double horas;

    public Tarea(String nombre, double horas) {
        this.nombre = nombre;
        this.horas = horas;
    }

    @Override
    public double calcularTiempoTotal() {
        return horas;
    }
}