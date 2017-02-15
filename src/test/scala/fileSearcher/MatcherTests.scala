package fileSearcher

import java.io.File

import org.scalatest.FlatSpec

/**
  * Created by sujoy on 2/14/2017.
  */
class MatcherTests extends FlatSpec {
  "Matcher that is passed a file matching the filter" should
    "return a list with that file name" in {
      val matcher = new Matcher("fake", "fakePath")
      val results = matcher.execute()
      assert( results == List("fakePath") )

  }

  "Matcher using a directory containing one file matching the filter" should
    "return a list with that file name" in {
      val matcher = new Matcher("txt",new File("testfiles").getCanonicalPath())
      val results = matcher.execute()
      assert( results == List("readme.txt", "xyz.txt"))
  }

  "Matcher that is not passed a root file location" should
    "use the currnet location" in {
      val matcher = new Matcher("filter")
      assert(matcher.rootLocation == new File(".").getCanonicalPath())
  }

  "Matcher with subfolder checking matching a root location with two subtree files checking" should
    "return a list with those files names" in {
    val searchSubDirectoires = true
    val matcher = new Matcher("txt", new File(".\\testfiles\\").getCanonicalPath(), searchSubDirectoires)
    val results = matcher.execute()
    assert( results == List("pqr.txt","xyz.txt","readme.txt" ))


  }
}
