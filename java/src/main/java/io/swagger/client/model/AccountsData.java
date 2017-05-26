package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Address;
import io.swagger.client.model.ContactAssociation;
import io.swagger.client.model.NameSchema;

/**
 * AccountsData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-26T12:09:43.399Z")
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

  @SerializedName("correspondenceAddress")
  private Address correspondenceAddress = null;

  @SerializedName("contactAssociation")
  private ContactAssociation contactAssociation = null;

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
   * The type of account, e.g. BUS, RES
   * @return accountTypeCode
  **/
  @ApiModelProperty(example = "CCLSCATE - Cerillion Ref data", required = true, value = "The type of account, e.g. BUS, RES")
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
   * Get accountCategoryCode
   * @return accountCategoryCode
  **/
  @ApiModelProperty(example = "CCLSCLAS - Cerillion Ref data", required = true, value = "")
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
   * Get accountClassificationCode
   * @return accountClassificationCode
  **/
  @ApiModelProperty(example = "Gold", required = true, value = "")
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
        Objects.equals(this.correspondenceAddress, accountsData.correspondenceAddress) &&
        Objects.equals(this.contactAssociation, accountsData.contactAssociation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIndex, clientAccountUid, customerIndex, customerUid, accountOwnersName, companyLegalEntityName, accountTypeCode, accountCategoryCode, accountClassificationCode, countryCode, currencyCode, correspondenceAddress, contactAssociation);
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
    sb.append("    correspondenceAddress: ").append(toIndentedString(correspondenceAddress)).append("\n");
    sb.append("    contactAssociation: ").append(toIndentedString(contactAssociation)).append("\n");
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

