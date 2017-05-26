# EsbOrdersApi

All URIs are relative to *https://virtserver.swaggerhub.com/JoaoFlorindo/ExampleService/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeMsisdn**](EsbOrdersApi.md#changeMsisdn) | **POST** /orderService/changeMsisdn | adds an inventory item
[**newAccount**](EsbOrdersApi.md#newAccount) | **POST** /orderService/newAccount | adds an inventory item
[**newAccountRelationship**](EsbOrdersApi.md#newAccountRelationship) | **POST** /orderService/newAccountRelationship | adds an inventory item
[**newContact**](EsbOrdersApi.md#newContact) | **POST** /orderService/newContact | Creates new contact
[**newCustomer**](EsbOrdersApi.md#newCustomer) | **POST** /orderService/newCustomer | Create new customer
[**provideOrder**](EsbOrdersApi.md#provideOrder) | **POST** /orderService/provideOrder | adds an inventory item
[**terminateAditionalService**](EsbOrdersApi.md#terminateAditionalService) | **POST** /orderService/terminateAditionalService | adds an inventory item


<a name="changeMsisdn"></a>
# **changeMsisdn**
> changeMsisdn(inventoryItem)

adds an inventory item

Adds an item to the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EsbOrdersApi;


EsbOrdersApi apiInstance = new EsbOrdersApi();
CustomAtribute inventoryItem = new CustomAtribute(); // CustomAtribute | Inventory item to add
try {
    apiInstance.changeMsisdn(inventoryItem);
} catch (ApiException e) {
    System.err.println("Exception when calling EsbOrdersApi#changeMsisdn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryItem** | [**CustomAtribute**](CustomAtribute.md)| Inventory item to add | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="newAccount"></a>
# **newAccount**
> newAccount(inventoryItem)

adds an inventory item

Adds an item to the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EsbOrdersApi;


EsbOrdersApi apiInstance = new EsbOrdersApi();
AccountsData inventoryItem = new AccountsData(); // AccountsData | Inventory item to add
try {
    apiInstance.newAccount(inventoryItem);
} catch (ApiException e) {
    System.err.println("Exception when calling EsbOrdersApi#newAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryItem** | [**AccountsData**](AccountsData.md)| Inventory item to add | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="newAccountRelationship"></a>
# **newAccountRelationship**
> newAccountRelationship(inventoryItem)

adds an inventory item

Adds an item to the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EsbOrdersApi;


EsbOrdersApi apiInstance = new EsbOrdersApi();
CustomAtribute inventoryItem = new CustomAtribute(); // CustomAtribute | Inventory item to add
try {
    apiInstance.newAccountRelationship(inventoryItem);
} catch (ApiException e) {
    System.err.println("Exception when calling EsbOrdersApi#newAccountRelationship");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryItem** | [**CustomAtribute**](CustomAtribute.md)| Inventory item to add | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="newContact"></a>
# **newContact**
> newContact(contactsData)

Creates new contact

A contact is created on Cerillion for each element present in the submission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EsbOrdersApi;


EsbOrdersApi apiInstance = new EsbOrdersApi();
ContactsData contactsData = new ContactsData(); // ContactsData | Detailed Information of contact
try {
    apiInstance.newContact(contactsData);
} catch (ApiException e) {
    System.err.println("Exception when calling EsbOrdersApi#newContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactsData** | [**ContactsData**](ContactsData.md)| Detailed Information of contact | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="newCustomer"></a>
# **newCustomer**
> newCustomer(customersData)

Create new customer

A customer is created on Cerillion for each element present in the submission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EsbOrdersApi;


EsbOrdersApi apiInstance = new EsbOrdersApi();
CustomersData customersData = new CustomersData(); // CustomersData | Detailed information of customer
try {
    apiInstance.newCustomer(customersData);
} catch (ApiException e) {
    System.err.println("Exception when calling EsbOrdersApi#newCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customersData** | [**CustomersData**](CustomersData.md)| Detailed information of customer | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="provideOrder"></a>
# **provideOrder**
> provideOrder(inventoryItem)

adds an inventory item

Adds an item to the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EsbOrdersApi;


EsbOrdersApi apiInstance = new EsbOrdersApi();
CustomAtribute inventoryItem = new CustomAtribute(); // CustomAtribute | Inventory item to add
try {
    apiInstance.provideOrder(inventoryItem);
} catch (ApiException e) {
    System.err.println("Exception when calling EsbOrdersApi#provideOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryItem** | [**CustomAtribute**](CustomAtribute.md)| Inventory item to add | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="terminateAditionalService"></a>
# **terminateAditionalService**
> terminateAditionalService(inventoryItem)

adds an inventory item

Adds an item to the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EsbOrdersApi;


EsbOrdersApi apiInstance = new EsbOrdersApi();
CustomAtribute inventoryItem = new CustomAtribute(); // CustomAtribute | Inventory item to add
try {
    apiInstance.terminateAditionalService(inventoryItem);
} catch (ApiException e) {
    System.err.println("Exception when calling EsbOrdersApi#terminateAditionalService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryItem** | [**CustomAtribute**](CustomAtribute.md)| Inventory item to add | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

