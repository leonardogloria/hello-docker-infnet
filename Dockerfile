FROM openjdk:17
ARG PORT=9000
ARG GREETING="Hello from DockerFile"
ENV PORT=$PORT
ENV greeting = $GREETING
EXPOSE $PORT
WORKDIR /app
COPY target/hello-docker-0.0.1-SNAPSHOT.jar ./hello.jar
RUN curl -o certificado.pem https://atria-images.s3.us-east-2.amazonaws.com/Poli%CC%81tica+de+Privacidade.pdf
ENTRYPOINT java -jar ./hello.jar