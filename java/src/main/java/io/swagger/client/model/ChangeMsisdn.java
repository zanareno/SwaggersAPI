package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ChangeMsisdn
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-05T14:58:16.387Z")
public class ChangeMsisdn {
  @SerializedName("msisdn")
  private String msisdn = null;

  @SerializedName("newMsisdn")
  private String newMsisdn = null;

  public ChangeMsisdn msisdn(String msisdn) {
    this.msisdn = msisdn;
    return this;
  }

   /**
   * Get msisdn
   * @return msisdn
  **/
  @ApiModelProperty(example = "66123456789", required = true, value = "")
  public String getMsisdn() {
    return msisdn;
  }

  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }

  public ChangeMsisdn newMsisdn(String newMsisdn) {
    this.newMsisdn = newMsisdn;
    return this;
  }

   /**
   * Get newMsisdn
   * @return newMsisdn
  **/
  @ApiModelProperty(example = "66123456790", required = true, value = "")
  public String getNewMsisdn() {
    return newMsisdn;
  }

  public void setNewMsisdn(String newMsisdn) {
    this.newMsisdn = newMsisdn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeMsisdn changeMsisdn = (ChangeMsisdn) o;
    return Objects.equals(this.msisdn, changeMsisdn.msisdn) &&
        Objects.equals(this.newMsisdn, changeMsisdn.newMsisdn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msisdn, newMsisdn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeMsisdn {\n");
    
    sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
    sb.append("    newMsisdn: ").append(toIndentedString(newMsisdn)).append("\n");
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

