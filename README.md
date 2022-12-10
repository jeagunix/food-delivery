# 

## Model
www.msaez.io/#/storming/03009a5ba7f1c939ecad9b6b19a36425

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd kafka
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- order
- pay
- store
- customer
- delivery
- review


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- order
```
 http :8088/주문 id="id" 품목="품목" 수량="수량" 
 http :8088/orders id="id" foodId="foodId" status="status" storeId="storeId" price="price" qty="qty" orderId="orderId" 
```
- pay
```
 http :8088/결제이력 id="id" orderId="orderId" 금액="금액" 
 http :8088/payments id="id" orderId="orderId" price="price" 
```
- store
```
 http :8088/주문관리 id="id" 
 http :8088/orderManagements id="id" orderId="orderId" foodId="foodId" address="address" status="status" 
```
- customer
```
 http :8088/notificationRecords id="id" customerId="customerId" message="message" 
```
- delivery
```
 http :8088/deliveries id="id" orderId="orderId" foodId="foodId" customer address="customer address" store address="store address" 
```
- review
```
 http :8088/reviews id="id" orderId="orderId" review="review" poinit="poinit" date="date" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

