package pt2;

public class Spike implements ItemProyecto {

    private String nombre;
    private double horas;

    public Spike(String nombre, double horas) {
        this.nombre = nombre;
        this.horas = horas;
    }

    @Override
    public double calcularTiempoTotal() {
        return horas;
    }
}