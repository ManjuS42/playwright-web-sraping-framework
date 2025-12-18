package org.automation.playwrightwebscrapingframework.utils;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvWriterUtil {

  private CsvWriterUtil() {}

  public static void writeToCsv(String filePath, List<String[]> data) {
    try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
      writer.writeAll(data);
    } catch (IOException e) {
      throw new RuntimeException("Failed to write CSV file", e);
    }
  }
}

