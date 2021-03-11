package login_page;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private LoginPage enterEmail(String email) {
        $("#login_form #email").val(email);
        return this;
    }

    private LoginPage enterPassword(String password) {
        $("#login_form #passwd").val(password);
        return this;
    }

    public void loginAsUser(String email, String password) {
        enterEmail(email).enterPassword(password);
        $("#SubmitLogin").click();
    }
}
