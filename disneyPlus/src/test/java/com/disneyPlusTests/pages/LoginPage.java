package com.disneyPlusTests.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

/*
 * Utilizando o Padrão Page Object, essa classe representará a
 * página de ‘login’ com todos os seus elementos.
 * */
public class LoginPage {

    public LoginPage open() {
        Selenide.open("/pt-br");
        return this;
    }

    public LoginPage with(String email, String pass) {
        $(".nav-initial .wrapper a").shouldHave(text("Entrar")).click();
        $("#email").setValue(email);
        $("button[data-gv2elementkey]").click();
        $("#password").setValue(pass);
        $("button[name=dssLoginSubmit]").click();
        $("button[kind=primary]").shouldHave(text("REATIVAR ASSINATURA"));
        return this;
    }

    public LoginPage emailNull(String email) {
        $(".nav-initial .wrapper a").shouldHave(text("Entrar")).click();
        $("#email").setValue("");
        $("button[data-gv2elementkey]").click();
        $("div[data-testid=text-input-error]").shouldHave(text("Houve um problema na criação da conta. " +
                " Volte a digitar seu e-mail e senha e tente novamente. Se o problema continuar, entre em contato " +
                " com o Suporte do Disney+ (código de erro 6)."));
        return this;
    }

    public void userNull(String user) {
        $(".nav-initial .wrapper a").shouldHave(text("Entrar")).click();
        $("#email").setValue("notfound@gmail.com");
        $("button[data-gv2elementkey]").click();
        $("button[data-testid=modal-secondary-button]").shouldHave(text("Assinar"));

    }

    public void passwordNotFound(String email, String pass) {

        executeJavaScript("localStorage.clear();");
        $(".nav-initial .wrapper a").shouldHave(text("Entrar")).click();
        $("#email").setValue(email);
        $("button[data-gv2elementkey]").click();
        $("#password").setValue(pass);
        $("button[name=dssLoginSubmit]").click();
    }

    public SelenideElement alert() {
        return $("div[data-testid=text-input-error]");
    }
    
    public void clearSession(){
        executeJavaScript("localStorage.Clear()");
    }

}
