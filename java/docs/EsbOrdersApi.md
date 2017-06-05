# EsbOrdersApi

All URIs are relative to *https://virtserver.swaggerhub.com/JoaoFlorindo/ExampleService/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeMsisdn**](EsbOrdersApi.md#changeMsisdn) | **PUT** /orderService/changeMsisdn | Update Msisdn
[**deleteAdditionalService**](EsbOrdersApi.md#deleteAdditionalService) | **DELETE** /orderService/deleteAdditionalService | Delete Additional Service
[**newAccount**](EsbOrdersApi.md#newAccount) | **POST** /orderService/newAccount | Creates new account
[**newAccountRelationship**](EsbOrdersApi.md#newAccountRelationship) | **POST** /orderService/newAccountRelationship | Creates new AccountRelationship. A new account to account relationship.
[**newContact**](EsbOrdersApi.md#newContact) | **POST** /orderService/newContact | Creates new contact
[**newCustomer**](EsbOrdersApi.md#newCustomer) | **POST** /orderService/newCustomer | Create new customer
[**provideOrder**](EsbOrdersApi.md#provideOrder) | **POST** /orderService/provideOrder | Creates new order. An order applies to a single account.
[**terminateAdditionalService**](EsbOrdersApi.md#terminateAdditionalService) | **PUT** /orderService/terminateAdditionalService | Terminate Additional Service


<a name="changeMsisdn"></a>
# **changeMsisdn**
> changeMsisdn(changeMsisdn)

Update Msisdn

Update Msisdn

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EsbOrdersApi;


EsbOrdersApi apiInstance = new EsbOrdersApi();
ChangeMsisdn changeMsisdn = new ChangeMsisdn(); // ChangeMsisdn | Update Msisdn
try {
    apiInstance.changeMsisdn(changeMsisdn);
} catch (ApiException e) {
    System.err.println("Exception when calling EsbOrdersApi#changeMsisdn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changeMsisdn** | [**ChangeMsisdn**](ChangeMsisdn.md)| Update Msisdn | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAdditionalService"></a>
# **deleteAdditionalService**
> deleteAdditionalService(deleteAdditionalService)

Delete Additional Service

Terminate an additional service associationed with a subscription. Does not support terminating the primary service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EsbOrdersApi;


EsbOrdersApi apiInstance = new EsbOrdersApi();
TerminateAdditionalService deleteAdditionalService = new TerminateAdditionalService(); // TerminateAdditionalService | Delete Additional Service
try {
    apiInstance.deleteAdditionalService(deleteAdditionalService);
} catch (ApiException e) {
    System.err.println("Exception when calling EsbOrdersApi#deleteAdditionalService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteAdditionalService** | [**TerminateAdditionalService**](TerminateAdditionalService.md)| Delete Additional Service | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

<a name="newAccountRelationship"></a>
# **newAccountRelationship**
> newAccountRelationship(newAccountRelationship)

Creates new AccountRelationship. A new account to account relationship.

A relationship is created on Cerillion for each element present in the submission.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EsbOrdersApi;


EsbOrdersApi apiInstance = new EsbOrdersApi();
NewAccountRelationship newAccountRelationship = new NewAccountRelationship(); // NewAccountRelationship | Detailed Information of a account relationship.
try {
    apiInstance.newAccountRelationship(newAccountRelationship);
} catch (ApiException e) {
    System.err.println("Exception when calling EsbOrdersApi#newAccountRelationship");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newAccountRelationship** | [**NewAccountRelationship**](NewAccountRelationship.md)| Detailed Information of a account relationship. | [optional]

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

<a name="terminateAdditionalService"></a>
# **terminateAdditionalService**
> terminateAdditionalService(terminateAdditionalService)

Terminate Additional Service

Terminate an additional service associationed with a subscription. Does not support terminating the primary service. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EsbOrdersApi;


EsbOrdersApi apiInstance = new EsbOrdersApi();
TerminateAdditionalService terminateAdditionalService = new TerminateAdditionalService(); // TerminateAdditionalService | Terminate Additional Service
try {
    apiInstance.terminateAdditionalService(terminateAdditionalService);
} catch (ApiException e) {
    System.err.println("Exception when calling EsbOrdersApi#terminateAdditionalService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terminateAdditionalService** | [**TerminateAdditionalService**](TerminateAdditionalService.md)| Terminate Additional Service | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

