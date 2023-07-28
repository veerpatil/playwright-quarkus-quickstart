package org.palywright.quarkus;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.AfterEach;
import org.palywright.quarkus.page.LoginPage;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@Epic("Login Test Epic")
@Feature("Valid Login Feature")
public class LoginPageTest {
    @Inject
    private LoginPage loginPage;

    @Test
    @Story("User tries to login the system with valid username and valid password.")
    @Description("Invalid Login Test with valid Username and valid Password.")
    public void LoginAdminTest()  {
        loginPage.goTo();
        loginPage.setEmail("admin@yourstore.com");
        loginPage.setPassword("admin");
        loginPage.performLogin();
        loginPage.LogOut();
    }






}