javac -d src/main/classes -classpath src/main/resources/libs/spring-context-5.3.18.jar;src/main/resources/libs/aspectjlib-1.6.2.jar;src/main/resources/libs/spring-beans-5.3.18.jar;src/main/resources/libs/spring-core-5.3.18.jar  -sourcepath src/main/java src/main/java/org/example/K1/*.java
xcopy /s /i /A src\main\resources\ src\main\classes
java -classpath src/main/classes;src/main/resources/libs/commons-logging-1.2.jar;src/main/resources/libs/spring-expression-5.3.18.jar;src/main/resources/libs/spring-context-5.3.18.jar;src/main/resources/libs/aspectjlib-1.6.2.jar;src/main/resources/libs/spring-beans-5.3.18.jar;src/main/resources/libs/spring-core-5.3.18.jar org.example.K1.KnightMain
pause