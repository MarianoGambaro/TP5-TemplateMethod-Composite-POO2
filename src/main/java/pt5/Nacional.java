package pt5;

public class Nacional extends RemeraAbstracta {

    private static final double COSTO_TRANSPORTE = 0.015;
    private static final double BONIFICACION = 0.2;
    private static final double PORCENTAJE_COMERCIO = 0.15;

    public Nacional(double precioUnitario) {
        super(precioUnitario);
    }

    @Override
    protected double calcularRecargosYBonificaciones() {
        return (this.precioUnitario * COSTO_TRANSPORTE) - (this.precioUnitario * BONIFICACION);
    }

    @Override
    protected double porcentajeComercio() {
        return PORCENTAJE_COMERCIO;
    }
}

//Las remeras nacionales tienen un recargo de 1,5 % del costo de transporte y una bonificación
//del 20%. Por último el comercio aplica un 15% para determinar el precio final
