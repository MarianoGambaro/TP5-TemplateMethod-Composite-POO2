package pt4;

public interface LogTransaction {
    //cree la interfaz log transaction para poder inyectarla
    //a la clase abstracta y asi desligarme de su implementacion
    void log(String mensaje);
}
