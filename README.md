SpringBootGradleJPA
===================
Simple Spring Boot project, built using Gradle, using JPA for persistence.

Based on initial SpringBootGradle template at https://github.com/sabram/SpringBootGradle

To run, use one of the following options:
* ./gradlew build && java -jar build/libs/spring-boot-gradle-jpa-0.1.0.jar (does not require gradle to be preinstalled)
* gradle bootRun (if you already have gradle installed)
* run the Application class (e.g. if you have imported in to your IDE)

Then access http://localhost:8080

Note that JPA part still in progress!
Although the code does have basic JPA support,
I am trying to figure out how to best support differeny databases/datasources
for different environments

e.g. h2 for tests, mysql for dev, and a different mysql for production.

The approach I have used in the past is something similar to the one
described in this posting:
http://www.baeldung.com/2012/03/12/project-configuration-with-spring/
BAsically a properties files for each environment (e.g. dev.properties),
with the environment value being set by a system propery (e.g. -DenvTarget=dev,
or in the tomcat setenv.sh file).

This posting suggests an alternative using Spring Profiles:
http://spring.io/blog/2011/02/14/spring-3-1-m1-introducing-profile/
