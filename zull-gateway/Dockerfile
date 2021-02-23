#Base Image
FROM openjdk:8
# Create DIR
RUN mkdir -p /usr/src/myapp
# COPY APPLICTAION COde
COPY target/zull-gateway-0.0.1-SNAPSHOT.jar  /usr/src/myapp
# Setup Working DIR
WORKDIR /usr/src/myapp
#EXPOSE
EXPOSE 8090
# Start the Bot Service
CMD ["java", "-jar", "zull-gateway-0.0.1-SNAPSHOT.jar"]
