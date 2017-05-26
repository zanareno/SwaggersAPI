
# AccountsData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountIndex** | **String** |  | 
**clientAccountUid** | **String** |  | 
**customerIndex** | **String** |  |  [optional]
**customerUid** | **Integer** | The customer owning the account.   Use the CustomerIndex element to point to a new customer in the submission.   Use the CustomerUid to point to an existing customer on Cerillion.  |  [optional]
**accountOwnersName** | [**NameSchema**](NameSchema.md) |  | 
**companyLegalEntityName** | **String** |  | 
**accountTypeCode** | **String** | The type of account, e.g. BUS, RES | 
**accountCategoryCode** | **String** |  | 
**accountClassificationCode** | **String** |  | 
**countryCode** | **String** | Code for country to which the account applies in ISO 3166-1 alpha 2 format  – i.e. 2 upper case characters, e.g. GB, US, AU, DE, ES, HK, NL, PL, RW, RG, RU, RA Note, RW &#x3D; Rest of World (Euro), RG &#x3D; Rest of World (GBP), RU &#x3D; Rest of World (USD), RA &#x3D; Rest of World (AUD)  | 
**currencyCode** | **String** | Cerilion Ref Data&#x3D; CURRENCIES Code for currency in which account is to be billed in ISO 4217 form  – i.e. 3 upper case alphabetic characters, e.g. GBP  | 
**correspondenceAddress** | [**Address**](Address.md) |  |  [optional]
**contactAssociation** | [**ContactAssociation**](ContactAssociation.md) |  |  [optional]



