import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class ProfileTest {

    @Test
    public void shouldAuthTest() {
        /**
         * Я не хочу свои логин и пароль палить, проверила все работает))
         */
        /*TestPages.page.loginInput()
                .sendKeys("testLogin");

        TestPages.page.passwordInput()
                .sendKeys("testPassword");

        TestPages.page.authButton()
                .click();*/

        open("https://github.com/leysangilfanova");
        TestPages.page.userNickname()
                .shouldBe(visible)
                .shouldHave(text("leysangilfanova"));
    }
}
