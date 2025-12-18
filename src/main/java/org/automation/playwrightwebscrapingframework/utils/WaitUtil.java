package org.automation.playwrightwebscrapingframework.utils;

import com.microsoft.playwright.Page;

public class WaitUtil {

  private WaitUtil() {}

  public static void waitForTable(Page page) {
    page.waitForSelector("table.table-01",
        new Page.WaitForSelectorOptions().setTimeout(30000));
  }
}

