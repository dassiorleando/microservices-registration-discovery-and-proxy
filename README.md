# service-to-service-calls-with-spring-cloud
A repository for a blog on how Spring Cloud promotes resilient service-to-service calls through service registries and service discovery: https://spring.io/blog/2015/01/20/microservice-registration-and-discovery-with-spring-cloud-and-netflix-s-eureka


# What is new here

* https://github.com/joshlong/service-registration-and-discovery
* + a consultation-service
* +a zull server for proxying requests.

# Test all
* `mvn clean install` in parent folder.
* run mongodb by it: `mongod` or `sudo service mongodb start`.
* `cd eureka-service` and type `java -jar target/eureka-service.jar eureka-service`: same thing for other modules, take a look at name of module before.
* and in you browser lauchn api-service(zull) module: `http://localhost:8666` to test the proxy server, knowing that the registry(eureka-service), consultation-service are started.

# What's happen

* Creation of fake entities in consultation-services(both consultations and patients).
* The proxy server go and take consultations and patients in consultation-service servie via zuul.


# For more understanding microservices, registration, discovery take a look at these links:
* https://github.com/joshlong/service-registration-and-discovery
* https://spring.io/blog/2015/01/20/microservice-registration-and-discovery-with-spring-cloud-and-netflix-s-eureka

