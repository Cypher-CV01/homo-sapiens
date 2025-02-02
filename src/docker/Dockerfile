FROM eclipse-temurin:21.0.5_11-jre-jammy

RUN mkdir -p /opt/app/

ENV JAVA_APP_JAR=@project.artifactId@-@project.version@.jar \
    TZ=America/Sao_Paulo \
    JAVA_OPTIONS="-Xmx256m" \
    CONTAINER_MAX_MEMORY=256m \
    JAVA_APP_NAME="@project.artifactId@" \
    AB_OFF=true

ADD $JAVA_APP_JAR /opt/app/@project.artifactId@-@project.version@.jar
CMD ["java", "-jar", "/opt/app/@project.artifactId@-@project.version@.jar"]