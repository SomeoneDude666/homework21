package ru.netology;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;

public class cardOrderTest {
    @Test
    void shouldSumbitRequest() {
        open("http://localhost:9999/");
        //SelenideElement form=$("[form form_size_m form_theme_alfa-on-white]");
        $("[data-test-id=name] input").setValue("Петр Васильев");
        $("[data-test-id=phone] input").setValue("+79266264578");
        $("[data-test-id=agreement]").click();
        $$("button").find(exactText("Продолжить")).click();
        $("[data-test-id]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
}
