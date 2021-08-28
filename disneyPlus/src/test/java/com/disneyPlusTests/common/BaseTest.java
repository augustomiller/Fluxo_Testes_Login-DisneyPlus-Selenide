package com.disneyPlusTests.common;

import com.codeborne.selenide.Configuration;
import com.disneyPlusTests.pages.LoginPage;
import org.testng.annotations.BeforeMethod;

import java.io.InputStream;
import java.util.Properties;

public class BaseTest {

    protected static LoginPage login;

    /*
     * Todas as instruções aqui, será executada antes de cada teste.
     * */
    @BeforeMethod
    public void start() {

        Properties prop = new Properties();
        InputStream inputFile = getClass().getClassLoader().getResourceAsStream("config.properties");

        try {
            prop.load(inputFile);
        }catch (Exception ex){
            System.out.println("Erro ao carregar o arquivo Properties. Trace -> " + ex.getMessage());
        }

        Configuration.browser = prop.getProperty("browser");
        Configuration.baseUrl = prop.getProperty("url");
        Configuration.timeout = Long.parseLong(prop.getProperty("timeout"));

        /*
         * Instanciando a Classe Login dento da camada de teste.
         * */
        login = new LoginPage();
    }

}
