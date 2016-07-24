FROM ubuntu:latest
MAINTAINER Thomas GAUROY <thomas.gauroy@sgcib.com>
RUN apt-get update && \
    apt-get upgrade -y && \
    apt-get install -y  software-properties-common && \
    add-apt-repository ppa:webupd8team/java -y && \
    apt-get update && \
    echo oracle-java7-installer shared/accepted-oracle-license-v1-1 select true | /usr/bin/debconf-set-selections && \
    apt-get install -y oracle-java8-installer && \
    apt-get clean

ADD ../sample-rest-1.0-SNAPSHOT.jar /tmp

PUBLISH 8080:8080

CMD java -jar /tmp/sample-rest-1.0-SNAPSHOT.jar

