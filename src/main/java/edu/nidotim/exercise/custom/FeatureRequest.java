package edu.nidotim.exercise.custom;

import static java.util.stream.Collectors.toList;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FeatureRequest {

  public FeatureRequest() {

  }

  public List<String> solution(int numFeatures, int topFeatures, List<String> possibleFeatures,
      int numFeatureRequests, List<String> featureRequests) {
    Map<String, Integer> possibleFeaturesMap = new HashMap<String, Integer>();
    for (String possibleFeature : possibleFeatures) {
      possibleFeaturesMap.put(possibleFeature.toLowerCase(), 0);
    }
    for (String featureRequest : featureRequests) {
      for (String word : featureRequest.split("\\s")) {
        word = word.toLowerCase().replaceAll("[.,?]", "");
        Integer count = possibleFeaturesMap.get(word);
        if (count == null) {
          continue;
        }
        count++;
        possibleFeaturesMap.put(word, count);
      }
    }
    List<String> features = possibleFeaturesMap
        .entrySet()
        .stream()
        .filter(map -> map.getValue() > 0)
        .sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder())
            .thenComparing(Map.Entry.comparingByKey()))
        .limit(topFeatures)
        .map(feature -> feature.getKey())
        .collect(toList());

    return features;
  }
}
