import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SearchReleaseTest {

    @MethodSource("releasesSearch")
    @ParameterizedTest(name = "{displayName} по {0}")
    @DisplayName("Поиск релиза по")
    void changeBranchTest(String type, String searchData) {

        open("https://github.com/junit-team/junit4");

        TestPages.page7dz.releasesButton()
                .click();

        TestPages.page7dz.releaseNameInput()
                .sendKeys(searchData);

        TestPages.page7dz.releaseNameInput()
                .pressEnter();

        TestPages.page7dz.releasesList()
                .filter(text(searchData))
                .shouldHave(sizeGreaterThanOrEqual(1)).first()
                .shouldBe(visible);
    }

    static Stream<Arguments> releasesSearch() {
        return Stream.of(
                arguments("номеру", "4.13.1"),
                arguments("буквам", "Beta 2")
        );
    }
}
