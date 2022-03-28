package FinalHR;

import StepObject.CvRegistrationSteps;
import Utils.Runner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;


import static DataObject.CvRegistrationData.*;
import static DataObject.CvRegistrationData.phone;
import static com.codeborne.selenide.Selenide.sleep;

public class CvRegistration extends Runner {
        @Test
        @Severity(SeverityLevel.CRITICAL)
        @Description ("successful registration")
    public void cvRegistration(){
        CvRegistrationSteps Steps = new CvRegistrationSteps();
        Steps
                .goToCvRegistration();
        Assert.assertTrue(Steps.userOnRegisrtarionPage.isDisplayed());

        Steps
                .emailValue(email);
        Assert.assertEquals(Steps.emailValue.getValue(), email);
        Steps
                .passwordValue(password);
        Assert.assertEquals(Steps.passwordValue.getValue(), password);
        Steps
                .firstNameValue(name);
        Assert.assertEquals(Steps.firstNameValue.getValue(), name);

        Steps
                .lastNameValue(surname);
        Assert.assertEquals(Steps.lastNameValue.getValue(),surname);
        Steps
                .phoneValue(phone);
        Assert.assertEquals(Steps.phoneValue.getValue(), phone);
        Steps
                .userNotRobot();
        Steps
                .termsNconditionsValue()
                .registrationSubmit();

        sleep(10000);
    }
    @Test
    @Severity(SeverityLevel.MINOR)
    @Description ("not successful registration")
    public void wrongRegistrationValues(){
        CvRegistrationSteps Steps = new CvRegistrationSteps();
        Steps
                .goToCvRegistration();
        Assert.assertTrue(Steps.userOnRegisrtarionPage.isDisplayed());
        Steps
                .emailValue(".");
        Assert.assertEquals(Steps.emailValue.getValue(), wrongEmail);

        Steps
                .passwordValue(".");
        Assert.assertEquals(Steps.passwordValue.getValue(), wrongPassword);
        Steps
                .firstNameValue(".");
        Assert.assertEquals(Steps.firstNameValue.getValue(), wrongFirstName);
        Steps
                .lastNameValue(".");
        Assert.assertEquals(Steps.lastNameValue.getValue(), wrongLastName);
        Steps
                .phoneValue(".");
        Assert.assertEquals(Steps.phoneValue.getValue(), wrongPhone );
        Steps
                .userNotRobot()
                .termsNconditionsValue()
                .registrationSubmit();

}
@Test
@Severity(SeverityLevel.MINOR)
@Description("not successful registration 2")
    public void secondWrongValue(){
    CvRegistrationSteps Steps = new CvRegistrationSteps();
    Steps
            .goToCvRegistration();
    Assert.assertTrue(Steps.userOnRegisrtarionPage.isDisplayed());

    Steps
            .emailValue(email);
    Assert.assertEquals(Steps.emailValue.getValue(), email);
    Steps
            .passwordValue(password);
    Assert.assertEquals(Steps.passwordValue.getValue(), password);
    Steps
            .firstNameValue(name);
    Assert.assertEquals(Steps.firstNameValue.getValue(), name);

    Steps
            .lastNameValue(surname);
    Assert.assertEquals(Steps.lastNameValue.getValue(),surname);
    Steps
            .phoneValue(phone);
    Assert.assertEquals(Steps.phoneValue.getValue(), phone);
    Steps
            .termsNconditionsValue()
            .registrationSubmit();
    Assert.assertTrue(Steps.wrongSubmit.isDisplayed());
}

}
