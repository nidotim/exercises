package edu.nidotim.exercise.custom;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReorderLog {

  public ReorderLog() {

  }

  public List<String> solution(List<String> logLines) {
    List<String> integerList = new ArrayList();
    Map<String, String> stringListMap = new HashMap();
    for (String logLine : logLines) {
      String[] line = logLine.split("\\s");
      if (isNumber(line[1])) {
        integerList.add(logLine);
      } else {
        String stringLog = line[1];
        for (int i = 2; i < line.length; i++) {
          stringLog += " " + line[i];
        }
        stringListMap.put(line[0], stringLog);
      }
    }
    List<String> reorderedLines = stringListMap
        .entrySet()
        .stream()
        .sorted(
            Map.Entry.<String, String>comparingByValue().thenComparing(Map.Entry.comparingByKey()))
        .map(feature -> feature.getKey() + " " + feature.getValue())
        .collect(toList());

    reorderedLines.addAll(integerList);

    return reorderedLines;
  }

  private boolean isNumber(String word) {
    return word.matches("\\d+");
  }


}
