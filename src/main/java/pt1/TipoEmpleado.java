package pt1;

public enum TipoEmpleado {
    DIRECTOR, GERENTE, MANDO_MEDIO, LIDER_PROYECTO, REGULAR;

    // Retorna el tipo de empleado que este tipo puede tener a cargo
    public TipoEmpleado estoyACargoDe() {
        switch (this) {
            case DIRECTOR:
                return GERENTE;
            case GERENTE:
                return MANDO_MEDIO;
            case MANDO_MEDIO:
                return LIDER_PROYECTO;
            case LIDER_PROYECTO:
                return REGULAR;
            default:
                return null; // El Regular no puede tener a nadie
        }
    }
}
