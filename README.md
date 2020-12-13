
Build 

mvn package

build docker image:

sudo docker build -f docker/dockerfile -t riskmatrix:1.0.0 .

sudo kubectl apply -f kubernetes/deployment.yaml

sudo kubectl apply -f kubernetes/service.yaml

sudo kubectl expose deployment riskmatrix-deployment --type=NodePort --port=8080



url for consume the page outside:

http://ec2-52-14-90-19.us-east-2.compute.amazonaws.com:31670/risk

