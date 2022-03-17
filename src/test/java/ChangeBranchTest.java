import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Feature("GitHub")
@Owner("lissamissa")
public class ChangeBranchTest {

    @BeforeEach
    public void setup() {
        step("Открыть страницу github.com", () -> {
            open("https://github.com/");
        });
        step("Кликнуть на кнопку sign in", () -> {
            TestPages.page.mainSignInButton()
                    .click();
        });
    }

    @Test
    @Story("Смена ветки")
    public void changeBranchTest() {
        String branchName = "fixtures";

        step("Открыть страницу репозитория", () -> {
            open("https://github.com/junit-team/junit4");
        });

        step("Нажать на название текущей ветки", () -> {
            TestPages.page7dz.branchChangeButton()
                    .shouldHave(text("main"))
                    .click();
        });

        step("Переключиться на другую ветку", () -> {
            TestPages.page7dz.branchList()
                    .filter(text(branchName))
                    .shouldHaveSize(1).first()
                    .click();
            step("Название текущей ветки сменилось на выбранную", () -> {
                TestPages.page7dz.branchChangeButton()
                        .shouldBe(visible)
                        .shouldHave(text(branchName));
            });
        });
    }
}
