package pt5;

import java.util.ArrayList;
import java.util.List;

public class Negocio implements Remera {

    private List<Remera> ventas = new ArrayList<>();

    public void registrarVenta(Remera remera) {
        this.ventas.add(remera);
    }

    @Override
    public double calcularPrecioFinal() {
        double total = 0;
        for (Remera v : ventas) {
            total += v.calcularPrecioFinal();
        }
        return total;
    }
}
