package clean_code.clean_code_01;

public class CleanCode01 {
    public static void main(String [] args) {
        InfoPersona infoPersona = new InfoPersona(
          "Hector",
          "Luevano",
          "Villanueva",
          24,
          "CON LICENCIA"
        );

        if(infoPersona.edad() < 18 || infoPersona.licConduc() == null) {
            arrestar(infoPersona);
        }
    }

    private static void arrestar(InfoPersona infoPersona) {
        // TODO implementar arresto persona
    }
}
