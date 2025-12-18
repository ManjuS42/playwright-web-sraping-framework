package org.automation.playwrightwebscrapingframework.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtil {

  private DateUtil() {}

  public static String getYesterdayDate() {
    return LocalDate.now()
        .minusDays(1)
        .format(DateTimeFormatter.ISO_DATE);
  }
}

