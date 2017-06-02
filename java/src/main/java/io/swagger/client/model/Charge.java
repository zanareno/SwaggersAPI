package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Discount;

/**
 * Charge
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-02T16:12:54.276Z")
public class Charge {
  @SerializedName("chargeCode")
  private String chargeCode = null;

  @SerializedName("discount")
  private Discount discount = null;

  public Charge chargeCode(String chargeCode) {
    this.chargeCode = chargeCode;
    return this;
  }

   /**
   * Get chargeCode
   * @return chargeCode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getChargeCode() {
    return chargeCode;
  }

  public void setChargeCode(String chargeCode) {
    this.chargeCode = chargeCode;
  }

  public Charge discount(Discount discount) {
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @ApiModelProperty(value = "")
  public Discount getDiscount() {
    return discount;
  }

  public void setDiscount(Discount discount) {
    this.discount = discount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Charge charge = (Charge) o;
    return Objects.equals(this.chargeCode, charge.chargeCode) &&
        Objects.equals(this.discount, charge.discount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeCode, discount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Charge {\n");
    
    sb.append("    chargeCode: ").append(toIndentedString(chargeCode)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
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

