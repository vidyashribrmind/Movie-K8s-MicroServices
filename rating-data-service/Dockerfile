#Base Image
FROM openjdk:8
# Create DIR
RUN mkdir -p /usr/src/myapp
# COPY APPLICTAION COde
COPY target/rating-data-service-0.0.1-SNAPSHOT.jar  /usr/src/myapp
# Setup Working DIR
WORKDIR /usr/src/myapp
#EXPOSE
EXPOSE 8082
# Start the Bot Service
CMD ["java", "-jar","rating-data-service-0.0.1-SNAPSHOT.jar"]
