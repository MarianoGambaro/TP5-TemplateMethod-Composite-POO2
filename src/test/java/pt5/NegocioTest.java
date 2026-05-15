package pt5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NegocioTest {

    @Test
    public void testPecioDeImportadas() {
        Negocio negocio = new Negocio();
        Remera importada = new Importada(100);
        negocio.registrarVenta(importada);
        //recargos: 3 + 5 = 8 - Subtotal = 108
        //margen: 25% de 108 = 27 - Total = 135
        assertEquals(135.0, negocio.calcularPrecioFinal());
    }


    @Test
    public void testPrecioDeNacionales() {
        Negocio negocio = new Negocio();
        Remera nacional = new Nacional(100);
        negocio.registrarVenta(nacional);
        //recargos/Bonif: 1,5 - 20 = -18,5 - Subtotal: 81,5
        //margen 15% de 81,5 = 12,225 - Total: 93,725
        assertEquals(93.725, negocio.calcularPrecioFinal());
    }
}