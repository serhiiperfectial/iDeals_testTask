package modules;

import com.codeborne.selenide.Condition;
import home_page.HomePage;
import login_page.LoginPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Header {
    private final By headerRow = By.cssSelector("header .nav .row");

    public LoginPage clickSignIn() {
        $(headerRow).find(".login").click();
        return new LoginPage();
    }

    public HomePage clickSignOut() {
        $(headerRow).find(".logout").click();
        return new HomePage();
    }

    public String getLogoutURL() {
        return $(headerRow).find(".logout").getAttribute("href");
    }

    public void verifyUserLoggedOut() {
        $(headerRow).find(".login").shouldHave(Condition.text("Sign in"));
    }

}
