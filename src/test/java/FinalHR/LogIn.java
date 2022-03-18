package FinalHR;

import StepObject.UserLoginSteps;
import Utils.Runner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.CvRegistrationData.email;
import static DataObject.CvRegistrationData.password;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;

public class LogIn extends Runner {
    @Test
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
}
