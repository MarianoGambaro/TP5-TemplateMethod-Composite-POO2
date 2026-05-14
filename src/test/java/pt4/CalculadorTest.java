package pt4;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadorTest {

    @Test
    public void testJubiladoFueraDePromocion() {
        //setup
        var fake = new FakeLog();
        int mesActual = LocalDate.now().getMonthValue();
        int mesPromocion = (mesActual == 12) ? 1 : mesActual + 1; // Un mes distinto al actual

        Calculador jubilado = new CalculadorJubilado(fake, mesPromocion);

        //ejec y verif
        assertEquals(110, jubilado.calcularPrecio(100));
        assertEquals(1, fake.cantidad());
    }

    @Test
    public void testNoJubiladoEnPromocion() {
        //setup
        var fake = new FakeLog();
        int mesActual = LocalDate.now().getMonthValue();
        //mes de promo forzado
        Calculador noJubilado = new CalculadorNoJubilado(fake, mesActual);

        //ejec y verif
        assertEquals(115.0, noJubilado.calcularPrecio(100.0), 0.01);
    }

}