package pt3;

public class Seguro implements TipoSeguro {

    private String nombre;
    private double costo;

    public Seguro(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    @Override
    public double calcularCostoTotal() {
        return costo;
    }
}
