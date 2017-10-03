# template-microservices-app

#Notes

#Book Service
http://localhost:8090/available
#Product Service
http://localhost:8091/book/available
http://127.0.0.1:8091/product/show/1
http://localhost:8091/v2/api-docs
http://localhost:8091/swagger-ui.html#!/product-controller/showProductUsingGET
http://localhost:8091/swagger-ui.html#!/book-controller/checkedOutUsingPATCH

#Getway
http://localhost:8080/books/available
http://localhost:8080/products/product/show/1

#CircuitBreaker
http://localhost:8090/recommended
http://localhost:8080/books/recommended
http://localhost:8070/
http://localhost:8070/to-read-via-getway
http://localhost:8070/circuit-breaker/to-read
http://localhost:8070/circuit-breaker/to-read-via-getway
http://localhost:8070/hystrix.stream

http://localhost:8061/hystrix/monitor?stream=http://localhost:8070/hystrix.stream


turbine
=======
After running, use this url in the hystrix dashboard:
http://localhost:8989/turbine.stream?cluster=CUSTOMERS