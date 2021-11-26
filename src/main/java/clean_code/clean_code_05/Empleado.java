package clean_code.clean_code_05;

public class Empleado {
    private final int EDAD_BENEFICIOS = 65;

    private String nombre;
    private int edad;
    private boolean isSenior;

    public Empleado(String nombre, int edad, boolean isSenior) {
        this.nombre = nombre;
        this.edad = edad;
        this.isSenior = isSenior;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isSenior() {
        return isSenior;
    }

    /*public boolean isEligibleForFullBenefits() {
        return isSenior && edad > EDAD_BENEFICIOS;
    }*/
}
