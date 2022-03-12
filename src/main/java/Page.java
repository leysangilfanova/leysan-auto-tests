import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Page {

    public SelenideElement mainSignInButton() {
        return $("[href='/login']").as("кнопка логина");
    }

    public SelenideElement loginInput() {
        return $("#login_field").as("поле для ввода логина");
    }

    public SelenideElement passwordInput() {
        return $("#password").as("поле для ввода пароля");
    }

    public SelenideElement authButton() {
        return $(".js-sign-in-button").as("кнопка авторизации");
    }

    public SelenideElement userNickname() {
        return $(".p-nickname").as("никнейм пользователя");
    }
}
