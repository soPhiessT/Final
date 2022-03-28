package FinalHR;

import PageObject.UserLogIn;
import StepObject.FavoriteVacanciesSteps;
import StepObject.UserLoginSteps;
import Utils.Runner;
import Utils.TestListener;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static DataObject.CvRegistrationData.email;
import static DataObject.CvRegistrationData.password;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class AddFavoriteVacancies extends Runner  {

 @Test
 @Severity(SeverityLevel.CRITICAL)
 @Description("Finds and saves Favorite Vacancies")

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
                .pressSearch()
                .addFavoriteVacancy()
                .goToFavorites();


     }


 }

