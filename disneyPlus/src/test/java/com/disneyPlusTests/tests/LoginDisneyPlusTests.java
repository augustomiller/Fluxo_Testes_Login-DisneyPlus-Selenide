package com.disneyPlusTests.tests;

import com.disneyPlusTests.common.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

/*
* A camada de teste é somente para implementar novos cenários e tratar com dados.
* */
public class LoginDisneyPlusTests extends BaseTest {

    /*
     * Massa de teste que valida cenários sem sucesso.
     * */
    @DataProvider(name = "data-provider")
    public Object[][] loginProvider() {
        return new Object[][]{
                {"mike@gmail.com", "", "Houve um problema na criação da conta. Volte a digitar seu e-mail e senha e tente novamente. Se o problema continuar, entre em contato com o Suporte do Disney+ (código de erro 6)."},
                {"mike@gmail.com", "johnwick@pencil", "Senha incorreta. Digite novamente. Se o problema continuar, selecione \"Esqueceu a senha?\" e faça a redefinição (código de erro 14)."},
        };
    }

    @Test
    public void shouldLoggerUser() {

        login.open();
        login.with("mike@gmail.com", "**********");

        $("button[kind=primary]").shouldHave(text("REATIVAR ASSINATURA"));
    }

    @Test
    public void emailRequired() {

        login.open();
        login.emailNull("");
    }

    @Test
    public void userNotFound() {

        login.open();
        login.userNull("");
    }

    @Test(dataProvider = "data-provider")
    public void shouldSeeLoginAlerts(String email, String pass, String expectAlert) {

        login.open();
        login.passwordNotFound(email, pass);
        login.alert().shouldHave(text(expectAlert));
    }

    /*
     * Gancho que após cada execução de teste ele limpa a sessão do utilizador.
     * */
    @AfterMethod
    public void cleanup() {
        login.clearSession();
    }
}
