package pt4;

public class FakeLog implements LogTransaction {

    private int cantidadLog;


    @Override
    public void log(String mensaje) {
        cantidadLog++;
    }

    public int cantidad() {
        return cantidadLog;
    }
}
