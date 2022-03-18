package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class CvRegistration {
        public SelenideElement
                goToCvRegistration = $(byText("CV რეგისტრაცია")),
                userOnRegisrtarionPage = $(byText("სამუშაოს მაძიებლებისთვის")),
                emailValue = $(byAttribute("formcontrolname", "email")),
                passwordValue = $(byAttribute("formcontrolname", "password")),
                firstNameValue = $(byAttribute("formcontrolname", "name")),
                lastNameValue = $(byAttribute("formcontrolname", "surname")),
                phoneValue = $(byAttribute("formcontrolname", "phone")),
                userNotRobot = $(byAttribute("role", "presentation")),
                termsNconditionsValue = $(".mat-checkbox-inner-container");

    }

