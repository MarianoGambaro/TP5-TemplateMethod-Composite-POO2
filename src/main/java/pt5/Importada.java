package pt5;

public class Importada extends RemeraAbstracta {

    private static final double RECARGO = 0.03;
    private static final double IMPUESTO_ADUANERO = 0.05;
    private static final double PORCENTAJE_COMERCIO = 0.25;

    public Importada(double precioUnitario) {
        super(precioUnitario);
    }

    @Override
    protected double calcularRecargosYBonificaciones() {
        return (this.precioUnitario * RECARGO) + (this.precioUnitario * IMPUESTO_ADUANERO);
    }

    @Override
    protected double porcentajeComercio() {
        return PORCENTAJE_COMERCIO;
    }
}

//las remeras importadas sobre el precio unitario
//tienen un 3% de recargo más un 5% de impuesto aduanero. Por último el comercio aplica un
//25% para determinar el precio final.
