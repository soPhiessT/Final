package FinalHR;

import StepObject.FavoriteVacanciesSteps;
import Utils.Runner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class AddFavoriteVacancies extends Runner {


 @Test
 public void FavoriteVacancies(){
     FavoriteVacanciesSteps Steps = new FavoriteVacanciesSteps();
        Steps
                .goToDetailSearch()
                .chooseLocation()
                .chooseCity();
        Assert.assertTrue(Steps.chooseCity.exists());
        Steps
                .chooseSalary()
                .chooseMoney();
        Assert.assertTrue(Steps.chooseMoney.exists());
        Steps
                .chooseVacancy()
                .chooseOnlyVacancy();
        Assert.assertTrue(Steps.chooseExactDate.exists());
        Steps
                .chooseDate()
                .chooseExactDate();
        Assert.assertTrue(Steps.chooseExactDate.exists());
        Steps
                .pressSearch();
        int add = $$(".ann-heart-icon").size();
        for (int i = 0; i < add; i++){
            $$(".ann-heart-icon").get(i).click();

                    }


 }
}
