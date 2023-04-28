# CustomersApi

All URIs are relative to *https://dev.example.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomer**](CustomersApi.md#createCustomer) | **POST** /app/customers | New Customer
[**createOrderByCustomer**](CustomersApi.md#createOrderByCustomer) | **POST** /app/customers/{customerId}/orders | Place Order
[**deleteCustomerById**](CustomersApi.md#deleteCustomerById) | **DELETE** /app/customers/{customerId} | Delete Customer by Id
[**getCustomerById**](CustomersApi.md#getCustomerById) | **GET** /app/customers/{customerId} | Customer by Id
[**getListOfCustomers**](CustomersApi.md#getListOfCustomers) | **GET** /app/customers | List of Customers
[**modifyCustomerById**](CustomersApi.md#modifyCustomerById) | **PUT** /app/customers/{customerId} | Modify of Customer
[**modifyListOfCustomers**](CustomersApi.md#modifyListOfCustomers) | **PUT** /app/customers | Modify of Customers

<a name="createCustomer"></a>
# **createCustomer**
> createCustomer(body)

New Customer

Create a new **Customer** Object

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


CustomersApi apiInstance = new CustomersApi();
Customer body = new Customer(); // Customer | 
try {
    apiInstance.createCustomer(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#createCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Customer**](Customer.md)|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)[JwtAuthToken](../README.md#JwtAuthToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createOrderByCustomer"></a>
# **createOrderByCustomer**
> createOrderByCustomer(body, customerId)

Place Order

Place Order By Customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


CustomersApi apiInstance = new CustomersApi();
BeerOrder body = new BeerOrder(); // BeerOrder | 
UUID customerId = new UUID(); // UUID | Customer Id
try {
    apiInstance.createOrderByCustomer(body, customerId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#createOrderByCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BeerOrder**](BeerOrder.md)|  |
 **customerId** | [**UUID**](.md)| Customer Id |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)[JwtAuthToken](../README.md#JwtAuthToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteCustomerById"></a>
# **deleteCustomerById**
> deleteCustomerById(customerId)

Delete Customer by Id

Delete **Customer** by Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


CustomersApi apiInstance = new CustomersApi();
UUID customerId = new UUID(); // UUID | Customer Id
try {
    apiInstance.deleteCustomerById(customerId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#deleteCustomerById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | [**UUID**](.md)| Customer Id |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)[JwtAuthToken](../README.md#JwtAuthToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCustomerById"></a>
# **getCustomerById**
> Customer getCustomerById(customerId)

Customer by Id

Get details of **Customer** by Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomersApi;


CustomersApi apiInstance = new CustomersApi();
UUID customerId = new UUID(); // UUID | Customer Id
try {
    Customer result = apiInstance.getCustomerById(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#getCustomerById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | [**UUID**](.md)| Customer Id |

### Return type

[**Customer**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getListOfCustomers"></a>
# **getListOfCustomers**
> CustomerPagedList getListOfCustomers(pageNumber, pageSize)

List of Customers

Get a list of **Customers** in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomersApi;


CustomersApi apiInstance = new CustomersApi();
Integer pageNumber = 1; // Integer | Page Number
Integer pageSize = 25; // Integer | Page Size
try {
    CustomerPagedList result = apiInstance.getListOfCustomers(pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#getListOfCustomers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| Page Number | [optional] [default to 1]
 **pageSize** | **Integer**| Page Size | [optional] [default to 25]

### Return type

[**CustomerPagedList**](CustomerPagedList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modifyCustomerById"></a>
# **modifyCustomerById**
> modifyCustomerById(body, customerId)

Modify of Customer

Modify **Customer** by Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


CustomersApi apiInstance = new CustomersApi();
Customer body = new Customer(); // Customer | 
UUID customerId = new UUID(); // UUID | Customer Id
try {
    apiInstance.modifyCustomerById(body, customerId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#modifyCustomerById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Customer**](Customer.md)|  |
 **customerId** | [**UUID**](.md)| Customer Id |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)[JwtAuthToken](../README.md#JwtAuthToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="modifyListOfCustomers"></a>
# **modifyListOfCustomers**
> modifyListOfCustomers()

Modify of Customers

Modify *all* **Customers** at the same time

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


CustomersApi apiInstance = new CustomersApi();
try {
    apiInstance.modifyListOfCustomers();
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#modifyListOfCustomers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)[JwtAuthToken](../README.md#JwtAuthToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

