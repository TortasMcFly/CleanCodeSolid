package clean_code.clean_code_03;

import java.util.ArrayList;

public class CleanCode03 {

    public static void main(String []args) {
        ArrayList<Materia> materias = new ArrayList<>();
        materias.add(new Materia("Matemáticas"));
        materias.add(new Materia("Español"));
        materias.add(new Materia("Inglés"));
        materias.add(new Materia("Física"));

        ListPrinter listPrinter = new ListPrinter();

        listPrinter.printListOriginal(materias);

        System.out.println();

        listPrinter.printListMinuscula(materias);

        System.out.println();

        listPrinter.printListOriginal(materias);
    }

}
