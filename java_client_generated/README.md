# swagger-java-client

OpenApi Course
- API version: 1.0
  - Build date: 2023-04-28T13:40:27.368714462Z[GMT]

Specification for OpenApi Course

  For more information, please visit [https://www.example.com/support/](https://www.example.com/support/)

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.BeersApi;

import java.io.File;
import java.util.*;

public class BeersApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure HTTP basic authorization: BasicAuth
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername("YOUR USERNAME");
        BasicAuth.setPassword("YOUR PASSWORD");


        BeersApi apiInstance = new BeersApi();
        Beer body = new Beer(); // Beer | 
        try {
            apiInstance.createBeer(body);
        } catch (ApiException e) {
            System.err.println("Exception when calling BeersApi#createBeer");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.BeersApi;

import java.io.File;
import java.util.*;

public class BeersApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure HTTP basic authorization: BasicAuth
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername("YOUR USERNAME");
        BasicAuth.setPassword("YOUR PASSWORD");


        BeersApi apiInstance = new BeersApi();
        UUID beerId = new UUID(); // UUID | Beer Id
        try {
            apiInstance.deleteBeerById(beerId);
        } catch (ApiException e) {
            System.err.println("Exception when calling BeersApi#deleteBeerById");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.BeersApi;

import java.io.File;
import java.util.*;

public class BeersApiExample {

    public static void main(String[] args) {
        
        BeersApi apiInstance = new BeersApi();
        UUID beerId = new UUID(); // UUID | Beer Id
        try {
            Beer result = apiInstance.getBeerById(beerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BeersApi#getBeerById");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.BeersApi;

import java.io.File;
import java.util.*;

public class BeersApiExample {

    public static void main(String[] args) {
        
        BeersApi apiInstance = new BeersApi();
        Integer pageNumber = 1; // Integer | Page Number
        Integer pageSize = 25; // Integer | Page Size
        try {
            BeerPagedList result = apiInstance.getListOfBeers(pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BeersApi#getListOfBeers");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.BeersApi;

import java.io.File;
import java.util.*;

public class BeersApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure HTTP basic authorization: BasicAuth
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername("YOUR USERNAME");
        BasicAuth.setPassword("YOUR PASSWORD");


        BeersApi apiInstance = new BeersApi();
        Beer body = new Beer(); // Beer | 
        UUID beerId = new UUID(); // UUID | Beer Id
        try {
            apiInstance.modifyBeerById(body, beerId);
        } catch (ApiException e) {
            System.err.println("Exception when calling BeersApi#modifyBeerById");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://dev.example.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BeersApi* | [**createBeer**](docs/BeersApi.md#createBeer) | **POST** /app/beers | New Beer
*BeersApi* | [**deleteBeerById**](docs/BeersApi.md#deleteBeerById) | **DELETE** /app/beers/{beerId} | Delete Beer by Id
*BeersApi* | [**getBeerById**](docs/BeersApi.md#getBeerById) | **GET** /app/beers/{beerId} | Beer by Id
*BeersApi* | [**getListOfBeers**](docs/BeersApi.md#getListOfBeers) | **GET** /app/beers | List of Beers
*BeersApi* | [**modifyBeerById**](docs/BeersApi.md#modifyBeerById) | **PUT** /app/beers/{beerId} | Modify of Beer
*CustomersApi* | [**createCustomer**](docs/CustomersApi.md#createCustomer) | **POST** /app/customers | New Customer
*CustomersApi* | [**createOrderByCustomer**](docs/CustomersApi.md#createOrderByCustomer) | **POST** /app/customers/{customerId}/orders | Place Order
*CustomersApi* | [**deleteCustomerById**](docs/CustomersApi.md#deleteCustomerById) | **DELETE** /app/customers/{customerId} | Delete Customer by Id
*CustomersApi* | [**getCustomerById**](docs/CustomersApi.md#getCustomerById) | **GET** /app/customers/{customerId} | Customer by Id
*CustomersApi* | [**getListOfCustomers**](docs/CustomersApi.md#getListOfCustomers) | **GET** /app/customers | List of Customers
*CustomersApi* | [**modifyCustomerById**](docs/CustomersApi.md#modifyCustomerById) | **PUT** /app/customers/{customerId} | Modify of Customer
*CustomersApi* | [**modifyListOfCustomers**](docs/CustomersApi.md#modifyListOfCustomers) | **PUT** /app/customers | Modify of Customers

## Documentation for Models

 - [Address](docs/Address.md)
 - [Beer](docs/Beer.md)
 - [BeerList](docs/BeerList.md)
 - [BeerOrder](docs/BeerOrder.md)
 - [BeerOrderLine](docs/BeerOrderLine.md)
 - [BeerOrderStatus](docs/BeerOrderStatus.md)
 - [BeerPagedList](docs/BeerPagedList.md)
 - [Brewery](docs/Brewery.md)
 - [Customer](docs/Customer.md)
 - [CustomerList](docs/CustomerList.md)
 - [CustomerPagedList](docs/CustomerPagedList.md)
 - [PagedResponse](docs/PagedResponse.md)
 - [PagedResponsePageable](docs/PagedResponsePageable.md)
 - [PagedResponsePageableSort](docs/PagedResponsePageableSort.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### BasicAuth

- **Type**: HTTP basic authentication

### JwtAuthToken



## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

example@example.hu
