FROM azul/zulu-openjdk:11.0.10
RUN apt update
#ARG DEPENDENCY=./target/dependency
#COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
#COPY ${DEPENDENCY}/META-INF /app/META-INFO
#COPY ${DEPENDENCY}/BOOT-INF/classes /app

COPY target/ms-customer-0.0.1-SNAPSHOT.jar ms-customer-0.0.1.jar
#ENV SPRING_PROFILE local
ENV PORT 9091
ENV EUREKA_URI "http://192.168.1.2:8761/eureka"

#ENTRYPOINT ["java",\
#           "-cp",                 \
#           "app:app/lib/*",                 \
#           "arquitectura.software.mscustomer.MsCustomerApplication"]

ENTRYPOINT ["java",\
           "-jar",                 \
           "/ms-customer-0.0.1.jar"]

#COPY .mvn/ .mvn
#COPY mvnw pom.xml ./
#RUN ./mvnw dependency:go-offline

#COPY src ./src

#CMD ["./mvnw", "spring-boot:run"]