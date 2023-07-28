package org.palywright.quarkus.page;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Inject;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.palywright.quarkus.config.PlayWrightConfig;

public abstract class Base {

    BrowserContext browserContext ;
    Page page;
    @Inject
    private PlayWrightConfig browser;

    @Inject
    @ConfigProperty(name = "browser")
    String browserName;

    @PostConstruct
    private void init()
    {
        browserContext = browser.getBrowser(browserName).newContext();
        page = browserContext.newPage();
    }

}
