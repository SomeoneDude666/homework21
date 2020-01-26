package ru.netology;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class cardOrderTest {
    @Test
    void shouldSumbitRequest() {
        open("http://localhost:9999/");
        //SelenideElement form=$("[form form_size_m form_theme_alfa-on-white]");
        $("[data-test-id=name]input").setValue("Петр Васильев");
        $("[data-test-id=phone]input").setValue("+79266264578");
        $("[data-test-id=agreement]").click();
        $("[button button_view_extra button_size_m button_theme_alfa-on-white]").click();
        $("paragraph paragraph_theme_alfa-on-white").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
}
