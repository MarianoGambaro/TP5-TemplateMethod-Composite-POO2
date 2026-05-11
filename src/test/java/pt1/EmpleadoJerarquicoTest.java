package pt1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EmpleadoJerarquicoTest {

    @Test
    public void testCalculoSalarialCorrectamenteConJerarquia() {
        //setup
        EmpleadoJerarquico director = new EmpleadoJerarquico("D", 500, TipoEmpleado.DIRECTOR);
        EmpleadoJerarquico gerente = new EmpleadoJerarquico("G", 400, TipoEmpleado.GERENTE);
        EmpleadoJerarquico mandoMedio = new EmpleadoJerarquico("M", 300, TipoEmpleado.MANDO_MEDIO);
        EmpleadoJerarquico liderProyecto = new EmpleadoJerarquico("L", 200, TipoEmpleado.LIDER_PROYECTO);
        EmpleadoRegular regular = new EmpleadoRegular("R", 100);
        //ejecucion
        director.agregarEmpleado(gerente);
        gerente.agregarEmpleado(mandoMedio);
        mandoMedio.agregarEmpleado(liderProyecto);
        liderProyecto.agregarEmpleado(regular);
        //verif
        assertEquals(1500, director.totalSalarial());
    }

    @Test
    public void testJerarquiaDeEmpleadosMalAplicada() {// Configuración
        //setup
        EmpleadoJerarquico director = new EmpleadoJerarquico("D", 5000, TipoEmpleado.DIRECTOR);
        EmpleadoRegular regular = new EmpleadoRegular("R", 800);
        //ejecucion y  verificacion
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            director.agregarEmpleado(regular);
        });

        String mensajeEsperado = "Un DIRECTOR solo puede tener a cargo a GERENTE";
        assertEquals(mensajeEsperado, exception.getMessage());
    }

}