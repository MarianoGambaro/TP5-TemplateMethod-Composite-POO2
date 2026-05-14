package pt3;

import java.util.ArrayList;
import java.util.List;

public class Paquete implements TipoSeguro {
    private static final double DESCUENTO = 0.05;
    private String nombre;
    private List<TipoSeguro> seguros;

    public Paquete(String nombre) {
        this.nombre = nombre;
        this.seguros = new ArrayList<>();
    }

    public void agregar(TipoSeguro seguro) {
        this.seguros.add(seguro);
    }

    @Override
    public double calcularCostoTotal() {
        double costo = 0;
        for (TipoSeguro s : seguros) {
            costo += s.calcularCostoTotal();
        }
        double cantidadDescuento = seguros.size() * DESCUENTO;
        return costo * (1 - cantidadDescuento);
    }
}
