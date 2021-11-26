package clean_code.clean_code_05;

public class CleanCode05 {
    public static void main(String [] args) {

        Empleado empleado = new Empleado(
                "Hector Luevano",
                65,
                true
        );

        // Chequear si el empleado deberá recibir beneficios completos
        if(empleado.getEdad() > 65 && empleado.isSenior()) {
            System.out.println("Asignar beneficios");
        }

        //if(empleado.isEligibleForFullBenefits()) {
        //    System.out.println("Asignar beneficios");
        //}
    }
}
