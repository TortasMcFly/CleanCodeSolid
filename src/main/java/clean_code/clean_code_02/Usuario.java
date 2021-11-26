package clean_code.clean_code_02;

public class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void guardarEnBD() {
        System.out.println("Usuario " + nombre + " guardado.");
    }

    public void actualizarEnBD() {
        System.out.println("Usuario " + nombre + " actualizado.");
    }
}
