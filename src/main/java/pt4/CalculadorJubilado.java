package pt4;

import java.time.Month;

import static java.time.Month.of;

public class CalculadorJubilado extends CalculadorBase {

    public CalculadorJubilado(LogTransaction log, int mesEnPromocion) {
        super(log, mesEnPromocion);
    }

    public double calcularImpuesto(double precioProducto, Month mesActual) {
        if (!of(mesEnPromocion).equals(mesActual)) {
            return precioProducto * 0.1;
        }
        return 0;
    }
}