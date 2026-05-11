package pt2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProyectoTest {

    @Test
    void testCalculoTiempoHistoriaUsuario() {
        //setup
        HistoriaUsuario historia = new HistoriaUsuario("H");

        historia.agregarTarea(new Tarea("T1", 4.0));
        historia.agregarTarea(new Tarea("T2", 6.5));
        historia.agregarTarea(new Tarea("T3", 2.0));
        //Ejec
        double tiempoTotal = historia.calcularTiempoTotal();

        //Verif
        assertEquals(12.5, tiempoTotal);
    }

    @Test
    void testCalculoTiempoProyectoCompleto() {
        // 1. Setup: Crear la estructura completa
        Proyecto proyecto = new Proyecto("Proyect");

        HistoriaUsuario hu1 = new HistoriaUsuario("hu1");
        hu1.agregarTarea(new Tarea("t1", 7.0));
        hu1.agregarTarea(new Tarea("t2", 3.0));

        Spike spike = new Spike("spike", 8.0);

        proyecto.agregarItem(hu1);
        proyecto.agregarItem(spike);

        //Ejec
        double tiempoTotalProyecto = proyecto.calcularTiempoTotal();

        //Veriific
        assertEquals(18.0, tiempoTotalProyecto);
    }
}