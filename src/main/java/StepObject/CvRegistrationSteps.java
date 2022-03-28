package StepObject;

import PageObject.CvRegistration;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class CvRegistrationSteps extends CvRegistration {
    public CvRegistrationSteps goToCvRegistration() {
        goToCvRegistration.click();
        userOnRegisrtarionPage.shouldHave(Condition.text("სამუშაოს მაძიებლებისთვის"));
        return this;
    }
    @Step ("CvRegistration email is {email}")
    public CvRegistrationSteps emailValue(String email){
        emailValue.setValue(email);
        emailValue.shouldNotBe(Condition.empty);
        return this;
    }
    @Step ("CvRegistration passwordValue is {password}")
    public CvRegistrationSteps passwordValue(String password) {
        passwordValue.setValue(password);
        passwordValue.shouldNotBe(Condition.empty);
        return this;
    }
    @Step ("CvRegistration firstNameValue is {firstName}")
    public CvRegistrationSteps firstNameValue(String firstName) {
        firstNameValue.setValue(firstName);
        firstNameValue.shouldNotBe(Condition.empty);
        return this;
    }
    @Step ("CvRegistration lastNameValue is {lastName}")
    public CvRegistrationSteps lastNameValue(String lastName) {
        lastNameValue.setValue(lastName);
        lastNameValue.shouldNotBe(Condition.empty);
        return this;
    }
    @Step ("CvRegistration phoneValue is {phone_num}")
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
    public CvRegistrationSteps registrationSubmit(){
        registrationSubmit.click();
        return this;
    }
    public CvRegistrationSteps wrongEmail(){
        wrongEmail.shouldBe(Condition.visible);
        return this;
    }
    public CvRegistrationSteps wrongPassword(){
        wrongPassword.shouldBe(Condition.visible);
        return this;
    }
    public CvRegistrationSteps wrongFirstName(){
        wrongFirstName.shouldBe(Condition.visible);
        return this;
    }
    public CvRegistrationSteps wrongLastName(){
        wrongLastName.shouldBe(Condition.visible);
        return this;
    }
    public CvRegistrationSteps wrongPhone(){
        wrongPhone.shouldBe(Condition.visible);
        return this;
    }
    public CvRegistrationSteps wrongSubmit(){
        wrongSubmit.shouldBe(Condition.visible);
        return this;
    }
    }

