package pt2;

import java.util.ArrayList;
import java.util.List;

public class Proyecto implements ItemProyecto {

    private String nombre;
    private List<ItemProyecto> itemsDeTrabajo;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.itemsDeTrabajo = new ArrayList<>();
    }

    public void agregarItem(ItemProyecto item) {
        this.itemsDeTrabajo.add(item);
    }

    @Override
    public double calcularTiempoTotal() {
        double total = 0;
        for (ItemProyecto i : itemsDeTrabajo) {
            total += i.calcularTiempoTotal();
        }
        return total;
    }
}
