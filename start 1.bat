javac -d src/main/classes -classpath "src/main/resources/libs/*"  -sourcepath src/main/java "src/main/java/org/example/K1/*.java"
javac -d src/main/classes -classpath "src/main/resources/libs/*"  -sourcepath src/main/java "src/main/java/org/example/K2/*.java"
javac -d src/main/classes -classpath "src/main/resources/libs/*"  -sourcepath src/main/java "src/main/java/org/example/K3/*.java"
javac -d src/main/classes -classpath "src/main/resources/libs/*"  -sourcepath src/main/java "src/main/java/org/example/K4/*.java"
javac -d src/main/classes -classpath "src/main/resources/libs/*"  -sourcepath src/main/java "src/main/java/org/example/zadanie/*.java"
javac -d src/main/classes -classpath "src/main/resources/libs/*"  -sourcepath src/main/java "src/main/java/org/example/zadanie2/*.java"


xcopy  /s /i /A src\main\resources\ src\main\classes
java -classpath "src/main/classes;src/main/resources/libs/*" org.example.K1.KnightMain
java -classpath "src/main/classes;src/main/resources/libs/*" org.example.K2.Idol
java -classpath "src/main/classes;src/main/resources/libs/*" org.example.K3.MagicMain
java -classpath "src/main/classes;src/main/resources/libs/*" org.example.K4.MagicMain4
java -classpath "src/main/classes;src/main/resources/libs/*" org.example.zadanie.Main
java -classpath "src/main/classes;src/main/resources/libs/*" org.example.zadanie2.MainAB

pause