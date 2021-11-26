package clean_code.clean_code_02;

public class CleanCode02 {

    public static void main(String [] args) {
        Usuario usuario = new Usuario("Hector Luevano");
        usuario.guardarEnBD();

        usuario.setNombre("Hector Villanueva");
        usuario.actualizarEnBD();

        //FakeDatabase fakeDatabase = new FakeDatabase();
        //fakeDatabase.guardarUsuario(usuario);
        //usuario.setNombre("Hector Villanueva");
        //fakeDatabase.actualizarUsuario(usuario);
    }
}
