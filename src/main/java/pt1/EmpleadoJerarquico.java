package pt1;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoJerarquico implements Empleado {

    private String nombre;
    private double salario;
    private List<Empleado> empleados;
    private TipoEmpleado tipoEmpleado;

    public EmpleadoJerarquico(String nombre, double salario, TipoEmpleado tipo) {
        if (tipo == TipoEmpleado.REGULAR) {
            throw new RuntimeException("Un EmpleadoRegular no puede ser Jerarquico.");
        }
        this.nombre = nombre;
        this.salario = salario;
        this.tipoEmpleado = tipo;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        if (!(empleado.miCargoEs() == tipoEmpleado.estoyACargoDe())) {
            throw new RuntimeException("Un " + tipoEmpleado + " solo puede tener a cargo a " + tipoEmpleado.estoyACargoDe());
        }
        this.empleados.add(empleado);
    }

    @Override
    public double totalSalarial() {
        double total = this.salario;
        for (Empleado e : empleados) {
            total += e.totalSalarial();
        }
        return total;
    }

    @Override
    public TipoEmpleado miCargoEs() {
        return tipoEmpleado;
    }
}
