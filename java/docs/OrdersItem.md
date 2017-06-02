
# OrdersItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderItemIndex** | **String** | An index uniquely identifying the order item within the submission. Only required if there is a need to link one order item to another.  |  [optional]
**relatedOrderItemIndex** | **String** | The order item that this order item is related to. This mechanism is used to link an account bundle to a package.  |  [optional]
**clientOrderItemId** | **String** | Client&#39;s unique identifier for the Order Item | 
**productType** | **String** | The type of product being ordered. One of; -PACKAGE;A package such as Elite 500 -ACCOUNT;An Account level product not related to a Subscription. -SUBSCRIPTION;An account level product related to a subscription. Only one PACKAGE is permitted in an Order Item  | 
**productCode** | **String** | The unique code of the saleable product being ordered. | 
**creditProfileCode** | **String** | The code of the credit profile assigned to the service. The credit profile record defines various credit limits and bar settings.   This setting is only required for the PACKAGE Product Type  |  [optional]
**dispatchMethod** | **String** | The method of dispatch.Allowable values are&#x3D; INTERNAL, EXTERNAL This field is used to choose the work order on Cerillion  This setting is only required the PACKAGE product type  |  [optional]
**msisdnType** | **String** | The type of MSISDN to assign to the user’s services. One of STANDARD;  GOLDEN;  PORTED_IN; This setting is only required the PACKAGE product type  |  [optional]
**productAttribute** | [**CustomAttribute**](CustomAttribute.md) |  |  [optional]
**contactAssiociation** | [**ContactAssociation**](ContactAssociation.md) |  |  [optional]
**charge** | [**Charge**](Charge.md) |  |  [optional]
**subOrderItems** | [**SubOrderItems**](SubOrderItems.md) |  |  [optional]



