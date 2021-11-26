package clean_code.clean_code_06;

public class CleanCode06 {
    public static void main(String [] args) {

        String email = "micorreo.com";
        String password = null; //"1234";

        if(isValidEmail(email)) {
            System.out.println("Email válido");
        }

        if(isValidPassword(password)) {
            System.out.println("Password válida");
        }

        /*
        try {
            isValidEmail2(email);
            isValidPassword2(password);
        } catch (EmailException e) {
            System.out.println(e.getLocalizedMessage());
        } catch (PasswordException e) {
            System.out.println(e.getLocalizedMessage());
            System.out.println("Vuelve a introducir tu password");
        }
         */

    }

    private static boolean isValidEmail(String email) {
        return email.contains("@");
    }

    private static boolean isValidPassword(String password) {
        return !password.isEmpty() && password.length() >= 5;
    }






    private static void isValidEmail2(String email) throws EmailException {
        if(email.contains("@")) return;

        throw new EmailException("Email no es válido");
    }

    private static void isValidPassword2(String password) throws PasswordException {
        if(!password.isEmpty() && password.length() >= 5) return;

        throw new PasswordException("Password no es válida");
    }
}
