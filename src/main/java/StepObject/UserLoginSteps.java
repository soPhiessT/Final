package StepObject;

import DataObject.LoginData;
import PageObject.UserLogIn;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class UserLoginSteps extends UserLogIn {
    public UserLoginSteps goToLogIn(){
        goToLogIn.click();
        userOnLoginPage.shouldHave(Condition.text("სამუშაოს მაძიებლებისთვის"));
        return this;
    }
    @Step("CvRegistration emailInput is {email}")
    public UserLoginSteps emailInput(String email){
        emailInput.setValue(LoginData.email);
        return this;
    }
    @Step("CvRegistration passwordInput is {password}")
    public UserLoginSteps passwordInput(String password){
        passwordInput.setValue(LoginData.password);
        return this;
    }
    @Step("UserLogIn")
    public UserLoginSteps userLogIn(){
        userLogIn.click();
        return this;
    }
    @Step("CvRegistration emailInput is {wrongEmail}")
    public UserLoginSteps emailInput(){
        emailInput.setValue(LoginData.wrongEmail);
        return this;
    }
    @Step("CvRegistration passwordInput is {wrongPassword}")
    public UserLoginSteps passwordInput(){
        passwordInput.setValue(LoginData.wrongPassword);
        return this;
    }

    public UserLoginSteps wrongLogIn(){
        wrongLogIn.shouldBe(Condition.visible);
        return this;
    }
    public UserLoginSteps userWrongLogIn(){
        userWrongLogIn.shouldBe(Condition.visible);
        return this;
    }

}
