Example from: https://www.baeldung.com/spring-boot-soap-web-service

Compile: mvn compile
Run: mvn spring-boot:run

URL to wsdl: http://localhost:8080/ws/countries.wsdl

Request: curl --header "content-type: text/xml" -d @request.xml http://localhost:8080/ws

Generated Gradle Build Files:
https://www.baeldung.com/maven-convert-to-gradle#converting-to-gradle