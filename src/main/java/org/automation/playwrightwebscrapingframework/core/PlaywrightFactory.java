package org.automation.playwrightwebscrapingframework.core;

import com.microsoft.playwright.*;
import org.automation.playwrightwebscrapingframework.config.ConfigReader;

public class PlaywrightFactory {

  private static Playwright playwright;
  private static Browser browser;

  public static Page getPage() {
    playwright = Playwright.create();

    boolean headless = ConfigReader.getBoolean("headless");

    browser = playwright.chromium().launch(
        new BrowserType.LaunchOptions().setHeadless(headless)
    );

    BrowserContext context = browser.newContext();
    return context.newPage();
  }

  public static void closeBrowser() {
    if (browser != null) browser.close();
    if (playwright != null) playwright.close();
  }
}
