# ScalaBasic
Learning Scala and Functional Programming

# Step 1
Install Scala from https://www.scala-lang.org/
Install SBT (Simple Build Tool) from http://www.scala-sbt.org/
Install eclipse-scala IDE from http://scala-ide.org/

## My Versions
scala := 2.12.1

sbt := 0.13.13

eclipse-sbt:= 4.5.0

# Step 2
In the root directory: create file `build.sbt` and write
>name := "File Searcher"

>version := "0.1"

>scalaVersion := "2.12.1"

note : black line after each line acts a delimiter for scala settings.
# Step 3
create folder `project` and file `build.properties` and write
>sbt.version = 0.13.13 

create `plugins.sbt` and write 
>addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.1.0")

above line should be added according to this https://github.com/typesafehub/sbteclipse#for-sbt-013-and-up

#Step 4
at project root directory, in cmd run:
>sbt eclipse

#Step 5
Open eclipse and import the project 

# FileSearcher  Requirments

 * Find all files that match a given filter at a given location
    * Only match files
    * Use current location if no location is given
    * Search subfolders from given location