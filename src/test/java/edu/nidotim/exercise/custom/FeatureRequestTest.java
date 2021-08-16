package edu.nidotim.exercise.custom;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class FeatureRequestTest {

  private static FeatureRequest featureRequest;

  @BeforeClass
  public static void initClass() {
    featureRequest = new FeatureRequest();
  }

  @Test
  public void testFeatureRequest() {
    int numFeatures = 5;
    int topFeatures = 2;
    int numFeatureRequests = 3;

    List<String> possibleFeatures = Arrays
        .asList("storage", "battery", "hover", "alexa", "waterproof", "solar");
    List<String> featureRequests = Arrays.asList(
        "I wish my Kindle had even more storage!",
        "I wish the battery life on my Kindle lasted 2 years.",
        "I read in the bath and would enjoy a waterproof Kindle",
        "Waterproof and increased battery are my top two requests.",
        " I want to take my Kindle into the shower. Waterproof please waterproof!",
        "It would be neat if my Kindle would hover on my desk when not in use.",
        "How cool would it be if my Kindle charged in the sun via solar power?");

    List<String> expected = Arrays.asList("waterproof", "battery");

    List<String> result = featureRequest
        .solution(numFeatures, topFeatures, possibleFeatures, numFeatureRequests,
            featureRequests);

    Assert.assertEquals(expected, result);

  }
}
