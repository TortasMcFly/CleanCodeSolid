package stupid;

public class StupidMain {

    public static void main(String [] args) {

        int result = DatabaseHelper.executeQuery("SELECT * FROM users WHERE id = 5");

    }

}
