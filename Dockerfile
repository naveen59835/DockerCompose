#openjdk is the docker image for Java JDK the application will use
FROM openjdk
#creating a working directory inside the docker container of the application
WORKDIR usr/lib
#Copy the executable jar file that is created
#in the target folder and add it to the usr/lib working directory
ADD ./target/BEJ_C3_S1_Springboot_JWT_MC_1.-0.0.1-SNAPSHOT.jar /usr/lib/BEJ_C3_S1_Springboot_JWT_MC_1.-0.0.1-SNAPSHOT.jar
#Run the jar file using the java -jar command
ENTRYPOINT ["java","-jar","BEJ_C3_S1_Springboot_JWT_MC_1.-0.0.1-SNAPSHOT.jar"]