package pt2;

import java.util.ArrayList;
import java.util.List;

public class HistoriaUsuario implements ItemProyecto {

    //historia de usuario podria tener horas ademas de las horas de las tareas
    //en este caso asumo que solo se usan las horas de sus tareas.

    private String nombre;
    private List<Tarea> tareas;

    public HistoriaUsuario(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    @Override
    public double calcularTiempoTotal() {
        double total = 0;
        for (Tarea t : tareas) {
            total += t.calcularTiempoTotal();
        }
        return total;
    }

    public void agregarTarea(Tarea tarea) {
        this.tareas.add(tarea);
    }

}
