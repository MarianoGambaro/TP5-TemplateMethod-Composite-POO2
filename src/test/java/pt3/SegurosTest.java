package pt3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SegurosTest {

    @Test
    public void testPaqueteConSeguros() {
        Seguro s1 = new Seguro("s1", 1000);
        Seguro s2 = new Seguro("s2", 500);
        Seguro s3 = new Seguro("s3", 200);

        Paquete p = new Paquete("p");
        p.agregar(s1);
        p.agregar(s2);
        p.agregar(s3);

        assertEquals(1445, p.calcularCostoTotal());
    }

    @Test
    public void testPaquetesConPaquetesDeSeguros() {
        //paquete simple
        Paquete paqueteSimple = new Paquete("p");
        paqueteSimple.agregar(new Seguro("Vida", 1000));
        paqueteSimple.agregar(new Seguro("Medico", 1000));
        // Total comboBase = 1800

        //paquete que incluye el anterior y un seguro mas
        Paquete paquetePro = new Paquete("p");
        paquetePro.agregar(paqueteSimple); // Item 1
        paquetePro.agregar(new Seguro("Auto", 2000));

        //1800 (paquete) + 2000 (auto) = 3800
        //Descuento(2 items = 10%): 3800 * 0.10 = 380
        // Total final: 3420
        assertEquals(3420, paquetePro.calcularCostoTotal());
    }
}