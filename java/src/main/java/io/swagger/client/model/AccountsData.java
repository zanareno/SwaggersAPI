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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-26T11:46:21.112Z")
public class AccountsData {
  @SerializedName("customerIndex")
  private String customerIndex = null;

  @SerializedName("clientCustomerUid")
  private String clientCustomerUid = null;

  @SerializedName("contactsName")
  private NameSchema contactsName = null;

  @SerializedName("phoneNumberHome")
  private String phoneNumberHome = null;

  @SerializedName("phoneNumberBusiness")
  private String phoneNumberBusiness = null;

  @SerializedName("phoneNumberFax")
  private String phoneNumberFax = null;

  @SerializedName("phoneNumberMobile")
  private String phoneNumberMobile = null;

  @SerializedName("customerImportanceReason")
  private String customerImportanceReason = null;

  @SerializedName("correspondenceAddress")
  private Address correspondenceAddress = null;

  @SerializedName("contactAssociation")
  private ContactAssociation contactAssociation = null;

  public AccountsData customerIndex(String customerIndex) {
    this.customerIndex = customerIndex;
    return this;
  }

   /**
   * Get customerIndex
   * @return customerIndex
  **/
  @ApiModelProperty(example = "NewCust-1", required = true, value = "")
  public String getCustomerIndex() {
    return customerIndex;
  }

  public void setCustomerIndex(String customerIndex) {
    this.customerIndex = customerIndex;
  }

  public AccountsData clientCustomerUid(String clientCustomerUid) {
    this.clientCustomerUid = clientCustomerUid;
    return this;
  }

   /**
   * Get clientCustomerUid
   * @return clientCustomerUid
  **/
  @ApiModelProperty(example = "SF-CUST-1000", required = true, value = "")
  public String getClientCustomerUid() {
    return clientCustomerUid;
  }

  public void setClientCustomerUid(String clientCustomerUid) {
    this.clientCustomerUid = clientCustomerUid;
  }

  public AccountsData contactsName(NameSchema contactsName) {
    this.contactsName = contactsName;
    return this;
  }

   /**
   * Get contactsName
   * @return contactsName
  **/
  @ApiModelProperty(required = true, value = "")
  public NameSchema getContactsName() {
    return contactsName;
  }

  public void setContactsName(NameSchema contactsName) {
    this.contactsName = contactsName;
  }

  public AccountsData phoneNumberHome(String phoneNumberHome) {
    this.phoneNumberHome = phoneNumberHome;
    return this;
  }

   /**
   * Get phoneNumberHome
   * @return phoneNumberHome
  **/
  @ApiModelProperty(example = "B2B", value = "")
  public String getPhoneNumberHome() {
    return phoneNumberHome;
  }

  public void setPhoneNumberHome(String phoneNumberHome) {
    this.phoneNumberHome = phoneNumberHome;
  }

  public AccountsData phoneNumberBusiness(String phoneNumberBusiness) {
    this.phoneNumberBusiness = phoneNumberBusiness;
    return this;
  }

   /**
   * Get phoneNumberBusiness
   * @return phoneNumberBusiness
  **/
  @ApiModelProperty(example = "CCLSCATE - Cerillion Ref data", value = "")
  public String getPhoneNumberBusiness() {
    return phoneNumberBusiness;
  }

  public void setPhoneNumberBusiness(String phoneNumberBusiness) {
    this.phoneNumberBusiness = phoneNumberBusiness;
  }

  public AccountsData phoneNumberFax(String phoneNumberFax) {
    this.phoneNumberFax = phoneNumberFax;
    return this;
  }

   /**
   * Get phoneNumberFax
   * @return phoneNumberFax
  **/
  @ApiModelProperty(example = "CCLSCLAS - Cerillion Ref data", value = "")
  public String getPhoneNumberFax() {
    return phoneNumberFax;
  }

  public void setPhoneNumberFax(String phoneNumberFax) {
    this.phoneNumberFax = phoneNumberFax;
  }

  public AccountsData phoneNumberMobile(String phoneNumberMobile) {
    this.phoneNumberMobile = phoneNumberMobile;
    return this;
  }

   /**
   * Get phoneNumberMobile
   * @return phoneNumberMobile
  **/
  @ApiModelProperty(example = "Gold", value = "")
  public String getPhoneNumberMobile() {
    return phoneNumberMobile;
  }

  public void setPhoneNumberMobile(String phoneNumberMobile) {
    this.phoneNumberMobile = phoneNumberMobile;
  }

  public AccountsData customerImportanceReason(String customerImportanceReason) {
    this.customerImportanceReason = customerImportanceReason;
    return this;
  }

   /**
   * Get customerImportanceReason
   * @return customerImportanceReason
  **/
  @ApiModelProperty(example = "Person is an MP", value = "")
  public String getCustomerImportanceReason() {
    return customerImportanceReason;
  }

  public void setCustomerImportanceReason(String customerImportanceReason) {
    this.customerImportanceReason = customerImportanceReason;
  }

  public AccountsData correspondenceAddress(Address correspondenceAddress) {
    this.correspondenceAddress = correspondenceAddress;
    return this;
  }

   /**
   * Get correspondenceAddress
   * @return correspondenceAddress
  **/
  @ApiModelProperty(required = true, value = "")
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
    return Objects.equals(this.customerIndex, accountsData.customerIndex) &&
        Objects.equals(this.clientCustomerUid, accountsData.clientCustomerUid) &&
        Objects.equals(this.contactsName, accountsData.contactsName) &&
        Objects.equals(this.phoneNumberHome, accountsData.phoneNumberHome) &&
        Objects.equals(this.phoneNumberBusiness, accountsData.phoneNumberBusiness) &&
        Objects.equals(this.phoneNumberFax, accountsData.phoneNumberFax) &&
        Objects.equals(this.phoneNumberMobile, accountsData.phoneNumberMobile) &&
        Objects.equals(this.customerImportanceReason, accountsData.customerImportanceReason) &&
        Objects.equals(this.correspondenceAddress, accountsData.correspondenceAddress) &&
        Objects.equals(this.contactAssociation, accountsData.contactAssociation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerIndex, clientCustomerUid, contactsName, phoneNumberHome, phoneNumberBusiness, phoneNumberFax, phoneNumberMobile, customerImportanceReason, correspondenceAddress, contactAssociation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsData {\n");
    
    sb.append("    customerIndex: ").append(toIndentedString(customerIndex)).append("\n");
    sb.append("    clientCustomerUid: ").append(toIndentedString(clientCustomerUid)).append("\n");
    sb.append("    contactsName: ").append(toIndentedString(contactsName)).append("\n");
    sb.append("    phoneNumberHome: ").append(toIndentedString(phoneNumberHome)).append("\n");
    sb.append("    phoneNumberBusiness: ").append(toIndentedString(phoneNumberBusiness)).append("\n");
    sb.append("    phoneNumberFax: ").append(toIndentedString(phoneNumberFax)).append("\n");
    sb.append("    phoneNumberMobile: ").append(toIndentedString(phoneNumberMobile)).append("\n");
    sb.append("    customerImportanceReason: ").append(toIndentedString(customerImportanceReason)).append("\n");
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

