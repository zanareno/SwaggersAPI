package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Address;
import io.swagger.client.model.CustomAtribute;
import io.swagger.client.model.NameSchema;

/**
 * ContactsData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-29T14:09:19.760Z")
public class ContactsData {
  @SerializedName("customerIndex")
  private String customerIndex = null;

  @SerializedName("clientCustomerUid")
  private String clientCustomerUid = null;

  @SerializedName("contactsName")
  private NameSchema contactsName = null;

  @SerializedName("consumerId")
  private String consumerId = null;

  @SerializedName("consumerType")
  private String consumerType = null;

  @SerializedName("phoneNumberHome")
  private String phoneNumberHome = null;

  @SerializedName("phoneNumberBusiness")
  private String phoneNumberBusiness = null;

  @SerializedName("phoneNumberFax")
  private String phoneNumberFax = null;

  @SerializedName("phoneNumberMobile")
  private String phoneNumberMobile = null;

  @SerializedName("emailAddress1")
  private String emailAddress1 = null;

  @SerializedName("emailAddress2")
  private String emailAddress2 = null;

  @SerializedName("customerImportanceReason")
  private String customerImportanceReason = null;

  @SerializedName("correspondenceAddress")
  private Address correspondenceAddress = null;

  @SerializedName("groupCode")
  private String groupCode = null;

  @SerializedName("contactAttribute")
  private CustomAtribute contactAttribute = null;

  public ContactsData customerIndex(String customerIndex) {
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

  public ContactsData clientCustomerUid(String clientCustomerUid) {
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

  public ContactsData contactsName(NameSchema contactsName) {
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

  public ContactsData consumerId(String consumerId) {
    this.consumerId = consumerId;
    return this;
  }

   /**
   * Generic identification number, such as passport or driving licence number.
   * @return consumerId
  **/
  @ApiModelProperty(example = "GB79416235897", value = "Generic identification number, such as passport or driving licence number.")
  public String getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }

  public ContactsData consumerType(String consumerType) {
    this.consumerType = consumerType;
    return this;
  }

   /**
   * E.g. Passport, SocialSecurityNumber
   * @return consumerType
  **/
  @ApiModelProperty(example = "Passport", value = "E.g. Passport, SocialSecurityNumber")
  public String getConsumerType() {
    return consumerType;
  }

  public void setConsumerType(String consumerType) {
    this.consumerType = consumerType;
  }

  public ContactsData phoneNumberHome(String phoneNumberHome) {
    this.phoneNumberHome = phoneNumberHome;
    return this;
  }

   /**
   * Get phoneNumberHome
   * @return phoneNumberHome
  **/
  @ApiModelProperty(example = "2.890725E9", value = "")
  public String getPhoneNumberHome() {
    return phoneNumberHome;
  }

  public void setPhoneNumberHome(String phoneNumberHome) {
    this.phoneNumberHome = phoneNumberHome;
  }

  public ContactsData phoneNumberBusiness(String phoneNumberBusiness) {
    this.phoneNumberBusiness = phoneNumberBusiness;
    return this;
  }

   /**
   * Get phoneNumberBusiness
   * @return phoneNumberBusiness
  **/
  @ApiModelProperty(example = "2.890726E9", value = "")
  public String getPhoneNumberBusiness() {
    return phoneNumberBusiness;
  }

  public void setPhoneNumberBusiness(String phoneNumberBusiness) {
    this.phoneNumberBusiness = phoneNumberBusiness;
  }

  public ContactsData phoneNumberFax(String phoneNumberFax) {
    this.phoneNumberFax = phoneNumberFax;
    return this;
  }

   /**
   * Get phoneNumberFax
   * @return phoneNumberFax
  **/
  @ApiModelProperty(example = "2.890735E9", value = "")
  public String getPhoneNumberFax() {
    return phoneNumberFax;
  }

  public void setPhoneNumberFax(String phoneNumberFax) {
    this.phoneNumberFax = phoneNumberFax;
  }

  public ContactsData phoneNumberMobile(String phoneNumberMobile) {
    this.phoneNumberMobile = phoneNumberMobile;
    return this;
  }

   /**
   * Get phoneNumberMobile
   * @return phoneNumberMobile
  **/
  @ApiModelProperty(example = "95417250000", value = "")
  public String getPhoneNumberMobile() {
    return phoneNumberMobile;
  }

  public void setPhoneNumberMobile(String phoneNumberMobile) {
    this.phoneNumberMobile = phoneNumberMobile;
  }

  public ContactsData emailAddress1(String emailAddress1) {
    this.emailAddress1 = emailAddress1;
    return this;
  }

   /**
   * Get emailAddress1
   * @return emailAddress1
  **/
  @ApiModelProperty(example = "me@here.com", value = "")
  public String getEmailAddress1() {
    return emailAddress1;
  }

  public void setEmailAddress1(String emailAddress1) {
    this.emailAddress1 = emailAddress1;
  }

  public ContactsData emailAddress2(String emailAddress2) {
    this.emailAddress2 = emailAddress2;
    return this;
  }

   /**
   * Get emailAddress2
   * @return emailAddress2
  **/
  @ApiModelProperty(example = "me2@here.com", value = "")
  public String getEmailAddress2() {
    return emailAddress2;
  }

  public void setEmailAddress2(String emailAddress2) {
    this.emailAddress2 = emailAddress2;
  }

  public ContactsData customerImportanceReason(String customerImportanceReason) {
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

  public ContactsData correspondenceAddress(Address correspondenceAddress) {
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

  public ContactsData groupCode(String groupCode) {
    this.groupCode = groupCode;
    return this;
  }

   /**
   * Client supplied identifier that allows a set of contacts to be grouped together
   * @return groupCode
  **/
  @ApiModelProperty(value = "Client supplied identifier that allows a set of contacts to be grouped together")
  public String getGroupCode() {
    return groupCode;
  }

  public void setGroupCode(String groupCode) {
    this.groupCode = groupCode;
  }

  public ContactsData contactAttribute(CustomAtribute contactAttribute) {
    this.contactAttribute = contactAttribute;
    return this;
  }

   /**
   * Get contactAttribute
   * @return contactAttribute
  **/
  @ApiModelProperty(value = "")
  public CustomAtribute getContactAttribute() {
    return contactAttribute;
  }

  public void setContactAttribute(CustomAtribute contactAttribute) {
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
    ContactsData contactsData = (ContactsData) o;
    return Objects.equals(this.customerIndex, contactsData.customerIndex) &&
        Objects.equals(this.clientCustomerUid, contactsData.clientCustomerUid) &&
        Objects.equals(this.contactsName, contactsData.contactsName) &&
        Objects.equals(this.consumerId, contactsData.consumerId) &&
        Objects.equals(this.consumerType, contactsData.consumerType) &&
        Objects.equals(this.phoneNumberHome, contactsData.phoneNumberHome) &&
        Objects.equals(this.phoneNumberBusiness, contactsData.phoneNumberBusiness) &&
        Objects.equals(this.phoneNumberFax, contactsData.phoneNumberFax) &&
        Objects.equals(this.phoneNumberMobile, contactsData.phoneNumberMobile) &&
        Objects.equals(this.emailAddress1, contactsData.emailAddress1) &&
        Objects.equals(this.emailAddress2, contactsData.emailAddress2) &&
        Objects.equals(this.customerImportanceReason, contactsData.customerImportanceReason) &&
        Objects.equals(this.correspondenceAddress, contactsData.correspondenceAddress) &&
        Objects.equals(this.groupCode, contactsData.groupCode) &&
        Objects.equals(this.contactAttribute, contactsData.contactAttribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerIndex, clientCustomerUid, contactsName, consumerId, consumerType, phoneNumberHome, phoneNumberBusiness, phoneNumberFax, phoneNumberMobile, emailAddress1, emailAddress2, customerImportanceReason, correspondenceAddress, groupCode, contactAttribute);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactsData {\n");
    
    sb.append("    customerIndex: ").append(toIndentedString(customerIndex)).append("\n");
    sb.append("    clientCustomerUid: ").append(toIndentedString(clientCustomerUid)).append("\n");
    sb.append("    contactsName: ").append(toIndentedString(contactsName)).append("\n");
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    consumerType: ").append(toIndentedString(consumerType)).append("\n");
    sb.append("    phoneNumberHome: ").append(toIndentedString(phoneNumberHome)).append("\n");
    sb.append("    phoneNumberBusiness: ").append(toIndentedString(phoneNumberBusiness)).append("\n");
    sb.append("    phoneNumberFax: ").append(toIndentedString(phoneNumberFax)).append("\n");
    sb.append("    phoneNumberMobile: ").append(toIndentedString(phoneNumberMobile)).append("\n");
    sb.append("    emailAddress1: ").append(toIndentedString(emailAddress1)).append("\n");
    sb.append("    emailAddress2: ").append(toIndentedString(emailAddress2)).append("\n");
    sb.append("    customerImportanceReason: ").append(toIndentedString(customerImportanceReason)).append("\n");
    sb.append("    correspondenceAddress: ").append(toIndentedString(correspondenceAddress)).append("\n");
    sb.append("    groupCode: ").append(toIndentedString(groupCode)).append("\n");
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

