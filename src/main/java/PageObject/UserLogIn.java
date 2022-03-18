package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class UserLogIn {
    public SelenideElement
        goToLogIn = $(".sign-in__text"),
        userOnLoginPage = $(byText("სამუშაოს მაძიებლებისთვის")),
        emailInput = $(byAttribute("formcontrolname", "emailInput")),
        passwordInput = $(byAttribute("formcontrolname", "passwordInput")),
        userLogIn = $(".signin-button__btn");

}
