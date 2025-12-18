package org.automation.playwrightwebscrapingframework.scraper;

import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;
import org.automation.playwrightwebscrapingframework.utils.CsvWriterUtil;
import org.automation.playwrightwebscrapingframework.utils.WaitUtil;

import java.util.ArrayList;
import java.util.List;

public class MarketDataScraper {

  private final Page page;

  public MarketDataScraper(Page page) {
    this.page = page;
  }

  public void scrapeAndWriteCsv(String url, String outputFile) {

    page.navigate(url);
    WaitUtil.waitForTable(page);

    List<String[]> rowsData = new ArrayList<>();
    rowsData.add(new String[]{"Low", "High", "Last", "Weight Avg"});

    List<ElementHandle> rows =
        page.querySelectorAll("table.table-01 tbody tr");

    for (ElementHandle row : rows) {
      List<ElementHandle> cells = row.querySelectorAll("td");

      if (cells.size() >= 6) {
        rowsData.add(new String[]{
            cells.get(1).innerText(),
            cells.get(2).innerText(),
            cells.get(3).innerText(),
            cells.get(4).innerText()
        });
      }
    }

    CsvWriterUtil.writeToCsv(outputFile, rowsData);
  }
}

