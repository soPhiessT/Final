package FinalHR;

import StepObject.UserLoginSteps;
import Utils.Runner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.CvRegistrationData.email;
import static DataObject.CvRegistrationData.password;
import static DataObject.LoginData.*;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;

public class LogIn extends Runner {
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("UserLogIn")
    public void UserLogIn(){
        UserLoginSteps Steps = new UserLoginSteps();
        Steps
                .goToLogIn();
        Assert.assertTrue(Steps.userOnLoginPage.isDisplayed());
        Steps
                .emailInput(email);
        Assert.assertEquals(Steps.emailInput.getValue(), email);
        Steps
                .passwordInput(password);
        Assert.assertEquals(Steps.passwordInput.getValue(), password);
        Steps
                .userLogIn();


    }
    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("UserLogInWrong")
    public void UserLogInWrong(){
        UserLoginSteps Steps = new UserLoginSteps();
    Steps
            .goToLogIn();
    Assert.assertTrue(Steps.userOnLoginPage.isDisplayed());
    Steps
            .emailInput();
    Assert.assertEquals(Steps.emailInput.getValue(), wrongEmail);
    Steps
            .passwordInput(password);
    Assert.assertEquals(Steps.passwordInput.getValue(), password);
    Steps
            .userLogIn()
            .wrongLogIn();
    Assert.assertTrue(Steps.wrongLogIn.isDisplayed());
    Steps
            .userWrongLogIn();
        Assert.assertTrue(Steps.userWrongLogIn.isDisplayed());


    }
    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("UserLogInWrong2")
    public void UserLogInWrong2(){
        UserLoginSteps Steps = new UserLoginSteps();
        Steps
                .goToLogIn();
        Assert.assertTrue(Steps.userOnLoginPage.isDisplayed());
        Steps
                .emailInput(email);
        Assert.assertEquals(Steps.emailInput.getValue(), email);
        Steps
                .passwordInput();
        Assert.assertEquals(Steps.passwordInput.getValue(), wrongPassword);
        Steps
                .userLogIn()
                .wrongLogIn();
        Assert.assertTrue(Steps.wrongLogIn.isDisplayed());
        Steps
                .userWrongLogIn();
        Assert.assertTrue(Steps.userWrongLogIn.isDisplayed());
    }

}
