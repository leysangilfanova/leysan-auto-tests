import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class ProfileTest {
    @Test
    public void shouldAuthTest() {

        /**
         * Я не хочу свои логин и пароль палить, проверила все работает))
         */
            /*open("https://github.com/");
            $("[href='/login']")
            .click();
            $("#login_field")
            .sendKeys("testLogin");
            $("#password")
            .sendKeys("testPassword");
            $(".js-sign-in-button")
            .click();*/

        open("https://github.com/leysangilfanova");
        $(".p-nickname")
                .shouldBe(visible)
                .shouldHave(text("leysangilfanova"));
    }
}
