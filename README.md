
# **Description**

**Risk Matrix**

This project allow to add drivers to a risk matrix.

**prerequisites**
- java 8
- Maven
- Docker
- Minikube


**Steps for local execution in minikube**

mvn package

sudo docker build -f docker/dockerfile -t riskmatrix:1.0.0 .

sudo kubectl apply -f kubernetes/deployment.yaml

sudo kubectl apply -f kubernetes/service.yaml

sudo kubectl expose deployment riskmatrix-deployment --type=NodePort --port=8080

**Steps for local execution without minikube**

mvn package

java -jar target/riskmatrix-0.0.1-SNAPSHOT.jar

**url for consume the page from AWS:**

http://ec2-52-14-90-19.us-east-2.compute.amazonaws.com:31670/matrix

this project was build in AWS using an EC2 instance with ubuntu, minikube , docker  and java 8

**Git repository:**
All the project its in the master branch.
https://github.com/jslopez1/riskmatrix.git



