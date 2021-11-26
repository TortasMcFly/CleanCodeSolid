package clean_code.clean_code_02;

public class FakeDatabase {

    public void guardarUsuario(Usuario usuario) {
        System.out.println("Usuario " + usuario.getNombre() + " guardado.");
    }

    public void actualizarUsuario(Usuario usuario) {
        System.out.println("Usuario " + usuario.getNombre() + " actualizado.");
    }

    public Usuario findUserByUserName(String name) {
        // do something
        return null;
    }

}
