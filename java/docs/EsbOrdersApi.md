# EsbOrdersApi

All URIs are relative to *https://virtserver.swaggerhub.com/JoaoFlorindo/ExampleService/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**newAccount**](EsbOrdersApi.md#newAccount) | **POST** /orderService/newAccount | Creates new account
[**newContact**](EsbOrdersApi.md#newContact) | **POST** /orderService/newContact | Creates new contact
[**newCustomer**](EsbOrdersApi.md#newCustomer) | **POST** /orderService/newCustomer | Create new customer
[**provideOrder**](EsbOrdersApi.md#provideOrder) | **POST** /orderService/provideOrder | Creates new order. An order applies to a single account.


<a name="newAccount"></a>
# **newAccount**
> newAccount(accountData)

Creates new account

An account is created on Cerillion for each element present in the submission.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EsbOrdersApi;


EsbOrdersApi apiInstance = new EsbOrdersApi();
AccountsData accountData = new AccountsData(); // AccountsData | Detailed Information of an account
try {
    apiInstance.newAccount(accountData);
} catch (ApiException e) {
    System.err.println("Exception when calling EsbOrdersApi#newAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountData** | [**AccountsData**](AccountsData.md)| Detailed Information of an account | [optional]

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
ContactsData contactsData = new ContactsData(); // ContactsData | Detailed Information of contact - Notes:   - At least one of these four Phone Number fields must be provided. 
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
 **contactsData** | [**ContactsData**](ContactsData.md)| Detailed Information of contact - Notes:   - At least one of these four Phone Number fields must be provided.  | [optional]

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
> provideOrder(provideOrder)

Creates new order. An order applies to a single account.

A basket is created on Cerillion for each element present in the submission.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EsbOrdersApi;


EsbOrdersApi apiInstance = new EsbOrdersApi();
ProvideOrder provideOrder = new ProvideOrder(); // ProvideOrder | Detailed Information of a provided order
try {
    apiInstance.provideOrder(provideOrder);
} catch (ApiException e) {
    System.err.println("Exception when calling EsbOrdersApi#provideOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provideOrder** | [**ProvideOrder**](ProvideOrder.md)| Detailed Information of a provided order | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

