package StepObject;

import DataObject.LoginData;
import PageObject.UserLogIn;
import com.codeborne.selenide.Condition;

public class UserLoginSteps extends UserLogIn {
    public UserLoginSteps goToLogIn(){
        goToLogIn.click();
        userOnLoginPage.shouldHave(Condition.text("სამუშაოს მაძიებლებისთვის"));
        return this;
    }
    public UserLoginSteps emailInput(String email){
        emailInput.setValue(LoginData.email);
        return this;
    }
    public UserLoginSteps passwordInput(String password){
        passwordInput.setValue(LoginData.password);
        return this;
    }
    public UserLoginSteps userLogIn(){
        userLogIn.click();
        return this;
    }

}
