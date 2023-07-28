package org.palywright.quarkus;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.palywright.quarkus.page.LoginPage;

@QuarkusTest
@Epic("Login Test Epic")
@Feature("In-Valid Login Feature")
public class InvalidLoginPageTest {
    @Inject
    private LoginPage loginPage;

    @Test

    @Story("user Tries to Login to the system with invalid username and invalid password")
    @Description("Invalid Login Test with Invalid Username and Invalid Password.")
    public void LoginInvalidTest() {
        loginPage.goTo();
        loginPage.setEmail("invalid@yourstore.com");
        loginPage.setPassword("invalid");
        loginPage.performLogin();

    }
}