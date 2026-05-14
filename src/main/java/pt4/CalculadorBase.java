package pt4;

import java.time.LocalDate;
import java.time.Month;

public abstract class CalculadorBase implements Calculador {

    protected LogTransaction log;
    protected int mesEnPromocion;

    public CalculadorBase(LogTransaction log, int mesEnPromocion) {
        this.log = log;
        this.mesEnPromocion = mesEnPromocion;
    }

    public double calcularPrecio(double precioProducto) {
        double precioTotal = precioProducto + calcularImpuesto(precioProducto, LocalDate.now().getMonth());
        log.log(CalculadorJubilado.class.getName());
        return precioTotal;
    }

    protected abstract double calcularImpuesto(double precio, Month mesActual);
}
