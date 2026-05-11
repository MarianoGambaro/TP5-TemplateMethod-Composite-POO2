package pt2;

public class Main {
    static void main() {
        Proyecto proyecto = new Proyecto("Proyect");

        HistoriaUsuario hu1 = new HistoriaUsuario("hu1");
        hu1.agregarTarea(new Tarea("t1", 7.0));
        hu1.agregarTarea(new Tarea("t2", 3.0));

        Spike spike = new Spike("spike", 8.0);

        proyecto.agregarItem(hu1);
        proyecto.agregarItem(spike);

        //Ejec
        System.out.println(proyecto.calcularTiempoTotal());

    }
}
