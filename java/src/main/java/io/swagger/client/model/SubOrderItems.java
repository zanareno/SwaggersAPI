package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Charge;
import io.swagger.client.model.CustomAttribute;

/**
 * The set of constituent products take make up the top level package product. In Cerillion terms these are options within a package. 
 */
@ApiModel(description = "The set of constituent products take make up the top level package product. In Cerillion terms these are options within a package. ")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-05T14:58:16.387Z")
public class SubOrderItems {
  @SerializedName("productGroupCode")
  private String productGroupCode = null;

  @SerializedName("productCode")
  private String productCode = null;

  @SerializedName("productAttribute")
  private CustomAttribute productAttribute = null;

  @SerializedName("charge")
  private Charge charge = null;

  public SubOrderItems productGroupCode(String productGroupCode) {
    this.productGroupCode = productGroupCode;
    return this;
  }

   /**
   * Get productGroupCode
   * @return productGroupCode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getProductGroupCode() {
    return productGroupCode;
  }

  public void setProductGroupCode(String productGroupCode) {
    this.productGroupCode = productGroupCode;
  }

  public SubOrderItems productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

   /**
   * Get productCode
   * @return productCode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public SubOrderItems productAttribute(CustomAttribute productAttribute) {
    this.productAttribute = productAttribute;
    return this;
  }

   /**
   * Get productAttribute
   * @return productAttribute
  **/
  @ApiModelProperty(value = "")
  public CustomAttribute getProductAttribute() {
    return productAttribute;
  }

  public void setProductAttribute(CustomAttribute productAttribute) {
    this.productAttribute = productAttribute;
  }

  public SubOrderItems charge(Charge charge) {
    this.charge = charge;
    return this;
  }

   /**
   * Get charge
   * @return charge
  **/
  @ApiModelProperty(value = "")
  public Charge getCharge() {
    return charge;
  }

  public void setCharge(Charge charge) {
    this.charge = charge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubOrderItems subOrderItems = (SubOrderItems) o;
    return Objects.equals(this.productGroupCode, subOrderItems.productGroupCode) &&
        Objects.equals(this.productCode, subOrderItems.productCode) &&
        Objects.equals(this.productAttribute, subOrderItems.productAttribute) &&
        Objects.equals(this.charge, subOrderItems.charge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productGroupCode, productCode, productAttribute, charge);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubOrderItems {\n");
    
    sb.append("    productGroupCode: ").append(toIndentedString(productGroupCode)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    productAttribute: ").append(toIndentedString(productAttribute)).append("\n");
    sb.append("    charge: ").append(toIndentedString(charge)).append("\n");
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

