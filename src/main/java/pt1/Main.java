package pt1;

public class Main {
    static void main() {
        //uso el main como si fuese la empresa

        EmpleadoJerarquico director = new EmpleadoJerarquico("D", 500, TipoEmpleado.DIRECTOR);
        EmpleadoJerarquico gerente = new EmpleadoJerarquico("G", 400, TipoEmpleado.GERENTE);
        EmpleadoJerarquico mandoMedio = new EmpleadoJerarquico("M", 300, TipoEmpleado.MANDO_MEDIO);
        EmpleadoJerarquico liderProyecto = new EmpleadoJerarquico("L", 200, TipoEmpleado.LIDER_PROYECTO);
        EmpleadoRegular regular = new EmpleadoRegular("R", 100);

        director.agregarEmpleado(gerente);
        gerente.agregarEmpleado(mandoMedio);
        mandoMedio.agregarEmpleado(liderProyecto);
        liderProyecto.agregarEmpleado(regular);

        System.out.println(director.totalSalarial());
    }
}
