# Spring-Boot-Kube-01
Application presenting rest api using 
Spring boot and kubernetes.

# Developer notes

## To Run application

Run from inside IDE or from the command line:

    ./gradlew bootrun


## Test the end point running locally

To test the end point using the command line, 
you can use curl, or you can use httpie.

On linux, the httpie command can be installed with 

    sudo snap install httpie

Then to test the end point you can use:

    http :8080

This should return the response:

    HTTP/1.1 200 OK
    Content-Length: 23
    Content-Type: text/plain;charset=UTF-8
    
    Welcome to Spring Boot!
    

## Containerize the application

This can be containerized by modifying the 
build.gradle file or by creating a Dockerfile. 

The Dockerfile approach would build with this command:

    sudo docker build -t demo-service:1.0 .

This can be run with :

    sudo docker run -d demo-service:1.0

