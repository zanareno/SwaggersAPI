package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ContactAssociation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-26T11:46:21.112Z")
public class ContactAssociation {
  @SerializedName("ContactIndex")
  private String contactIndex = null;

  @SerializedName("ContactUid")
  private Integer contactUid = null;

  @SerializedName("AssociationType")
  private String associationType = null;

  @SerializedName("IsPrimary")
  private Boolean isPrimary = null;

  public ContactAssociation contactIndex(String contactIndex) {
    this.contactIndex = contactIndex;
    return this;
  }

   /**
   * The contact to be associated with the customer. Use the ContactIndex element to point to a new contact in the submission.  Use the ContactUid to point to an existing contact on Cerillion. NewContact-1 or 504 
   * @return contactIndex
  **/
  @ApiModelProperty(value = "The contact to be associated with the customer. Use the ContactIndex element to point to a new contact in the submission.  Use the ContactUid to point to an existing contact on Cerillion. NewContact-1 or 504 ")
  public String getContactIndex() {
    return contactIndex;
  }

  public void setContactIndex(String contactIndex) {
    this.contactIndex = contactIndex;
  }

  public ContactAssociation contactUid(Integer contactUid) {
    this.contactUid = contactUid;
    return this;
  }

   /**
   * Get contactUid
   * @return contactUid
  **/
  @ApiModelProperty(example = "504", value = "")
  public Integer getContactUid() {
    return contactUid;
  }

  public void setContactUid(Integer contactUid) {
    this.contactUid = contactUid;
  }

  public ContactAssociation associationType(String associationType) {
    this.associationType = associationType;
    return this;
  }

   /**
   * The type of association. E.g. BILLCONT = Global Billing customer Only 1 association of each type is permitted. 
   * @return associationType
  **/
  @ApiModelProperty(example = "BILLCONT", required = true, value = "The type of association. E.g. BILLCONT = Global Billing customer Only 1 association of each type is permitted. ")
  public String getAssociationType() {
    return associationType;
  }

  public void setAssociationType(String associationType) {
    this.associationType = associationType;
  }

  public ContactAssociation isPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * Get isPrimary
   * @return isPrimary
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getIsPrimary() {
    return isPrimary;
  }

  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactAssociation contactAssociation = (ContactAssociation) o;
    return Objects.equals(this.contactIndex, contactAssociation.contactIndex) &&
        Objects.equals(this.contactUid, contactAssociation.contactUid) &&
        Objects.equals(this.associationType, contactAssociation.associationType) &&
        Objects.equals(this.isPrimary, contactAssociation.isPrimary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactIndex, contactUid, associationType, isPrimary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactAssociation {\n");
    
    sb.append("    contactIndex: ").append(toIndentedString(contactIndex)).append("\n");
    sb.append("    contactUid: ").append(toIndentedString(contactUid)).append("\n");
    sb.append("    associationType: ").append(toIndentedString(associationType)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
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

