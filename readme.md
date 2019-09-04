# Spring Runner app

## How to create spring cloud application



Build code and just run 

```
mvn clean package

```
Configuration files:
```
reservationroomservice.properties (server.port=8500)
roomservices.properties(server.port=8101)

```
Open in brows

```
http://localhost:8500/rooms/
and
http://localhost:8500/hystrix/
search http://localhost:8500/hystrix.stream
```

