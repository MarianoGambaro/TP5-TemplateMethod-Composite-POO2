package pt4;

import java.time.Month;

import static java.time.Month.of;

public class CalculadorNoJubilado extends CalculadorBase {

    public CalculadorNoJubilado(LogTransaction log, int mesEnPromocion) {
        super(log, mesEnPromocion);
    }

    public double calcularImpuesto(double precioProducto, Month mesActual) {
        if (of(mesEnPromocion).equals(mesActual)) {
            return precioProducto * 0.15;
        }
        return precioProducto * 0.21;
    }
}