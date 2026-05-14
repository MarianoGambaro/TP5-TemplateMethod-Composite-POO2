package pt3;

public class Main {
    static void main() {
        GestionSeguros app = new GestionSeguros();
        //seguros individuales
        Seguro hogar = new Seguro("Hogar", 1000);
        Seguro vida = new Seguro("Vida", 500);
        Seguro auto = new Seguro("Auto", 1500);

        //paquete
        Paquete p1 = new Paquete("Combo Familiar");
        p1.agregar(hogar);
        p1.agregar(vida);

        //agregar a seguros activos / venta
        app.agregarSeguro(p1);
        app.agregarSeguro(auto);

        System.out.println("Costo Combo Familiar: $" + p1.calcularCostoTotal());
        System.out.println("Costo Seguro Auto: $" + auto.calcularCostoTotal());
        System.out.println("------------------------------------");
        System.out.println("Ingresos Totales de la Empresa: $" + app.calcularCostoTotal());
    }
}
