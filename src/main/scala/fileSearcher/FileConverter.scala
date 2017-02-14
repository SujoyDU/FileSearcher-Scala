package fileSearcher

/**
  * Created by sujoy on 2/14/2017.
  */
import java.io.File

object FileConverter {
  def convertToIOObject( file: File) =
    if(file.isDirectory()) DirectoryObject(file)
    else FileObject(file)
}
