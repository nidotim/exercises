package edu.nidotim.exercise.hackerrank.algorithm.implementation;


import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PDFViewerTest {

  PDFViewer pdfViewer;

  @Before
  public void before() {
    pdfViewer = new PDFViewer();
  }

  @Test
  public void testHurdleRace() {
    List<Integer> h = Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
        5, 5, 5, 5, 5);
    String word = "abc";

    int expectedResult = 9;
    int results = pdfViewer.designerPdfViewer(h, word);

    Assert.assertEquals(expectedResult, results);
  }

}
