package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class FavoriteVacancies {
    public SelenideElement
    goToDetailSearch = $(byText("დეტალური ძებნა")),
    chooseLocation = $(byText("მდებარეობა")),
    chooseCity = $(byText("თბილისი")),
    chooseSalary = $(byText("ხელფასი")),
    chooseMoney = $(byText("მხოლოდ ხელფასიანი")),
    chooseVacancy = $(byText("განცხადების ტიპი")),
    chooseOnlyVacancy = $(byText("ვაკანსია")),
    chooseDate = $(byText("გამოქვეყნების თარიღი")),
    chooseExactDate = $(byText("ბოლო 3 დღე")),
    pressSearch = $(byText("ძებნა")),
    addFavoriteVacancy = $(".ann-heart-icon");


}
