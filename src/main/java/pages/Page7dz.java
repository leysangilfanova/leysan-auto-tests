package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Page7dz {

    public SelenideElement branchChangeButton() {
        return $("[title='Switch branches or tags']").as("кнопка смены ветки");
    }

    public ElementsCollection branchList() {
        return $$(".SelectMenu-list a");
    }

    public SelenideElement releasesButton() {
        return $("[data-pjax='#repo-content-pjax-container'] .Link--primary").as("кнопка релизы");
    }

    public SelenideElement releaseNameInput() {
        return $("input[type='search']").as("поле для ввода названия релиза");
    }

    public ElementsCollection releasesList() {
        return $$("[data-pjax] [data-test-selector='release-card']");
    }

}
