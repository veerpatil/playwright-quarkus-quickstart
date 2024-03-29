package org.palywright.quarkus.config;


import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import io.quarkus.runtime.Startup;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.ws.rs.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;


@ApplicationScoped
public class PlayWrightConfig {


    @ConfigProperty(name = "headless")
    private boolean headless;

    @Produces
    public Browser getBrowser(String browser) {
        Playwright playwright = Playwright.create();
        Browser browserInstance = null;
        switch (browser) {
            case "chrome":
                browserInstance = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(headless));
                break;
            case "firefox":
                browserInstance = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(headless));
                break;
            case "webkit":
                browserInstance = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(headless));
                break;
        }
        return browserInstance;
    }

}
