package StepObject;

import PageObject.FavoriteVacancies;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FavoriteVacanciesSteps extends FavoriteVacancies {
    public FavoriteVacanciesSteps goToDetailSearch() {
        goToDetailSearch.click();
        return this;
    }

    public FavoriteVacanciesSteps chooseLocation() {
        chooseLocation.click();
        return this;
    }

    public FavoriteVacanciesSteps chooseCity() {
        chooseCity.click();
        return this;
    }

    public FavoriteVacanciesSteps chooseSalary() {
        chooseSalary.click();
        return this;
    }

    public FavoriteVacanciesSteps chooseMoney() {
        chooseMoney.click();
        return this;
    }

    public FavoriteVacanciesSteps chooseVacancy() {
        chooseVacancy.click();
        return this;
    }

    public FavoriteVacanciesSteps chooseOnlyVacancy() {
        chooseOnlyVacancy.click();
        return this;
    }

    public FavoriteVacanciesSteps chooseDate() {
        chooseDate.click();
        return this;
    }

    public FavoriteVacanciesSteps chooseExactDate() {
        chooseExactDate.click();
        return this;
    }

    public FavoriteVacanciesSteps pressSearch() {
        pressSearch.click();
        return this;
    }

    public FavoriteVacanciesSteps addFavoriteVacancy() {
        addFavoriteVacancy.exists();
        int add = $$(".ann-heart-icon").size();
        for (int i = 0; i < 6; i++) {
            $$(".ann-heart-icon").get(i).click();

        }
        return this;
    }

    public FavoriteVacanciesSteps goToFavorites() {
        goToFavorites.click();
        return this;
    }

    public FavoriteVacanciesSteps sendCV() {
        sendCV.exists();
        int send = $$(byText("გაგზავნე CV")).size();
        for (int i = 0; i < 6; i++) {
            $$(byText("გაგზავნე CV")).get(i).click();

        }
        return this;
    }
}
