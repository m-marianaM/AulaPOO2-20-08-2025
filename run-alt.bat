@echo off
set JAVA_HOME=C:\Program Files\Java\jdk-24
set PATH=%JAVA_HOME%\bin;%PATH%
set MAVEN_OPTS=-Dmaven.repo.local=D:\maven-repo
mvn spring-boot:run
