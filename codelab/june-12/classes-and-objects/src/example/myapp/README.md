### private
means it will only be visible in that class (or source file if you are working with functions).
### protected
is the same as private, but it will also be visible to any subclasses.
### internal
means it will only be visible within that module. A module is a set of Kotlin files compiled together, for example, a library, a client or application, a server application in an IntelliJ project. Note the usage of "module" here is unrelated to Java modules that were introduced in Java 9.
### public 
means visible outside the class. Everything is public by default, including variables and methods of the class.