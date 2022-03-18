package StepObject;

import PageObject.FavoriteVacancies;

public class FavoriteVacanciesSteps extends FavoriteVacancies {
    public FavoriteVacanciesSteps goToDetailSearch(){
        goToDetailSearch.click();
        return this;
    }
    public FavoriteVacanciesSteps chooseLocation(){
        chooseLocation.click();
        return this;
    }
    public FavoriteVacanciesSteps chooseCity(){
        chooseCity.click();
        return this;
    }
    public FavoriteVacanciesSteps chooseSalary(){
        chooseSalary.click();
        return this;
    }
    public FavoriteVacanciesSteps chooseMoney(){
        chooseMoney.click();
        return this;
    }
    public FavoriteVacanciesSteps chooseVacancy(){
        chooseVacancy.click();
        return this;
    }
    public FavoriteVacanciesSteps chooseOnlyVacancy(){
        chooseOnlyVacancy.click();
        return this;
    }
    public FavoriteVacanciesSteps chooseDate(){
        chooseDate.click();
        return this;
    }
    public FavoriteVacanciesSteps chooseExactDate(){
        chooseExactDate.click();
        return this;
    }
    public FavoriteVacanciesSteps pressSearch(){
        pressSearch.click();
        return this;
    }
    public FavoriteVacanciesSteps addFavoriteVacancy(){
        addFavoriteVacancy.click();
        return this;
    }
}
