package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Address;
import io.swagger.client.model.ContactAssociation;
import io.swagger.client.model.CustomAttribute;
import io.swagger.client.model.NameSchema;

/**
 * AccountsData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-02T16:12:54.276Z")
public class AccountsData {
  @SerializedName("accountIndex")
  private String accountIndex = null;

  @SerializedName("clientAccountUid")
  private String clientAccountUid = null;

  @SerializedName("customerIndex")
  private String customerIndex = null;

  @SerializedName("customerUid")
  private Integer customerUid = null;

  @SerializedName("accountOwnersName")
  private NameSchema accountOwnersName = null;

  @SerializedName("companyLegalEntityName")
  private String companyLegalEntityName = null;

  @SerializedName("accountTypeCode")
  private String accountTypeCode = null;

  @SerializedName("accountCategoryCode")
  private String accountCategoryCode = null;

  @SerializedName("accountClassificationCode")
  private String accountClassificationCode = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("currencyCode")
  private String currencyCode = null;

  @SerializedName("corporateId")
  private String corporateId = null;

  @SerializedName("corporateIdType")
  private String corporateIdType = null;

  @SerializedName("billLanguageCode")
  private String billLanguageCode = null;

  @SerializedName("billMediaCode")
  private String billMediaCode = null;

  @SerializedName("billToEmailAddress")
  private String billToEmailAddress = null;

  @SerializedName("billItemisation")
  private String billItemisation = null;

  @SerializedName("basicCollectionPlanCode")
  private String basicCollectionPlanCode = null;

  @SerializedName("paymentTerms")
  private String paymentTerms = null;

  @SerializedName("marketingFlag")
  private Boolean marketingFlag = null;

  @SerializedName("taxSchemeCode")
  private String taxSchemeCode = null;

  @SerializedName("taxIdentification")
  private String taxIdentification = null;

  @SerializedName("faultPriority")
  private Integer faultPriority = null;

  @SerializedName("billingAddress")
  private Address billingAddress = null;

  @SerializedName("correspondenceAddress")
  private Address correspondenceAddress = null;

  @SerializedName("contactAssociation")
  private ContactAssociation contactAssociation = null;

  @SerializedName("contactAttribute")
  private CustomAttribute contactAttribute = null;

  public AccountsData accountIndex(String accountIndex) {
    this.accountIndex = accountIndex;
    return this;
  }

   /**
   * Get accountIndex
   * @return accountIndex
  **/
  @ApiModelProperty(example = "NewAccount-1", required = true, value = "")
  public String getAccountIndex() {
    return accountIndex;
  }

  public void setAccountIndex(String accountIndex) {
    this.accountIndex = accountIndex;
  }

  public AccountsData clientAccountUid(String clientAccountUid) {
    this.clientAccountUid = clientAccountUid;
    return this;
  }

   /**
   * Get clientAccountUid
   * @return clientAccountUid
  **/
  @ApiModelProperty(example = "SF-CUST-1000", required = true, value = "")
  public String getClientAccountUid() {
    return clientAccountUid;
  }

  public void setClientAccountUid(String clientAccountUid) {
    this.clientAccountUid = clientAccountUid;
  }

  public AccountsData customerIndex(String customerIndex) {
    this.customerIndex = customerIndex;
    return this;
  }

   /**
   * Get customerIndex
   * @return customerIndex
  **/
  @ApiModelProperty(example = "SF-ACC-1", value = "")
  public String getCustomerIndex() {
    return customerIndex;
  }

  public void setCustomerIndex(String customerIndex) {
    this.customerIndex = customerIndex;
  }

  public AccountsData customerUid(Integer customerUid) {
    this.customerUid = customerUid;
    return this;
  }

   /**
   * The customer owning the account.   Use the CustomerIndex element to point to a new customer in the submission.   Use the CustomerUid to point to an existing customer on Cerillion. 
   * @return customerUid
  **/
  @ApiModelProperty(example = "301", value = "The customer owning the account.   Use the CustomerIndex element to point to a new customer in the submission.   Use the CustomerUid to point to an existing customer on Cerillion. ")
  public Integer getCustomerUid() {
    return customerUid;
  }

  public void setCustomerUid(Integer customerUid) {
    this.customerUid = customerUid;
  }

  public AccountsData accountOwnersName(NameSchema accountOwnersName) {
    this.accountOwnersName = accountOwnersName;
    return this;
  }

   /**
   * Get accountOwnersName
   * @return accountOwnersName
  **/
  @ApiModelProperty(required = true, value = "")
  public NameSchema getAccountOwnersName() {
    return accountOwnersName;
  }

  public void setAccountOwnersName(NameSchema accountOwnersName) {
    this.accountOwnersName = accountOwnersName;
  }

  public AccountsData companyLegalEntityName(String companyLegalEntityName) {
    this.companyLegalEntityName = companyLegalEntityName;
    return this;
  }

   /**
   * Get companyLegalEntityName
   * @return companyLegalEntityName
  **/
  @ApiModelProperty(example = "Truphone Limited", required = true, value = "")
  public String getCompanyLegalEntityName() {
    return companyLegalEntityName;
  }

  public void setCompanyLegalEntityName(String companyLegalEntityName) {
    this.companyLegalEntityName = companyLegalEntityName;
  }

  public AccountsData accountTypeCode(String accountTypeCode) {
    this.accountTypeCode = accountTypeCode;
    return this;
  }

   /**
   * ACC_SOURCE - Cerillion Ref data The type of account, e.g. BUS, RES 
   * @return accountTypeCode
  **/
  @ApiModelProperty(example = "BUS", required = true, value = "ACC_SOURCE - Cerillion Ref data The type of account, e.g. BUS, RES ")
  public String getAccountTypeCode() {
    return accountTypeCode;
  }

  public void setAccountTypeCode(String accountTypeCode) {
    this.accountTypeCode = accountTypeCode;
  }

  public AccountsData accountCategoryCode(String accountCategoryCode) {
    this.accountCategoryCode = accountCategoryCode;
    return this;
  }

   /**
   * CATEGORY - Cerillion Ref data The account category code, e.g. FI = Business, P1 = Prepay, P3 = Postpay 
   * @return accountCategoryCode
  **/
  @ApiModelProperty(example = "P3", required = true, value = "CATEGORY - Cerillion Ref data The account category code, e.g. FI = Business, P1 = Prepay, P3 = Postpay ")
  public String getAccountCategoryCode() {
    return accountCategoryCode;
  }

  public void setAccountCategoryCode(String accountCategoryCode) {
    this.accountCategoryCode = accountCategoryCode;
  }

  public AccountsData accountClassificationCode(String accountClassificationCode) {
    this.accountClassificationCode = accountClassificationCode;
    return this;
  }

   /**
   * ACCOUNT - Cerillion Ref data The account classification code,e.g. B1 = B2B Standard, B2 = B2B Pilot, C1 = CRIL Standard, R1 = B2C Standard 
   * @return accountClassificationCode
  **/
  @ApiModelProperty(example = "B1", required = true, value = "ACCOUNT - Cerillion Ref data The account classification code,e.g. B1 = B2B Standard, B2 = B2B Pilot, C1 = CRIL Standard, R1 = B2C Standard ")
  public String getAccountClassificationCode() {
    return accountClassificationCode;
  }

  public void setAccountClassificationCode(String accountClassificationCode) {
    this.accountClassificationCode = accountClassificationCode;
  }

  public AccountsData countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Code for country to which the account applies in ISO 3166-1 alpha 2 format  – i.e. 2 upper case characters, e.g. GB, US, AU, DE, ES, HK, NL, PL, RW, RG, RU, RA Note, RW = Rest of World (Euro), RG = Rest of World (GBP), RU = Rest of World (USD), RA = Rest of World (AUD) 
   * @return countryCode
  **/
  @ApiModelProperty(example = "GB", required = true, value = "Code for country to which the account applies in ISO 3166-1 alpha 2 format  – i.e. 2 upper case characters, e.g. GB, US, AU, DE, ES, HK, NL, PL, RW, RG, RU, RA Note, RW = Rest of World (Euro), RG = Rest of World (GBP), RU = Rest of World (USD), RA = Rest of World (AUD) ")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public AccountsData currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Cerilion Ref Data= CURRENCIES Code for currency in which account is to be billed in ISO 4217 form  – i.e. 3 upper case alphabetic characters, e.g. GBP 
   * @return currencyCode
  **/
  @ApiModelProperty(example = "GBP", required = true, value = "Cerilion Ref Data= CURRENCIES Code for currency in which account is to be billed in ISO 4217 form  – i.e. 3 upper case alphabetic characters, e.g. GBP ")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public AccountsData corporateId(String corporateId) {
    this.corporateId = corporateId;
    return this;
  }

   /**
   * The ID of the company specific to the country E.g. Populated with 9 numbers for Poland or 9 characters for Spain 
   * @return corporateId
  **/
  @ApiModelProperty(example = "12345646", value = "The ID of the company specific to the country E.g. Populated with 9 numbers for Poland or 9 characters for Spain ")
  public String getCorporateId() {
    return corporateId;
  }

  public void setCorporateId(String corporateId) {
    this.corporateId = corporateId;
  }

  public AccountsData corporateIdType(String corporateIdType) {
    this.corporateIdType = corporateIdType;
    return this;
  }

   /**
   * The type of the CorporateId E.g. Populated with Regon for Poland or CIF for Spain 
   * @return corporateIdType
  **/
  @ApiModelProperty(example = "Regon", value = "The type of the CorporateId E.g. Populated with Regon for Poland or CIF for Spain ")
  public String getCorporateIdType() {
    return corporateIdType;
  }

  public void setCorporateIdType(String corporateIdType) {
    this.corporateIdType = corporateIdType;
  }

  public AccountsData billLanguageCode(String billLanguageCode) {
    this.billLanguageCode = billLanguageCode;
    return this;
  }

   /**
   * Code of the language in which the account's bills are to be printed language tag language-region format, e.g. en-GB, where language is an ISO 639-1 2 lower case alphabetic character code and region is a country code as defined above. 
   * @return billLanguageCode
  **/
  @ApiModelProperty(example = "en-gb", required = true, value = "Code of the language in which the account's bills are to be printed language tag language-region format, e.g. en-GB, where language is an ISO 639-1 2 lower case alphabetic character code and region is a country code as defined above. ")
  public String getBillLanguageCode() {
    return billLanguageCode;
  }

  public void setBillLanguageCode(String billLanguageCode) {
    this.billLanguageCode = billLanguageCode;
  }

  public AccountsData billMediaCode(String billMediaCode) {
    this.billMediaCode = billMediaCode;
    return this;
  }

   /**
   * Type of media that will be used to produce bill. E.g. PAPER, EMAIL, PAPERMAIL, NOBILL If element is not supplied this will default to EMAIL. 
   * @return billMediaCode
  **/
  @ApiModelProperty(example = "EMAIL", value = "Type of media that will be used to produce bill. E.g. PAPER, EMAIL, PAPERMAIL, NOBILL If element is not supplied this will default to EMAIL. ")
  public String getBillMediaCode() {
    return billMediaCode;
  }

  public void setBillMediaCode(String billMediaCode) {
    this.billMediaCode = billMediaCode;
  }

  public AccountsData billToEmailAddress(String billToEmailAddress) {
    this.billToEmailAddress = billToEmailAddress;
    return this;
  }

   /**
   * [EDEN-3043] The email address for billing purposes 
   * @return billToEmailAddress
  **/
  @ApiModelProperty(example = "bruce.tinsley@asidua.com", value = "[EDEN-3043] The email address for billing purposes ")
  public String getBillToEmailAddress() {
    return billToEmailAddress;
  }

  public void setBillToEmailAddress(String billToEmailAddress) {
    this.billToEmailAddress = billToEmailAddress;
  }

  public AccountsData billItemisation(String billItemisation) {
    this.billItemisation = billItemisation;
    return this;
  }

   /**
   * Bill itemisation. One of= ITEMBOTH, ITEMCSVO or ITEMNONE
   * @return billItemisation
  **/
  @ApiModelProperty(example = "ITEMBOTH", required = true, value = "Bill itemisation. One of= ITEMBOTH, ITEMCSVO or ITEMNONE")
  public String getBillItemisation() {
    return billItemisation;
  }

  public void setBillItemisation(String billItemisation) {
    this.billItemisation = billItemisation;
  }

  public AccountsData basicCollectionPlanCode(String basicCollectionPlanCode) {
    this.basicCollectionPlanCode = basicCollectionPlanCode;
    return this;
  }

   /**
   * The base collection plan for the account, E.g. RES1, BLUE, SME1
   * @return basicCollectionPlanCode
  **/
  @ApiModelProperty(example = "SME1", required = true, value = "The base collection plan for the account, E.g. RES1, BLUE, SME1")
  public String getBasicCollectionPlanCode() {
    return basicCollectionPlanCode;
  }

  public void setBasicCollectionPlanCode(String basicCollectionPlanCode) {
    this.basicCollectionPlanCode = basicCollectionPlanCode;
  }

  public AccountsData paymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
    return this;
  }

   /**
   * Cerillion DB Table- SYSTEM_PARAMETERS where param_code = 'DUEDY' Column is keyed on AccountTypeCode.e.g. RES=30,BUS=45 Defines the number of days until the payment is due. This field must hold an integer as it is passed through to Cerillion as an integer. The type has been left as a string to avoid a change to Salesforce. However, in the next WSDL change this should be updated to an Int. 
   * @return paymentTerms
  **/
  @ApiModelProperty(example = "30", required = true, value = "Cerillion DB Table- SYSTEM_PARAMETERS where param_code = 'DUEDY' Column is keyed on AccountTypeCode.e.g. RES=30,BUS=45 Defines the number of days until the payment is due. This field must hold an integer as it is passed through to Cerillion as an integer. The type has been left as a string to avoid a change to Salesforce. However, in the next WSDL change this should be updated to an Int. ")
  public String getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  public AccountsData marketingFlag(Boolean marketingFlag) {
    this.marketingFlag = marketingFlag;
    return this;
  }

   /**
   * Flag indicating whether the account is allowed to be sent marketing material
   * @return marketingFlag
  **/
  @ApiModelProperty(example = "true", required = true, value = "Flag indicating whether the account is allowed to be sent marketing material")
  public Boolean getMarketingFlag() {
    return marketingFlag;
  }

  public void setMarketingFlag(Boolean marketingFlag) {
    this.marketingFlag = marketingFlag;
  }

  public AccountsData taxSchemeCode(String taxSchemeCode) {
    this.taxSchemeCode = taxSchemeCode;
    return this;
  }

   /**
   * CURTAXSCMS - Cerillion Ref data Code indicating tax scheme applicable to the account. 
   * @return taxSchemeCode
  **/
  @ApiModelProperty(example = "UKS", required = true, value = "CURTAXSCMS - Cerillion Ref data Code indicating tax scheme applicable to the account. ")
  public String getTaxSchemeCode() {
    return taxSchemeCode;
  }

  public void setTaxSchemeCode(String taxSchemeCode) {
    this.taxSchemeCode = taxSchemeCode;
  }

  public AccountsData taxIdentification(String taxIdentification) {
    this.taxIdentification = taxIdentification;
    return this;
  }

   /**
   * Get taxIdentification
   * @return taxIdentification
  **/
  @ApiModelProperty(example = "1234567890", required = true, value = "")
  public String getTaxIdentification() {
    return taxIdentification;
  }

  public void setTaxIdentification(String taxIdentification) {
    this.taxIdentification = taxIdentification;
  }

  public AccountsData faultPriority(Integer faultPriority) {
    this.faultPriority = faultPriority;
    return this;
  }

   /**
   * Code indicating the priority to be assigned to dealing with faults raised against this account (reference data PRIORITY) 
   * @return faultPriority
  **/
  @ApiModelProperty(example = "99", required = true, value = "Code indicating the priority to be assigned to dealing with faults raised against this account (reference data PRIORITY) ")
  public Integer getFaultPriority() {
    return faultPriority;
  }

  public void setFaultPriority(Integer faultPriority) {
    this.faultPriority = faultPriority;
  }

  public AccountsData billingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @ApiModelProperty(required = true, value = "")
  public Address getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }

  public AccountsData correspondenceAddress(Address correspondenceAddress) {
    this.correspondenceAddress = correspondenceAddress;
    return this;
  }

   /**
   * Get correspondenceAddress
   * @return correspondenceAddress
  **/
  @ApiModelProperty(value = "")
  public Address getCorrespondenceAddress() {
    return correspondenceAddress;
  }

  public void setCorrespondenceAddress(Address correspondenceAddress) {
    this.correspondenceAddress = correspondenceAddress;
  }

  public AccountsData contactAssociation(ContactAssociation contactAssociation) {
    this.contactAssociation = contactAssociation;
    return this;
  }

   /**
   * Get contactAssociation
   * @return contactAssociation
  **/
  @ApiModelProperty(value = "")
  public ContactAssociation getContactAssociation() {
    return contactAssociation;
  }

  public void setContactAssociation(ContactAssociation contactAssociation) {
    this.contactAssociation = contactAssociation;
  }

  public AccountsData contactAttribute(CustomAttribute contactAttribute) {
    this.contactAttribute = contactAttribute;
    return this;
  }

   /**
   * Get contactAttribute
   * @return contactAttribute
  **/
  @ApiModelProperty(value = "")
  public CustomAttribute getContactAttribute() {
    return contactAttribute;
  }

  public void setContactAttribute(CustomAttribute contactAttribute) {
    this.contactAttribute = contactAttribute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsData accountsData = (AccountsData) o;
    return Objects.equals(this.accountIndex, accountsData.accountIndex) &&
        Objects.equals(this.clientAccountUid, accountsData.clientAccountUid) &&
        Objects.equals(this.customerIndex, accountsData.customerIndex) &&
        Objects.equals(this.customerUid, accountsData.customerUid) &&
        Objects.equals(this.accountOwnersName, accountsData.accountOwnersName) &&
        Objects.equals(this.companyLegalEntityName, accountsData.companyLegalEntityName) &&
        Objects.equals(this.accountTypeCode, accountsData.accountTypeCode) &&
        Objects.equals(this.accountCategoryCode, accountsData.accountCategoryCode) &&
        Objects.equals(this.accountClassificationCode, accountsData.accountClassificationCode) &&
        Objects.equals(this.countryCode, accountsData.countryCode) &&
        Objects.equals(this.currencyCode, accountsData.currencyCode) &&
        Objects.equals(this.corporateId, accountsData.corporateId) &&
        Objects.equals(this.corporateIdType, accountsData.corporateIdType) &&
        Objects.equals(this.billLanguageCode, accountsData.billLanguageCode) &&
        Objects.equals(this.billMediaCode, accountsData.billMediaCode) &&
        Objects.equals(this.billToEmailAddress, accountsData.billToEmailAddress) &&
        Objects.equals(this.billItemisation, accountsData.billItemisation) &&
        Objects.equals(this.basicCollectionPlanCode, accountsData.basicCollectionPlanCode) &&
        Objects.equals(this.paymentTerms, accountsData.paymentTerms) &&
        Objects.equals(this.marketingFlag, accountsData.marketingFlag) &&
        Objects.equals(this.taxSchemeCode, accountsData.taxSchemeCode) &&
        Objects.equals(this.taxIdentification, accountsData.taxIdentification) &&
        Objects.equals(this.faultPriority, accountsData.faultPriority) &&
        Objects.equals(this.billingAddress, accountsData.billingAddress) &&
        Objects.equals(this.correspondenceAddress, accountsData.correspondenceAddress) &&
        Objects.equals(this.contactAssociation, accountsData.contactAssociation) &&
        Objects.equals(this.contactAttribute, accountsData.contactAttribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIndex, clientAccountUid, customerIndex, customerUid, accountOwnersName, companyLegalEntityName, accountTypeCode, accountCategoryCode, accountClassificationCode, countryCode, currencyCode, corporateId, corporateIdType, billLanguageCode, billMediaCode, billToEmailAddress, billItemisation, basicCollectionPlanCode, paymentTerms, marketingFlag, taxSchemeCode, taxIdentification, faultPriority, billingAddress, correspondenceAddress, contactAssociation, contactAttribute);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsData {\n");
    
    sb.append("    accountIndex: ").append(toIndentedString(accountIndex)).append("\n");
    sb.append("    clientAccountUid: ").append(toIndentedString(clientAccountUid)).append("\n");
    sb.append("    customerIndex: ").append(toIndentedString(customerIndex)).append("\n");
    sb.append("    customerUid: ").append(toIndentedString(customerUid)).append("\n");
    sb.append("    accountOwnersName: ").append(toIndentedString(accountOwnersName)).append("\n");
    sb.append("    companyLegalEntityName: ").append(toIndentedString(companyLegalEntityName)).append("\n");
    sb.append("    accountTypeCode: ").append(toIndentedString(accountTypeCode)).append("\n");
    sb.append("    accountCategoryCode: ").append(toIndentedString(accountCategoryCode)).append("\n");
    sb.append("    accountClassificationCode: ").append(toIndentedString(accountClassificationCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    corporateId: ").append(toIndentedString(corporateId)).append("\n");
    sb.append("    corporateIdType: ").append(toIndentedString(corporateIdType)).append("\n");
    sb.append("    billLanguageCode: ").append(toIndentedString(billLanguageCode)).append("\n");
    sb.append("    billMediaCode: ").append(toIndentedString(billMediaCode)).append("\n");
    sb.append("    billToEmailAddress: ").append(toIndentedString(billToEmailAddress)).append("\n");
    sb.append("    billItemisation: ").append(toIndentedString(billItemisation)).append("\n");
    sb.append("    basicCollectionPlanCode: ").append(toIndentedString(basicCollectionPlanCode)).append("\n");
    sb.append("    paymentTerms: ").append(toIndentedString(paymentTerms)).append("\n");
    sb.append("    marketingFlag: ").append(toIndentedString(marketingFlag)).append("\n");
    sb.append("    taxSchemeCode: ").append(toIndentedString(taxSchemeCode)).append("\n");
    sb.append("    taxIdentification: ").append(toIndentedString(taxIdentification)).append("\n");
    sb.append("    faultPriority: ").append(toIndentedString(faultPriority)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    correspondenceAddress: ").append(toIndentedString(correspondenceAddress)).append("\n");
    sb.append("    contactAssociation: ").append(toIndentedString(contactAssociation)).append("\n");
    sb.append("    contactAttribute: ").append(toIndentedString(contactAttribute)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

