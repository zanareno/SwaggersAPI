
# ProvideOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientProvideOrderId** | **String** | Client&#39;s unique identifier for the Provide Order  |  [optional]
**accountIndex** | **String** | The account against which the order is to be raised.  This can be defined in one of two ways 1) AccountIndex element to point to a new account in the submission. 2) Use the AccountUid to point to an exisiting account on Cerillion.  |  [optional]
**accountUid** | **Integer** |  |  [optional]
**accountCurrencyId** | **Integer** | The Cerillion id of the currency that the override price, if specified is in. Only required if override values are being provided. The values supported by Cerillion are&#x3D;  0  AUD;1 EUR;2  GBP;3  HKD;4  USD; Note, the full set of values can be obtained from Cerillion via the getCurrencyList function   |  [optional]
**requestedStartDate** | [**LocalDate**](LocalDate.md) | The date requested by the customer for the ordered items to take effect. |  [optional]
**orderAttribute** | [**CustomAttribute**](CustomAttribute.md) |  | 
**orderItem** | [**OrdersItem**](OrdersItem.md) |  | 



