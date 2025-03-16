#!/bin/bash

# Directorios
SRC_DIR="src/main/java"
TEST_DIR="src/test/java"
OUT_DIR="out"
LIB_DIR="lib"

# Archivos JAR de JUnit y Hamcrest
JUNIT_JAR="$LIB_DIR/junit-platform-console-standalone-1.8.1.jar"

# Crear el directorio de salida
mkdir -p $OUT_DIR

# Compilar el código fuente y las pruebas
javac -cp "$JUNIT_JAR" -d $OUT_DIR $(find $SRC_DIR -name "*.java") $(find $TEST_DIR -name "*.java")

# Ejecutar las pruebas
java -jar $JUNIT_JAR --class-path $OUT_DIR --scan-class-path