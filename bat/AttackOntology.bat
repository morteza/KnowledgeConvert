@echo off

set JVM_ARGS=-Xmx1024M
set CLASSPATH="..\lib\*;..\jena\*;..\owlapi\*;"
set LOGGING=-Dlog4j.configuration=file:../log4j.properties

java -jar ../AttackOntology.jar %JVM_ARGS% %LOGGING% -cp %CLASSPATH% %*
exit /B
