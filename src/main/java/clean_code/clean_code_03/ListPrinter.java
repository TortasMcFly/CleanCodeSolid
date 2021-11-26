package clean_code.clean_code_03;

import java.util.ArrayList;

public class ListPrinter {
    public void printListOriginal(ArrayList<Materia> list) {
        for (Materia materia:list) {
            System.out.println(materia.getMateria());
        }
    }

    public void printListMinuscula(ArrayList<Materia> list) {
        for (Materia materia:list) {
            System.out.println(
                    convertirMinuscula(materia)
            );
        }
    }

    private String convertirMinuscula(Materia materia) {
        materia.setMateria(materia.getMateria().toLowerCase());
        return  materia.getMateria();
    }
}
