package StepObject;

import PageObject.CvRegistration;
import com.codeborne.selenide.Condition;

public class CvRegistrationSteps extends CvRegistration {
    public CvRegistrationSteps goToCvRegistration() {
        goToCvRegistration.click();
        userOnRegisrtarionPage.shouldHave(Condition.text("სამუშაოს მაძიებლებისთვის"));
        return this;
    }
    public CvRegistrationSteps emailValue(String email){
        emailValue.setValue(email);
        emailValue.shouldNotBe(Condition.empty);
        return this;
    }
    public CvRegistrationSteps passwordValue(String password) {
        passwordValue.setValue(password);
        passwordValue.shouldNotBe(Condition.empty);
        return this;
    }
    public CvRegistrationSteps firstNameValue(String firstName) {
        firstNameValue.setValue(firstName);
        firstNameValue.shouldNotBe(Condition.empty);
        return this;
    }
    public CvRegistrationSteps lastNameValue(String lastName) {
        lastNameValue.setValue(lastName);
        lastNameValue.shouldNotBe(Condition.empty);
        return this;
    }
    public CvRegistrationSteps phoneValue(String phone_num) {
        phoneValue.setValue(phone_num);
        phoneValue.shouldNotBe(Condition.empty);
        return this;
    }
    public CvRegistrationSteps userNotRobot() {
        userNotRobot.click();
        return this;
    }
    public CvRegistrationSteps termsNconditionsValue() {
        termsNconditionsValue.click();
        return this;
    }
}
