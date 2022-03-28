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
        userLogIn = $(".signin-button__btn"),
        wrongLogIn = $(byText("სისტემაში შესვლა ვერ მოხერხდა")),
        userWrongLogIn = $(byText("გთხოვთ შეამოწმოთ თქვენი იმეილი და პაროლი"));

}
