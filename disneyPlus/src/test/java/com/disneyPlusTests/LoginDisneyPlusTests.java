package com.disneyPlusTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.WebDriverRunner.isChrome;

public class LoginDisneyPlusTests {

    @DataProvider(name = "data-provider")
    public Object[][] loginProvider() {
        return new Object[][]{
                {"johnwick@gmail.com", "johnwick@pencil", "Senha incorreta. Digite novamente. Se o problema continuar, selecione \"Esqueceu a senha?\" e faça a redefinição (código de erro 14)."},
                {"", "johnwick@pencil", "Houve um problema na criação da conta. Volte a digitar seu e-mail e senha e tente novamente. Se o problema continuar, entre em contato com o Suporte do Disney+ (código de erro 6)."},
                {"johnwick@gmail.com", "", "Houve um problema na criação da conta. Volte a digitar seu e-mail e senha e tente novamente. Se o problema continuar, entre em contato com o Suporte do Disney+ (código de erro 6)."},
                {"notfound@gmail.com", "johnwick@pencil", "Assinar"}
        };
    }

    @Test
    public void shouldLoggerUser() {

        isChrome();
        open("https://www.disneyplus.com/pt-br");
        $(".nav-initial .wrapper a").shouldHave(text("Entrar")).click();

        $("#email").setValue("maic.global@gmail.com");
        $("button[data-gv2elementkey]").click();

        $("#password").setValue("D4r882wk");
        $("button[name=dssLoginSubmit]").click();

        $("button[kind=primary]").shouldHave(text("REATIVAR ASSINATURA"));
    }


    @Test(dataProvider = "data-provider")
    public void shouldSeeLoginAlerts(String email, String pass, String expectAlert) {

        isChrome();

        executeJavaScript("localStorage.clear();");

        open("https://www.disneyplus.com/pt-br");


        $(".nav-initial .wrapper a").shouldHave(text("Entrar")).click();

        $("#email").setValue(email);
        $("button[data-gv2elementkey]").click();

        $("#password").setValue(pass);
        $("button[name=dssLoginSubmit]").click();

        $("div[data-testid=text-input-error]").shouldHave(text(expectAlert));

    }
}
