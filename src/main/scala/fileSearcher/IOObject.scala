package fileSearcher

/**
  * Created by sujoy on 2/14/2017.
  */
import java.io.File

trait IOObject {
  val file: File
  val name = file.getName()
}

case class FileObject(file: File) extends IOObject
case class DirectoryObject(file: File) extends IOObject
