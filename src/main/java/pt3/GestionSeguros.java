package pt3;

import java.util.ArrayList;
import java.util.List;

public class GestionSeguros implements TipoSeguro {

    private List<TipoSeguro> segurosActivos;

    public GestionSeguros() {
        this.segurosActivos = new ArrayList<>();
    }

    public void agregarSeguro(TipoSeguro seguroOPaquete) {
        this.segurosActivos.add(seguroOPaquete);
    }

    @Override
    public double calcularCostoTotal() {
        double costo = 0;
        for (TipoSeguro s : segurosActivos) {
            costo += s.calcularCostoTotal();
        }
        return costo;
    }
}
