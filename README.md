# Java test applications using different patterns for Java Value Classes -- looking specifically at reducing boilerplate, e.g. Builder patterns.

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

## auto-value

Uses Google Auto Value code generation

To Run:
```
cd auto-value
mvn package
java -cp target/classes:target/dependency/* com.example.Main
curl localhost:8080/myresource
```

References
* https://github.com/google/auto/blob/master/value/userguide/index.md
* https://github.com/google/auto/blob/master/value/userguide/why.md

## immutables

Uses Immutables code generation

To Run:
```
cd immutables
mvn package
java -cp target/classes:target/dependency/* com.example.Main
curl localhost:8080/myresource
```

References
* http://immutables.github.io/
* https://github.com/immutables/immutables

# kotlin-java

Uses Kotlin for value objects

To Run:
```
cd kotlin-java
mvn package
java -cp target/classes:target/dependency/* com.example.Main
curl localhost:8080/myresource
```

References
* https://kotlinlang.org
* https://proandroiddev.com/from-autovalue-to-kotlin-data-class-2978dfb1ed5

# More
References
* https://dzone.com/articles/lombok-autovalue-and-immutables
