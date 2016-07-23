#!/bin/bash
JAR_FILE="@project.artifactId@-@project.version@.jar"
CONFIG_DIR=./config/

echo "[INFO] Executing the JAR file: ${JAR_FILE}"

java -jar $JAR_FILE --spring.config.location=file:$CONFIG_DIR