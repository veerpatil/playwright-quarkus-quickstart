package org.palywright.quarkus.page;


import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class LoginPage extends Base {


    private static final String emailLocator = "#Email";

    private static final String passwordLocator="#Password";

    private static final String loginButton="button[type='submit']";

    private static final String logOut="//a[normalize-space()='Logout']";
    @ConfigProperty(name = "baseUrl")
    private String URL;

    public void goTo()
    {
        this.page.navigate(URL);
    }
    public void setEmail(String email)
    {
        this.page.locator(emailLocator).clear();
        this.page.locator(emailLocator).type(email);
    }

    public void setPassword(String password) {
        this.page.locator(passwordLocator).clear();
        this.page.locator(passwordLocator).type(password);
    }

    public void performLogin() {
        this.page.locator(loginButton).click();
    }

    public void LogOut()
    {
        this.page.locator(logOut).click();
    }
}
