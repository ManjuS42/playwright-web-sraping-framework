package org.automation.playwrightwebsrapingframework.tests;

import com.microsoft.playwright.Page;
import org.automation.playwrightwebscrapingframework.config.ConfigReader;
import org.automation.playwrightwebscrapingframework.core.PlaywrightFactory;
import org.automation.playwrightwebscrapingframework.scraper.MarketDataScraper;
import org.automation.playwrightwebscrapingframework.utils.DateUtil;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class MarketDataScraperTest {

  private Page page;

  @Test
  public void scrapeMarketData() {
    page = PlaywrightFactory.getPage();

    String date = DateUtil.getYesterdayDate();
    String baseUrl = ConfigReader.get("base.url");
    String finalUrl = String.format(baseUrl, date);

    MarketDataScraper scraper = new MarketDataScraper(page);
    scraper.scrapeAndWriteCsv(
        finalUrl,
        ConfigReader.get("output.file")
    );
  }

  @AfterClass
  public void tearDown() {
    PlaywrightFactory.closeBrowser();
  }
}


