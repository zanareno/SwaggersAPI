package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Address;
import io.swagger.client.model.ContactAssociation;
import io.swagger.client.model.NameSchema;

/**
 * CustomersData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-02T16:07:39.798Z")
public class CustomersData {
  @SerializedName("customerIndex")
  private String customerIndex = null;

  @SerializedName("clientCustomerUid")
  private String clientCustomerUid = null;

  @SerializedName("customersName")
  private NameSchema customersName = null;

  @SerializedName("customerTypeCode")
  private String customerTypeCode = null;

  @SerializedName("customerCategoryCode")
  private String customerCategoryCode = null;

  @SerializedName("customerClassCode")
  private String customerClassCode = null;

  @SerializedName("customerImportanceCode")
  private String customerImportanceCode = null;

  @SerializedName("customerImportanceReason")
  private String customerImportanceReason = null;

  @SerializedName("correspondenceAddress")
  private Address correspondenceAddress = null;

  @SerializedName("contactAssociation")
  private ContactAssociation contactAssociation = null;

  public CustomersData customerIndex(String customerIndex) {
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

  public CustomersData clientCustomerUid(String clientCustomerUid) {
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

  public CustomersData customersName(NameSchema customersName) {
    this.customersName = customersName;
    return this;
  }

   /**
   * Get customersName
   * @return customersName
  **/
  @ApiModelProperty(required = true, value = "")
  public NameSchema getCustomersName() {
    return customersName;
  }

  public void setCustomersName(NameSchema customersName) {
    this.customersName = customersName;
  }

  public CustomersData customerTypeCode(String customerTypeCode) {
    this.customerTypeCode = customerTypeCode;
    return this;
  }

   /**
   * Get customerTypeCode
   * @return customerTypeCode
  **/
  @ApiModelProperty(example = "B2B", required = true, value = "")
  public String getCustomerTypeCode() {
    return customerTypeCode;
  }

  public void setCustomerTypeCode(String customerTypeCode) {
    this.customerTypeCode = customerTypeCode;
  }

  public CustomersData customerCategoryCode(String customerCategoryCode) {
    this.customerCategoryCode = customerCategoryCode;
    return this;
  }

   /**
   * CCLSCATE - Cerillion Ref data
   * @return customerCategoryCode
  **/
  @ApiModelProperty(example = "STANDARD", required = true, value = "CCLSCATE - Cerillion Ref data")
  public String getCustomerCategoryCode() {
    return customerCategoryCode;
  }

  public void setCustomerCategoryCode(String customerCategoryCode) {
    this.customerCategoryCode = customerCategoryCode;
  }

  public CustomersData customerClassCode(String customerClassCode) {
    this.customerClassCode = customerClassCode;
    return this;
  }

   /**
   * CCLSCLAS - Cerillion Ref data
   * @return customerClassCode
  **/
  @ApiModelProperty(example = "STANDARD", required = true, value = "CCLSCLAS - Cerillion Ref data")
  public String getCustomerClassCode() {
    return customerClassCode;
  }

  public void setCustomerClassCode(String customerClassCode) {
    this.customerClassCode = customerClassCode;
  }

  public CustomersData customerImportanceCode(String customerImportanceCode) {
    this.customerImportanceCode = customerImportanceCode;
    return this;
  }

   /**
   * Get customerImportanceCode
   * @return customerImportanceCode
  **/
  @ApiModelProperty(example = "Gold", value = "")
  public String getCustomerImportanceCode() {
    return customerImportanceCode;
  }

  public void setCustomerImportanceCode(String customerImportanceCode) {
    this.customerImportanceCode = customerImportanceCode;
  }

  public CustomersData customerImportanceReason(String customerImportanceReason) {
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

  public CustomersData correspondenceAddress(Address correspondenceAddress) {
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

  public CustomersData contactAssociation(ContactAssociation contactAssociation) {
    this.contactAssociation = contactAssociation;
    return this;
  }

   /**
   * Get contactAssociation
   * @return contactAssociation
  **/
  @ApiModelProperty(required = true, value = "")
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
    CustomersData customersData = (CustomersData) o;
    return Objects.equals(this.customerIndex, customersData.customerIndex) &&
        Objects.equals(this.clientCustomerUid, customersData.clientCustomerUid) &&
        Objects.equals(this.customersName, customersData.customersName) &&
        Objects.equals(this.customerTypeCode, customersData.customerTypeCode) &&
        Objects.equals(this.customerCategoryCode, customersData.customerCategoryCode) &&
        Objects.equals(this.customerClassCode, customersData.customerClassCode) &&
        Objects.equals(this.customerImportanceCode, customersData.customerImportanceCode) &&
        Objects.equals(this.customerImportanceReason, customersData.customerImportanceReason) &&
        Objects.equals(this.correspondenceAddress, customersData.correspondenceAddress) &&
        Objects.equals(this.contactAssociation, customersData.contactAssociation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerIndex, clientCustomerUid, customersName, customerTypeCode, customerCategoryCode, customerClassCode, customerImportanceCode, customerImportanceReason, correspondenceAddress, contactAssociation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomersData {\n");
    
    sb.append("    customerIndex: ").append(toIndentedString(customerIndex)).append("\n");
    sb.append("    clientCustomerUid: ").append(toIndentedString(clientCustomerUid)).append("\n");
    sb.append("    customersName: ").append(toIndentedString(customersName)).append("\n");
    sb.append("    customerTypeCode: ").append(toIndentedString(customerTypeCode)).append("\n");
    sb.append("    customerCategoryCode: ").append(toIndentedString(customerCategoryCode)).append("\n");
    sb.append("    customerClassCode: ").append(toIndentedString(customerClassCode)).append("\n");
    sb.append("    customerImportanceCode: ").append(toIndentedString(customerImportanceCode)).append("\n");
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

