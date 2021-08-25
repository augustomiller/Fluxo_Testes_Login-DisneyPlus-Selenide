package com.disneyPlusTests;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.WebDriverRunner.isChrome;

public class LoginDisneyPlusTests {

    @Test
    public void shouldLoggerUser() {

        isChrome();
        open("https://www.disneyplus.com/pt-br");
        $(".nav-initial .wrapper a").shouldHave(text("Entrar")).click();

        $("#email").setValue("johnwick@gmail.com");
        $("button[data-gv2elementkey]").click();

        $("#password").setValue("johnwick@pencil");
        $("button[name=dssLoginSubmit]").click();
    }
}
