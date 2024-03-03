FROM ubuntu:24.04
ENV JAVA_HOME=/u01/middleware/jdk-11.0.1
ENV PATH=$PATH:$JAVA_HOME/bin
ENV CLASSPATH=/u01/apps/RandomNumberApp-1.4.jar

RUN mkdir -p /u01/middleware
RUN mkdir -p /u01/apps

WORKDIR /u01/middleware/
ADD https://download.java.net/java/GA/jdk11/13/GPL/openjdk-11.0.1_linux-x64_bin.tar.gz .
RUN tar -xzvf openjdk-11.0.1_linux-x64_bin.tar.gz
ADD /target/RandomNumberApp-1.4.jar /u01/apps

CMD ["java", "com.random.main.RandomNumberGenApp"]
