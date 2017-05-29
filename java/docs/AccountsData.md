
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
**accountTypeCode** | **String** | ACC_SOURCE - Cerillion Ref data The type of account, e.g. BUS, RES  | 
**accountCategoryCode** | **String** | CATEGORY - Cerillion Ref data The account category code, e.g. FI &#x3D; Business, P1 &#x3D; Prepay, P3 &#x3D; Postpay  | 
**accountClassificationCode** | **String** | ACCOUNT - Cerillion Ref data The account classification code,e.g. B1 &#x3D; B2B Standard, B2 &#x3D; B2B Pilot, C1 &#x3D; CRIL Standard, R1 &#x3D; B2C Standard  | 
**countryCode** | **String** | Code for country to which the account applies in ISO 3166-1 alpha 2 format  – i.e. 2 upper case characters, e.g. GB, US, AU, DE, ES, HK, NL, PL, RW, RG, RU, RA Note, RW &#x3D; Rest of World (Euro), RG &#x3D; Rest of World (GBP), RU &#x3D; Rest of World (USD), RA &#x3D; Rest of World (AUD)  | 
**currencyCode** | **String** | Cerilion Ref Data&#x3D; CURRENCIES Code for currency in which account is to be billed in ISO 4217 form  – i.e. 3 upper case alphabetic characters, e.g. GBP  | 
**corporateId** | **String** | The ID of the company specific to the country E.g. Populated with 9 numbers for Poland or 9 characters for Spain  |  [optional]
**corporateIdType** | **String** | The type of the CorporateId E.g. Populated with Regon for Poland or CIF for Spain  |  [optional]
**billLanguageCode** | **String** | Code of the language in which the account&#39;s bills are to be printed language tag language-region format, e.g. en-GB, where language is an ISO 639-1 2 lower case alphabetic character code and region is a country code as defined above.  | 
**billMediaCode** | **String** | Type of media that will be used to produce bill. E.g. PAPER, EMAIL, PAPERMAIL, NOBILL If element is not supplied this will default to EMAIL.  |  [optional]
**billToEmailAddress** | **String** | [EDEN-3043] The email address for billing purposes  |  [optional]
**billItemisation** | **String** | Bill itemisation. One of&#x3D; ITEMBOTH, ITEMCSVO or ITEMNONE | 
**basicCollectionPlanCode** | **String** | The base collection plan for the account, E.g. RES1, BLUE, SME1 | 
**paymentTerms** | **String** | Cerillion DB Table- SYSTEM_PARAMETERS where param_code &#x3D; &#39;DUEDY&#39; Column is keyed on AccountTypeCode.e.g. RES&#x3D;30,BUS&#x3D;45 Defines the number of days until the payment is due. This field must hold an integer as it is passed through to Cerillion as an integer. The type has been left as a string to avoid a change to Salesforce. However, in the next WSDL change this should be updated to an Int.  | 
**marketingFlag** | **Boolean** | Flag indicating whether the account is allowed to be sent marketing material | 
**taxSchemeCode** | **String** | CURTAXSCMS - Cerillion Ref data Code indicating tax scheme applicable to the account.  | 
**taxIdentification** | **String** |  | 
**faultPriority** | **Integer** | Code indicating the priority to be assigned to dealing with faults raised against this account (reference data PRIORITY)  | 
**billingAddress** | [**Address**](Address.md) |  | 
**correspondenceAddress** | [**Address**](Address.md) |  |  [optional]
**contactAssociation** | [**ContactAssociation**](ContactAssociation.md) |  |  [optional]
**contactAttribute** | [**CustomAtribute**](CustomAtribute.md) |  |  [optional]



