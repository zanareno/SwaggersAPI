# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

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

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.EsbOrdersApi;

import java.io.File;
import java.util.*;

public class EsbOrdersApiExample {

    public static void main(String[] args) {
        
        EsbOrdersApi apiInstance = new EsbOrdersApi();
        AccountsData accountData = new AccountsData(); // AccountsData | Detailed Information of an account
        try {
            apiInstance.newAccount(accountData);
        } catch (ApiException e) {
            System.err.println("Exception when calling EsbOrdersApi#newAccount");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://virtserver.swaggerhub.com/JoaoFlorindo/ExampleService/1.0.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EsbOrdersApi* | [**newAccount**](docs/EsbOrdersApi.md#newAccount) | **POST** /orderService/newAccount | Creates new account
*EsbOrdersApi* | [**newContact**](docs/EsbOrdersApi.md#newContact) | **POST** /orderService/newContact | Creates new contact
*EsbOrdersApi* | [**newCustomer**](docs/EsbOrdersApi.md#newCustomer) | **POST** /orderService/newCustomer | Create new customer


## Documentation for Models

 - [AccountsData](docs/AccountsData.md)
 - [Address](docs/Address.md)
 - [Charge](docs/Charge.md)
 - [ContactAssociation](docs/ContactAssociation.md)
 - [ContactsData](docs/ContactsData.md)
 - [CustomAttribute](docs/CustomAttribute.md)
 - [CustomersData](docs/CustomersData.md)
 - [Discount](docs/Discount.md)
 - [NameSchema](docs/NameSchema.md)
 - [OrdersItem](docs/OrdersItem.md)
 - [ProvideOrder](docs/ProvideOrder.md)
 - [SubOrderItems](docs/SubOrderItems.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

you@your-company.com

