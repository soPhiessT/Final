package FinalHR;

import StepObject.CvRegistrationSteps;
import Utils.Runner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.CvRegistrationData.*;
import static DataObject.CvRegistrationData.phone;

public class CvRegistration extends Runner {
        @Test
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
                .termsNconditionsValue();
    }

}
