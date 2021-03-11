package tests.login_logout;

import com.codeborne.selenide.Selenide;
import home_page.HomePage;
import modules.Header;
import org.junit.jupiter.api.Test;
import tests.ConfigurationFile;

public class AuthenticationTests extends ConfigurationFile {

    @Test
    void logoutByUi() {
        Selenide.open("http://automationpractice.com/index.php");
        String email = "sk_testuser@mailinator.com";
        String password = "qwerty";
        new HomePage().header.clickSignIn()
                .loginAsUser(email, password);

        new Header().clickSignOut();
        new Header().verifyUserLoggedOut();
    }

    @Test
    void logoutByUrl() {
        Selenide.open("http://automationpractice.com/index.php");
        String email = "sk_testuser@mailinator.com";
        String password = "qwerty";
        new HomePage().header.clickSignIn()
                .loginAsUser(email, password);

        String logoutURL = new Header().getLogoutURL();
        Selenide.open(logoutURL);
        new HomePage().header.verifyUserLoggedOut();
    }
}
