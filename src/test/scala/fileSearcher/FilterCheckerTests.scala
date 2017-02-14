package fileSearcher

import javax.tools.FileObject

import org.scalatest.FlatSpec

/**
  * Created by sujoy on 2/14/2017.
  */
class FilterCheckerTests extends FlatSpec {
  "FilterChecker passed a list where one file matches the filter" should
    "return a list with that file" in {
      val matchingFile = new FileObject("match")
      val matchingFile2 = new FileObject("xyz")
      val listOfFiles = List(new FileObject("random"), matchingFile, new FileObject("abcd"),matchingFile2)
      val matchedFiles = new FilterChecker("xyz").findMatchedFiles(listOfFiles)
      assert( matchedFiles == List(matchingFile2))
  }

  "FilterChecker passed a list with a directory that matches the filter" should
    "should not return the directory" in {
      val listOfIOObjects = List (new FileObject("random"), new DirectoryObject("match"))
      val matchedFiles = new FilterChecker("match").findMatchedFiles(listOfIOObjects)
      assert( matchedFiles.length == 0)
  }
}
