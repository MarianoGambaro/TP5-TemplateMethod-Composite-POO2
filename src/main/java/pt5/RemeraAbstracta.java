package pt5;

public abstract class RemeraAbstracta implements Remera {

    double precioUnitario;

    public RemeraAbstracta(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public double calcularPrecioFinal() {
        double subtotal = precioUnitario + calcularRecargosYBonificaciones();
        return subtotal + (subtotal * porcentajeComercio());
    }

    protected abstract double calcularRecargosYBonificaciones();

    protected abstract double porcentajeComercio();
}
