# BeersApi

All URIs are relative to *https://dev.example.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBeer**](BeersApi.md#createBeer) | **POST** /app/beers | New Beer
[**deleteBeerById**](BeersApi.md#deleteBeerById) | **DELETE** /app/beers/{beerId} | Delete Beer by Id
[**getBeerById**](BeersApi.md#getBeerById) | **GET** /app/beers/{beerId} | Beer by Id
[**getListOfBeers**](BeersApi.md#getListOfBeers) | **GET** /app/beers | List of Beers
[**modifyBeerById**](BeersApi.md#modifyBeerById) | **PUT** /app/beers/{beerId} | Modify of Beer

<a name="createBeer"></a>
# **createBeer**
> createBeer(body)

New Beer

Create a new **Beer** Object

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeersApi;

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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Beer**](Beer.md)|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)[JwtAuthToken](../README.md#JwtAuthToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteBeerById"></a>
# **deleteBeerById**
> deleteBeerById(beerId)

Delete Beer by Id

Delete **Beer** by Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeersApi;

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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **beerId** | [**UUID**](.md)| Beer Id |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)[JwtAuthToken](../README.md#JwtAuthToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBeerById"></a>
# **getBeerById**
> Beer getBeerById(beerId)

Beer by Id

Get details of **Beer** by id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BeersApi;


BeersApi apiInstance = new BeersApi();
UUID beerId = new UUID(); // UUID | Beer Id
try {
    Beer result = apiInstance.getBeerById(beerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeersApi#getBeerById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **beerId** | [**UUID**](.md)| Beer Id |

### Return type

[**Beer**](Beer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getListOfBeers"></a>
# **getListOfBeers**
> BeerPagedList getListOfBeers(pageNumber, pageSize)

List of Beers

Get a list of **Beers** in the system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BeersApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| Page Number | [optional] [default to 1]
 **pageSize** | **Integer**| Page Size | [optional] [default to 25]

### Return type

[**BeerPagedList**](BeerPagedList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modifyBeerById"></a>
# **modifyBeerById**
> modifyBeerById(body, beerId)

Modify of Beer

Modify **Beer** by Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeersApi;

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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Beer**](Beer.md)|  |
 **beerId** | [**UUID**](.md)| Beer Id |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)[JwtAuthToken](../README.md#JwtAuthToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

