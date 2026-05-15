package pt5;

public class Main {
    static void main() {
        Negocio negocio = new Negocio();
        var remeraImportada = new Importada(2000);
        var remeraNacional = new Nacional(800);

        negocio.registrarVenta(remeraImportada);
        negocio.registrarVenta(remeraNacional);

        System.out.println(negocio.calcularPrecioFinal());
    }
}
