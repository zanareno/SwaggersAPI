
# Discount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discountValue** | **Double** | The discounted value of the charge. This value overrides the standard price in the catalogue for the specified period of time. This is in the currency specified by AccountCurrencyId.  | 
**originalValue** | **Double** | The original value of the charge. After the discount has expired this charge applies. This is in the currency specified by AccountCurrencyId.  | 
**discountStartDate** | [**LocalDate**](LocalDate.md) | The date that the discount begins. Currently this is unsupported as the discount begins when the product begins. | 
**discountEndDate** | [**LocalDate**](LocalDate.md) | The date that the discount ends. | 



