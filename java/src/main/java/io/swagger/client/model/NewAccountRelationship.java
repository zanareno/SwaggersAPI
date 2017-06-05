package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NewAccountRelationship
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-05T14:58:16.387Z")
public class NewAccountRelationship {
  @SerializedName("clientAccountRelationshipUid")
  private String clientAccountRelationshipUid = null;

  @SerializedName("fromAccountIndex")
  private String fromAccountIndex = null;

  @SerializedName("fromAccountUid")
  private Integer fromAccountUid = null;

  @SerializedName("relationShipType")
  private Integer relationShipType = null;

  @SerializedName("toAccountIndex")
  private String toAccountIndex = null;

  @SerializedName("toAccountUid")
  private Integer toAccountUid = null;

  public NewAccountRelationship clientAccountRelationshipUid(String clientAccountRelationshipUid) {
    this.clientAccountRelationshipUid = clientAccountRelationshipUid;
    return this;
  }

   /**
   * A unique identifier supplied by the client to identify the relationship.
   * @return clientAccountRelationshipUid
  **/
  @ApiModelProperty(example = "NewAccountRelationship-1", required = true, value = "A unique identifier supplied by the client to identify the relationship.")
  public String getClientAccountRelationshipUid() {
    return clientAccountRelationshipUid;
  }

  public void setClientAccountRelationshipUid(String clientAccountRelationshipUid) {
    this.clientAccountRelationshipUid = clientAccountRelationshipUid;
  }

  public NewAccountRelationship fromAccountIndex(String fromAccountIndex) {
    this.fromAccountIndex = fromAccountIndex;
    return this;
  }

   /**
   * The 'from' account in the relationship.  Use the AccountIndex element to point to a new account in the submission.   Use the AccountUid to point to an existing account on Cerillion. 
   * @return fromAccountIndex
  **/
  @ApiModelProperty(example = "NewAccount-1", value = "The 'from' account in the relationship.  Use the AccountIndex element to point to a new account in the submission.   Use the AccountUid to point to an existing account on Cerillion. ")
  public String getFromAccountIndex() {
    return fromAccountIndex;
  }

  public void setFromAccountIndex(String fromAccountIndex) {
    this.fromAccountIndex = fromAccountIndex;
  }

  public NewAccountRelationship fromAccountUid(Integer fromAccountUid) {
    this.fromAccountUid = fromAccountUid;
    return this;
  }

   /**
   * Get fromAccountUid
   * @return fromAccountUid
  **/
  @ApiModelProperty(value = "")
  public Integer getFromAccountUid() {
    return fromAccountUid;
  }

  public void setFromAccountUid(Integer fromAccountUid) {
    this.fromAccountUid = fromAccountUid;
  }

  public NewAccountRelationship relationShipType(Integer relationShipType) {
    this.relationShipType = relationShipType;
    return this;
  }

   /**
   * Get relationShipType
   * @return relationShipType
  **/
  @ApiModelProperty(example = "3", required = true, value = "")
  public Integer getRelationShipType() {
    return relationShipType;
  }

  public void setRelationShipType(Integer relationShipType) {
    this.relationShipType = relationShipType;
  }

  public NewAccountRelationship toAccountIndex(String toAccountIndex) {
    this.toAccountIndex = toAccountIndex;
    return this;
  }

   /**
   * The 'to' account in the relationship.   Use the AccountIndex element to point to a new account in the submission.   Use the AccountUid to point to an existing account on Cerillion. 
   * @return toAccountIndex
  **/
  @ApiModelProperty(example = "NewAccount-1", value = "The 'to' account in the relationship.   Use the AccountIndex element to point to a new account in the submission.   Use the AccountUid to point to an existing account on Cerillion. ")
  public String getToAccountIndex() {
    return toAccountIndex;
  }

  public void setToAccountIndex(String toAccountIndex) {
    this.toAccountIndex = toAccountIndex;
  }

  public NewAccountRelationship toAccountUid(Integer toAccountUid) {
    this.toAccountUid = toAccountUid;
    return this;
  }

   /**
   * Get toAccountUid
   * @return toAccountUid
  **/
  @ApiModelProperty(example = "20000351", value = "")
  public Integer getToAccountUid() {
    return toAccountUid;
  }

  public void setToAccountUid(Integer toAccountUid) {
    this.toAccountUid = toAccountUid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewAccountRelationship newAccountRelationship = (NewAccountRelationship) o;
    return Objects.equals(this.clientAccountRelationshipUid, newAccountRelationship.clientAccountRelationshipUid) &&
        Objects.equals(this.fromAccountIndex, newAccountRelationship.fromAccountIndex) &&
        Objects.equals(this.fromAccountUid, newAccountRelationship.fromAccountUid) &&
        Objects.equals(this.relationShipType, newAccountRelationship.relationShipType) &&
        Objects.equals(this.toAccountIndex, newAccountRelationship.toAccountIndex) &&
        Objects.equals(this.toAccountUid, newAccountRelationship.toAccountUid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientAccountRelationshipUid, fromAccountIndex, fromAccountUid, relationShipType, toAccountIndex, toAccountUid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewAccountRelationship {\n");
    
    sb.append("    clientAccountRelationshipUid: ").append(toIndentedString(clientAccountRelationshipUid)).append("\n");
    sb.append("    fromAccountIndex: ").append(toIndentedString(fromAccountIndex)).append("\n");
    sb.append("    fromAccountUid: ").append(toIndentedString(fromAccountUid)).append("\n");
    sb.append("    relationShipType: ").append(toIndentedString(relationShipType)).append("\n");
    sb.append("    toAccountIndex: ").append(toIndentedString(toAccountIndex)).append("\n");
    sb.append("    toAccountUid: ").append(toIndentedString(toAccountUid)).append("\n");
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

