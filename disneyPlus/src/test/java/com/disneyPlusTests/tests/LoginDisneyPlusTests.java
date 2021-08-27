package com.disneyPlusTests.tests;

import com.codeborne.selenide.Configuration;
import com.disneyPlusTests.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginDisneyPlusTests {

    protected static LoginPage login;

    /*
     * Massa de teste que valida cenários sem sucesso.
     * */
    @DataProvider(name = "data-provider")
    public Object[][] loginProvider() {
        return new Object[][]{
                {"johnwick@gmail.com", "", "Sorry, we are having trouble creating your account. Please re-enter your email and password and try again. If the problem persists, contact Disney+ Support (Error Code 6)."},
                {"johnwick@gmail.com", "johnwick@pencil", "Sorry, we are having trouble creating your account. Please re-enter your email and password and try again. If the problem persists, contact Disney+ Support (Error Code 6)."},
        };
    }

    /*
     * Todas as instruções aqui, será executada antes de cada teste.
     * */
    @BeforeMethod
    public void start() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.disneyplus.com";

        /*
         * Instanciando a Classe Login dento da camada de teste.
         * */
        login = new LoginPage();
    }

    @Test
    public void shouldLoggerUser() {

        login.open();
        login.with("johnwick@gmail.com", "johnwick@pencil");

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
    public void cleanup(){
        login.clearSession();
    }
}
