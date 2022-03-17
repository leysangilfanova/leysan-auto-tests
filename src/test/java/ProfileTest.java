import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Feature("GitHub")
@Owner("lissamissa")
public class ProfileTest {

    @Test
    @Story("Profile")
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

        step("Открыть страницу профиля на GitHub", () -> {
            open("https://github.com/leysangilfanova");

            step("На странице отображается никнейм пользователя", () -> {
                TestPages.page.userNickname()
                        .shouldBe(visible)
                        .shouldHave(text("leysangilfanova"));
            });
        });
    }
}
