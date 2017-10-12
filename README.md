# Template-microservices-app

#Notes
=======

Book Service
=======
http://localhost:8080/available
http://localhost:8080/recommended

Product Service
=======
http://localhost:7072/stock/available
http://localhost:7072/product/show/1
http://localhost:7072/v2/api-docs
http://localhost:7072/swagger-ui.html#!/product-controller/showProductUsingGET
http://localhost:7072/swagger-ui.html#!/book-controller/checkedOutUsingPATCH

Getway
=======
http://localhost:7170/books/recommended
http://localhost:7170/stocks/stock/available
http://localhost:7170/products/product/show/1

CircuitBreaker - Client
=======
http://localhost:7070/
http://localhost:7070/to-read-via-getway
http://localhost:7070/circuit-breaker/to-read
http://localhost:7070/circuit-breaker/to-read-via-getway
http://localhost:7070/hystrix.stream

Hystrix Dashboard with Client's hystrix.stream
=======
http://localhost:7002/hystrix/monitor?stream=http://localhost:8070/hystrix.stream


Turbine
=======
After running, use this url in the hystrix dashboard:
http://localhost:8989/turbine.stream?cluster=CUSTOMERS


Config Server 
=======
According to the details from microservices-config directory from github repo https://github.com/allemaos/template-microservices-app.git 
Discovery Service: http://localhost:8761/
Edge-Server: http://localhost:7170/
Hystrix Dashboard: http://localhost:7002/
Client: http://localhost:7070/
Book: http://localhost:8080/
Product: http://localhost:7072/
Turbine: http://localhost:8989/
Turbine management: http://localhost:8990/

