package fileSearcher

import java.io.File

import scala.util.control.NonFatal

/**
  * Created by sujoy on 2/14/2017.
  */
class FilterChecker(filter: String) {

  def matches(content: String) = content contains filter

  def findMatchedFiles(iOObjects: List[IOObject]) =
    for (iOObject <- iOObjects
         if (iOObject.isInstanceOf[FileObject])
         if (matches(iOObject.name)))
      yield iOObject

  def matchesFileContent(file: File) = {
    import scala.io.Source
    try {
      val fileSource = Source.fromFile(file)
      try
        fileSource.getLines() exists(line => matches(line))
      catch {
        case NonFatal(_) => false

      }
    }
    catch {
      case NonFatal(_) => false
    }
  }
}

object FilterChecker {
  def apply(filter: String): FilterChecker = new FilterChecker(filter)
}