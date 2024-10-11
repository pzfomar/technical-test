# Price Api


## Description
This project is a technical test


## Requirements
- Jdk 21 (recommendation [OpenJDK](https://jdk.java.net/21/))
- IDE (recommendation [Spring Tools 4](https://spring.io/tools))
- [Lombok](https://projectlombok.org/download)
- [Maven](https://maven.apache.org/download.cgi)

## Build
```
./mvnw clean package
```
or

```
mvn clean package
```

## Tests
```
./mvnw test
```
or

```
mvn test
```

## Swagger ({host}/swagger-ui/index.html)

<br>
UI

```
{host}/swagger-ui/index.html
```

Ejemplo [localhost](http://localhost:8080/swagger-ui/index.html)

```
http://localhost:8080/swagger-ui/index.html
```


## Endpoint ({host}/api/v1/price/calculate.json)

<br>
Get Method

```
{host}/api/v1/price/calculate.json?application_date={date}:00&product_id={product}&brand_id={brand}
```

Ejemplo

```
http://localhost:8080/api/v1/price/calculate.json?application_date=2020-06-16-21:00:00&product_id=35455&brand_id=1
```

<br>
Request param

```
	application_date in format "yyyy-MM-dd-HH:mm:ss"
	product_id is numeric
	brand_id is numeric
```

<br>
Response

```
	{
	  "product_id": 0,
	  "brand_id": 0,
	  "rate_apply": 0.0,
	  "application_date": "2020-01-01-01:00:00",
	  "final_price_apply": 0.0
	}		
```
	
## Reviews released
> ##### Date February 22, 2024
```
A project is created in spring boot, the logic is created and the structure is created in hexagonal architecture.
Unit tests are created with junit and mockito.
Services are created with the function of calculating the total in product prices, it consumes the database and maps and calculates the value through streams.
Logs are integrated to see the progress of the microservice.
```

