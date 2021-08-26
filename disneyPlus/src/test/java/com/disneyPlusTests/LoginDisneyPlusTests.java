package com.disneyPlusTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.WebDriverRunner.isChrome;

public class LoginDisneyPlusTests {

    /*
    * Massa de teste que valida cenários sem sucesso.
    * */
    @DataProvider(name = "data-provider")
    public Object[][] loginProvider() {
        return new Object[][]{
                {"johnwick@gmail.com", "johnwick@pencil", "Senha incorreta. Digite novamente. Se o problema continuar, selecione \"Esqueceu a senha?\" e faça a redefinição (código de erro 14)."},
                {"johnwick@gmail.com", "", "Houve um problema na criação da conta. Volte a digitar seu e-mail e senha e tente novamente. Se o problema continuar, entre em contato com o Suporte do Disney+ (código de erro 6)."},
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

    @Test
    public void emailRequired(){

        isChrome();
        open("https://www.disneyplus.com/pt-br");
        $(".nav-initial .wrapper a").shouldHave(text("Entrar")).click();

        $("#email").setValue("");
        $("button[data-gv2elementkey]").click();

        $("div[data-testid=text-input-error]").shouldHave(text("Houve um problema na criação da conta. " +
                " Volte a digitar seu e-mail e senha e tente novamente. Se o problema continuar, entre em contato " +
                " com o Suporte do Disney+ (código de erro 6)."));
    }

    @Test
    public void userNotFound(){

        isChrome();
        open("https://www.disneyplus.com/pt-br");
        $(".nav-initial .wrapper a").shouldHave(text("Entrar")).click();

        $("#email").setValue("notfound@gmail.com");
        $("button[data-gv2elementkey]").click();

        $("button[data-testid=modal-secondary-button]").shouldHave(text("Assinar"));

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
