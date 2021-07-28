package edu.nidotim.exercise.hackerrank.algorithm.implementation;


import java.util.List;

//  https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
//  1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
//  abc

//  9

// 1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7
//  zaba

// 28
public class PDFViewer {

  public int designerPdfViewer(List<Integer> h, String word) {
    // Write your code here
    int maxHeight = 0;
    for (int asciiCode : word.toCharArray()) {
      int height = h.get(asciiCode - 97);
      if (height > maxHeight) {
        maxHeight = height;
      }
    }
    return maxHeight * word.length();
  }


}
