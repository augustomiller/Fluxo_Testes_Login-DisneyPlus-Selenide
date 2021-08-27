package com.disneyPlusTests.common;

import com.codeborne.selenide.Configuration;
import com.disneyPlusTests.pages.LoginPage;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected static LoginPage login;

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

}
