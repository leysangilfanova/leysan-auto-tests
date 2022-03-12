import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class ChangeBranchTest {

    @BeforeEach
    public void setup(){
        //1. Открыть страницу https://github.com/
        open("https://github.com/");
        //2. Кликнуть на кнопку sign in
        TestPages.page.mainSignInButton()
                .click();
    }

    @Test
    public void changeBranchTest() {
        /**
         * Я не хочу свои логин и пароль палить, проверила все работает))
         */
        /*TestPages.page.loginInput()
                .sendKeys("testLogin");

        TestPages.page.passwordInput()
                .sendKeys("testPassword");

        TestPages.page.authButton()
                .click();*/

        open("https://github.com/junit-team/junit4");
        TestPages.page7dz.branchChangeButton()
                .shouldHave(text("main"))
                .click();

        TestPages.page7dz.branchList()
                .filter(text("fixtures"))
                .shouldHaveSize(1).first()
                .click();

        TestPages.page7dz.branchChangeButton()
                .shouldBe(visible)
                .shouldHave(text("fixtures"));
    }
}
