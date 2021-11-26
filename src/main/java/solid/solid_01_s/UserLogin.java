package solid.solid_01_s;

import clean_code.clean_code_02.FakeDatabase;
import clean_code.clean_code_02.Usuario;

public class UserLogin {

    private FakeDatabase fakeDatabase;

    public UserLogin(FakeDatabase fakeDatabase) {
        this.fakeDatabase = fakeDatabase;
    }

    void login(String userName, String password) {
        Usuario user = fakeDatabase.findUserByUserName(userName);
        if (user == null) {
            // do something
        }
        // login process..
    }

    void sendEmail(Usuario user, String msg) {
        // sendEmail email to user
    }
}
