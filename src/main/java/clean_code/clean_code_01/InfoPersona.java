package clean_code.clean_code_01;

public class InfoPersona {

    // Nombre del cliente
    private String nom;
    // Apellido paterno del cliente
    private String app;
    // Apellido materno del cliente
    private String apm;
    // Edad del cliente
    private int edad;
    // Licencia de conducir
    private String licConduc;

    public InfoPersona(String nom, String app, String apm, int edad, String licConduc) {
        this.nom = nom;
        this.app = app;
        this.apm = apm;
        this.edad = edad;
        this.licConduc = licConduc;
    }

    public int edad() {
        return edad;
    }

    public String licConduc() {
        return licConduc;
    }
}
