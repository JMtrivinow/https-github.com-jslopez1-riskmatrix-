
Build 

mvn package

build docker image:

docker build -f docker/dockerfile -t riskmatrix:1.0.0 .

kubectl apply -f kubernetes/deployment.yaml

kubectl apply -f kubernetes/service.yaml

