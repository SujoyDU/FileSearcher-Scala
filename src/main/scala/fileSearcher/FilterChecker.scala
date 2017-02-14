package fileSearcher

/**
  * Created by sujoy on 2/14/2017.
  */
class FilterChecker (filter : String) {

  def matches(content : String) = content.contains(filter)

  def findMatchedFiles( iOObjects : List[IOObject] ) = {
    for ( iOObject <- iOObjects
      if(iOObject.isInstanceOf[FileObject])
          if(matches(iOObject.name)))
      yield iOObject
  }

}
