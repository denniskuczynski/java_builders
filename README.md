# Java test applications using Java Builder strategies such as code generation

## plain-java

Pure Java Boilerplate
To Run:
```
cd plain-java
mvn package
java -cp target/classes:target/dependency/* com.example.Main
curl localhost:8080/myresource
```

References
* http://cr.openjdk.java.net/~jrose/values/values-0.html

## lombok

Uses Project Lombok annotations / code generation

To Run:
```
cd lombok
mvn package
java -cp target/classes:target/dependency/* com.example.Main
curl localhost:8080/myresource
```

References
* https://projectlombok.org/
* https://www.slideshare.net/vladimirtsukur/hot-and-spicy-java-with-lombok-live
* https://github.com/google/auto/blob/master/value/userguide/why.md
