package ru.netology;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;

public class CardOrderTest {
    @Test
    void shouldSumbitRequest() {
        open("http://localhost:9999/");
        $("[data-test-id=name] input").setValue("Петр Васильев");
        $("[data-test-id=phone] input").setValue("+79266264578");
        $("[data-test-id=agreement]").click();
        $("[role=button]").click();
        $(".Success_successBlock__2L3Cw").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
}
