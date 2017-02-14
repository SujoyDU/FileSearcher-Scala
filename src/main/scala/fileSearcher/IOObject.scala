package fileSearcher

/**
  * Created by sujoy on 2/14/2017.
  */
trait IOObject {
  val name: String
}

class FileObject(val name: String) extends IOObject {}
class DirectoryObject(val name: String) extends IOObject {}
